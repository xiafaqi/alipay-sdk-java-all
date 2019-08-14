package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序版本信息
 *
 * @author auto create
 * @since 1.0, 2019-08-12 20:20:04
 */
public class MiniAppVersionInfo extends AlipayObject {

	private static final long serialVersionUID = 2143999376818227447L;

	/**
	 * Android客户端版本号信息
	 */
	@ApiField("android_client_version_info")
	private MiniAppClientVersionInfo androidClientVersionInfo;

	/**
	 * 版本号
	 */
	@ApiField("app_version")
	private String appVersion;

	/**
	 * 小程序构建日志地址
	 */
	@ApiField("build_task_log")
	private String buildTaskLog;

	/**
	 * 覆盖率包信息
	 */
	@ApiField("coverage_package")
	private MiniAppPackageInfo coveragePackage;

	/**
	 * 覆盖率完成度
	 */
	@ApiField("coverage_rate")
	private Long coverageRate;

	/**
	 * iOS客户端版本号信息
	 */
	@ApiField("ios_client_version_info")
	private MiniAppClientVersionInfo iosClientVersionInfo;

	/**
	 * 小程序预发包信息
	 */
	@ApiField("preonline_package")
	private MiniAppPackageInfo preonlinePackage;

	/**
	 * 安全扫描结果
True:安全扫描通过
False:安全扫描不通过
NAN:扫描中
	 */
	@ApiField("security_scan_result")
	private String securityScanResult;

	/**
	 * 版本状态
PACKAGING:打包中
PACKAGE_FAILED:打包失败
PACKAGE_SUCCEED:打包完成
PACKAGE_DELETED:版本已删除
PRE_ONLINE:预发中
PRE_ONLINE_CONFIRM:预发完成
RELEASE:发布完成
OFFLINE:已下架
	 */
	@ApiField("status")
	private String status;

	public MiniAppClientVersionInfo getAndroidClientVersionInfo() {
		return this.androidClientVersionInfo;
	}
	public void setAndroidClientVersionInfo(MiniAppClientVersionInfo androidClientVersionInfo) {
		this.androidClientVersionInfo = androidClientVersionInfo;
	}

	public String getAppVersion() {
		return this.appVersion;
	}
	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

	public String getBuildTaskLog() {
		return this.buildTaskLog;
	}
	public void setBuildTaskLog(String buildTaskLog) {
		this.buildTaskLog = buildTaskLog;
	}

	public MiniAppPackageInfo getCoveragePackage() {
		return this.coveragePackage;
	}
	public void setCoveragePackage(MiniAppPackageInfo coveragePackage) {
		this.coveragePackage = coveragePackage;
	}

	public Long getCoverageRate() {
		return this.coverageRate;
	}
	public void setCoverageRate(Long coverageRate) {
		this.coverageRate = coverageRate;
	}

	public MiniAppClientVersionInfo getIosClientVersionInfo() {
		return this.iosClientVersionInfo;
	}
	public void setIosClientVersionInfo(MiniAppClientVersionInfo iosClientVersionInfo) {
		this.iosClientVersionInfo = iosClientVersionInfo;
	}

	public MiniAppPackageInfo getPreonlinePackage() {
		return this.preonlinePackage;
	}
	public void setPreonlinePackage(MiniAppPackageInfo preonlinePackage) {
		this.preonlinePackage = preonlinePackage;
	}

	public String getSecurityScanResult() {
		return this.securityScanResult;
	}
	public void setSecurityScanResult(String securityScanResult) {
		this.securityScanResult = securityScanResult;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}