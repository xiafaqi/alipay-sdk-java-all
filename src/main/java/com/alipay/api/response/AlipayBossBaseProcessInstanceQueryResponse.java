package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.BPOpenApiInstance;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.base.process.instance.query response.
 * 
 * @author auto create
 * @since 1.0, 2017-09-19 20:53:07
 */
public class AlipayBossBaseProcessInstanceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7442496649538388536L;

	/** 
	 * 流程实例内容
	 */
	@ApiField("instance")
	private BPOpenApiInstance instance;

	public void setInstance(BPOpenApiInstance instance) {
		this.instance = instance;
	}
	public BPOpenApiInstance getInstance( ) {
		return this.instance;
	}

}