package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分账条款明细
 *
 * @author auto create
 * @since 1.0, 2019-09-09 11:25:30
 */
public class RoyaltyDetailInfo extends AlipayObject {

	private static final long serialVersionUID = 6438521457655511474L;

	/**
	 * 分账金额，单位为元
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 分账描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 分账转入账户id。当分账账户id类型是cardSerialNo时，本参数为用户在支付宝绑定的卡编号；当分账账户id类型是userId时，本参数为用户的支付宝账号对应的支付宝唯一用户号；当分账账户id类型是loginName时，本参数为用户的支付宝登录号
	 */
	@ApiField("trans_in_account_id")
	private String transInAccountId;

	/**
	 * 分账转入账户id类型。 当settle_account_type 为bankCard时，本参数为cardSerialNo，表示分账账户id是银行卡编号; 当settle_account_type 为alipayBalance时，本参数为userId或者loginName，其中userId表示分账账户id是支付宝唯一用户号，loginName表示分账账户id是支付宝登录号
	 */
	@ApiField("trans_in_account_id_type")
	private String transInAccountIdType;

	/**
	 * 分账账 户类型。 bankCard: 分账账户为银行卡； alipayBalance: 分账账户为支付宝余额户
	 */
	@ApiField("trans_in_account_type")
	private String transInAccountType;

	/**
	 * 分账转出主体账 号。

当分账转出主体类型为SecondMerchant，本参数为二级商户的SecondMerchantID

当分账转出类型为Store，本参数为StoreID
	 */
	@ApiField("trans_in_entity_id")
	private String transInEntityId;

	/**
	 * 分账转入主体类型。 SecondMerchant：分账转入主体为二级商户

Store: 结算门店
	 */
	@ApiField("trans_in_entity_type")
	private String transInEntityType;

	/**
	 * 转入方二级商户信息
	 */
	@ApiField("trans_in_sub_merchant")
	private SubMerchant transInSubMerchant;

	/**
	 * 分账转出主体账。

当分账转出主体类型为SecondMerchant，本参数为二级商户的SecondMerchantId

当分账转出类型为Store，本参数为StoreID
	 */
	@ApiField("trans_out_entity_id")
	private String transOutEntityId;

	/**
	 * 分账转出主体类型。 SecondMerchant：结算主体为二级商户

Store: 结算门店
	 */
	@ApiField("trans_out_entity_type")
	private String transOutEntityType;

	/**
	 * 转出方二级商户信息
	 */
	@ApiField("trans_out_sub_merchant")
	private SubMerchant transOutSubMerchant;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getTransInAccountId() {
		return this.transInAccountId;
	}
	public void setTransInAccountId(String transInAccountId) {
		this.transInAccountId = transInAccountId;
	}

	public String getTransInAccountIdType() {
		return this.transInAccountIdType;
	}
	public void setTransInAccountIdType(String transInAccountIdType) {
		this.transInAccountIdType = transInAccountIdType;
	}

	public String getTransInAccountType() {
		return this.transInAccountType;
	}
	public void setTransInAccountType(String transInAccountType) {
		this.transInAccountType = transInAccountType;
	}

	public String getTransInEntityId() {
		return this.transInEntityId;
	}
	public void setTransInEntityId(String transInEntityId) {
		this.transInEntityId = transInEntityId;
	}

	public String getTransInEntityType() {
		return this.transInEntityType;
	}
	public void setTransInEntityType(String transInEntityType) {
		this.transInEntityType = transInEntityType;
	}

	public SubMerchant getTransInSubMerchant() {
		return this.transInSubMerchant;
	}
	public void setTransInSubMerchant(SubMerchant transInSubMerchant) {
		this.transInSubMerchant = transInSubMerchant;
	}

	public String getTransOutEntityId() {
		return this.transOutEntityId;
	}
	public void setTransOutEntityId(String transOutEntityId) {
		this.transOutEntityId = transOutEntityId;
	}

	public String getTransOutEntityType() {
		return this.transOutEntityType;
	}
	public void setTransOutEntityType(String transOutEntityType) {
		this.transOutEntityType = transOutEntityType;
	}

	public SubMerchant getTransOutSubMerchant() {
		return this.transOutSubMerchant;
	}
	public void setTransOutSubMerchant(SubMerchant transOutSubMerchant) {
		this.transOutSubMerchant = transOutSubMerchant;
	}

}