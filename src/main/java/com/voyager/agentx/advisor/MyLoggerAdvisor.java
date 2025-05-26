package com.voyager.agentx.advisor;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;

import org.springframework.ai.chat.client.advisor.api.AdvisedRequest;
import org.springframework.ai.chat.client.advisor.api.AdvisedResponse;
import org.springframework.ai.chat.client.advisor.api.CallAroundAdvisor;
import org.springframework.ai.chat.client.advisor.api.CallAroundAdvisorChain;
import org.springframework.ai.chat.client.advisor.api.StreamAroundAdvisor;
import org.springframework.ai.chat.client.advisor.api.StreamAroundAdvisorChain;
import org.springframework.ai.chat.model.MessageAggregator;

/**
 * 自定义日志 Advisor
 * 打印 info 级别日志、只输出单次用户提示词和 AI 回复的文本
 */
@Slf4j
public class MyLoggerAdvisor implements CallAroundAdvisor, StreamAroundAdvisor {

	/**
	 * 获取当前类的简单名称作为组件名称
	 */
	@Override
	public String getName() {
		return this.getClass().getSimpleName();
	}

	/**
	 * 定义当前 Advisor 的执行顺序
	 * 数值越小优先级越高
	 */
	@Override
	public int getOrder() {
		return 0;
	}

	/**
	 * 在请求前记录用户输入内容
	 * @param request 当前的请求对象
	 * @return 修改后的请求对象
	 */
	private AdvisedRequest before(AdvisedRequest request) {
		log.info("AI Request: {}", request.userText());
		return request;
	}

	/**
	 * 在响应后记录 AI 返回的文本内容
	 * @param advisedResponse 响应对象
	 */
	private void observeAfter(AdvisedResponse advisedResponse) {
		log.info("AI Response: {}", advisedResponse.response().getResult().getOutput().getText());
	}

	/**
	 * 同步调用处理方法
	 * 执行请求前的日志记录，调用链中的下一个 Advisor，并执行后置处理
	 * @param advisedRequest 请求对象
	 * @param chain 调用链
	 * @return 响应结果
	 */
	@Override
	public AdvisedResponse aroundCall(AdvisedRequest advisedRequest, CallAroundAdvisorChain chain) {

		advisedRequest = before(advisedRequest);

		AdvisedResponse advisedResponse = chain.nextAroundCall(advisedRequest);

		observeAfter(advisedResponse);

		return advisedResponse;
	}

	/**
	 * 异步流式调用处理方法
	 * 支持响应式编程模型，用于处理流式数据
	 * @param advisedRequest 请求对象
	 * @param chain 流式调用链
	 * @return Flux<AdvisedResponse> 处理后的响应流
	 */
	@Override
	public Flux<AdvisedResponse> aroundStream(AdvisedRequest advisedRequest, StreamAroundAdvisorChain chain) {

		advisedRequest = before(advisedRequest);

		Flux<AdvisedResponse> advisedResponses = chain.nextAroundStream(advisedRequest);

		return new MessageAggregator().aggregateAdvisedResponse(advisedResponses, this::observeAfter);
	}

}
