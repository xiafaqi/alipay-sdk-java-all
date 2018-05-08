package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发件人信息
 *
 * @author auto create
 * @since 1.0, 2018-04-26 16:39:13
 */
public class SenderInfoVO extends AlipayObject {

	private static final long serialVersionUID = 3329993442384325443L;

	/**
	 * 区域
	 */
	@ApiField("area")
	private String area;

	/**
	 * 城市
	 */
	@ApiField("city")
	private String city;

	/**
	 * 详细地址
	 */
	@ApiField("detail_address")
	private String detailAddress;

	/**
	 * 发货人电话
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 发货人
	 */
	@ApiField("name")
	private String name;

	/**
	 * 省份
	 */
	@ApiField("province")
	private String province;

	public String getArea() {
		return this.area;
	}
	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getDetailAddress() {
		return this.detailAddress;
	}
	public void setDetailAddress(String detailAddress) {
		this.detailAddress = detailAddress;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getProvince() {
		return this.province;
	}
	public void setProvince(String province) {
		this.province = province;
	}

}