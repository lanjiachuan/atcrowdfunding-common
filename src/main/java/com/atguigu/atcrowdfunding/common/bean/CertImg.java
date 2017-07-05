package com.atguigu.atcrowdfunding.common.bean;

import org.springframework.web.multipart.MultipartFile;

/**
 * 
 *资质文件上传
 */
public class CertImg {

	//资质文件会员绑定
	private Integer memberid;
	private Integer certid;
	private MultipartFile certImg;
	//文件存储地址
	private String iconpath;
	
	
	
	public String getIconpath() {
		return iconpath;
	}
	public void setIconpath(String iconpath) {
		this.iconpath = iconpath;
	}
	public Integer getMemberid() {
		return memberid;
	}
	public void setMemberid(Integer memberid) {
		this.memberid = memberid;
	}
	public Integer getCertid() {
		return certid;
	}
	public void setCertid(Integer certid) {
		this.certid = certid;
	}
	public MultipartFile getCertImg() {
		return certImg;
	}
	public void setCertImg(MultipartFile certImg) {
		this.certImg = certImg;
	}
	
}
