package com.example.workflow.delegate;

import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component
public class UpdateLeaveDelegate implements JavaDelegate{
	
	 private final Logger LOGGER = Logger.getLogger(UpdateLeaveDelegate.class.getName());

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		
   String leaveType = (String) execution.getVariable("leaveType");
		
		LOGGER.info("leaveType is >>> " + leaveType);
		
		 LOGGER.info("\n\n  ... Update Leave invoked by "
		            + "activtyName='" + execution.getCurrentActivityName() + "'"
		            + ", activtyId=" + execution.getCurrentActivityId()
		            + ", processDefinitionId=" + execution.getProcessDefinitionId()
		            + ", processInstanceId=" + execution.getProcessInstanceId()
		            + ", businessKey=" + execution.getProcessBusinessKey()
		            + ", executionId=" + execution.getId()
		            + ", variables=" + execution.getVariables()
		            + " \n\n");
	}

}
