package com.atguigu.atcrowdfunding.util;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.repository.Deployment;
import org.activiti.engine.repository.DeploymentBuilder;
import org.activiti.engine.repository.ProcessDefinition;
import org.activiti.engine.repository.ProcessDefinitionQuery;
import org.activiti.engine.runtime.ProcessInstance;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ActUtil {

	/**
	 * 获取流程框架的核心对象,流程引擎
	 * @return
	 */
	public static ProcessEngine getProcessEngine() {
		
		ApplicationContext application =
				new ClassPathXmlApplicationContext("spring/spring-*.xml");
			
			
		ProcessEngine processEngine =
			(ProcessEngine)application.getBean("processEngine");
		return processEngine;
	}
	
	/**
	 * 部署流程
	 */
	public static void  deployment(String procDefFileName) {
			
		//获取流程引擎
		RepositoryService repositoryService = 
				getProcessEngine().getRepositoryService();
		//完成部署
		DeploymentBuilder builder = 
				repositoryService.createDeployment();
		
		Deployment deployment = 
				builder.addClasspathResource(procDefFileName).deploy();
	}
	/**
	 * 根据Id获取流程实例,
	 */
	public static ProcessInstance  startProcessInstanceById( String procDefId) {
		
		//获取流程引擎
		
				ProcessInstance processInstance = 
						getProcessEngine().getRuntimeService().startProcessInstanceById(procDefId);
		return processInstance;
	}
	/**
	 * 根据KEY值获取流程实例
	 */
	public static ProcessInstance startProcessInstanceByKey( String procDefKey){
		ProcessDefinitionQuery query =
				getProcessEngine().getRepositoryService().createProcessDefinitionQuery();
		ProcessDefinition processDefinition =
				query.processDefinitionKey(procDefKey).latestVersion().singleResult();
		
		return startProcessInstanceById(processDefinition.getId());
	}
	
	
}
