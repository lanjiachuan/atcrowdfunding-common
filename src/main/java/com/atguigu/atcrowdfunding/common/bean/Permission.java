package com.atguigu.atcrowdfunding.common.bean;

import java.util.ArrayList;
import java.util.List;

public class Permission {

	private Integer id;
	//当前节点的名字
	private String name;
	//树状图的打开状态
	private boolean open = true;
	//存放节点的地址
	private String url;
	//父节点
	private Integer pid;
	//icon属性
	private String icon;
	//存入子节点信息
	private List<Permission> children = new ArrayList<Permission>();
	
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public List<Permission> getChildren() {
		return children;
	}
	public void setChildren(List<Permission> children) {
		this.children = children;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isOpen() {
		return open;
	}
	public void setOpen(boolean open) {
		this.open = open;
	}
	
}
