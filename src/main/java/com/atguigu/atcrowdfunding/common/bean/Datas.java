package com.atguigu.atcrowdfunding.common.bean;

import java.util.List;

/**
 * 数据包装类
 * 
 * @author yangge
 * 
 */
public class Datas {

	private List<User> datas;
	private List<Integer> dataIds;
	private List<CertImg> certImgs;
	
	public List<CertImg> getCertImgs() {
		return certImgs;
	}

	public void setCertImgs(List<CertImg> certImgs) {
		this.certImgs = certImgs;
	}

	public List<Integer> getDataIds() {
		return dataIds;
	}

	public void setDataIds(List<Integer> dataIds) {
		this.dataIds = dataIds;
	}

	private List<Role> datasRole;

	public List<User> getDatas() {
		return datas;
	}

	public void setDatas(List<User> datas) {
		this.datas = datas;
	}

	public List<Role> getDatasRole() {
		return datasRole;
	}

	public void setDatasRole(List<Role> datasRole) {
		this.datasRole = datasRole;
	}
}
