package com.atguigu.atcrowdfunding.listener;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.ExecutionListener;

public class AuthRefuseListener implements ExecutionListener {

	public void notify(DelegateExecution execution) throws Exception {
		System.out.println("审核拒绝");
	}

}
