package com.sutran.client.main;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

import com.sutran.client.service.SutranClientService;
import com.wirelesscar.dynafleet.api.DynafleetAPIException;

public class SutranClientScheduledJob extends QuartzJobBean {

	private static final Logger logger = LogManager.getLogger(SutranClientScheduledJob.class);

	private SutranClientService sutranClientService;

	protected void executeInternal(JobExecutionContext arg0) throws JobExecutionException {
		try {			
			sutranClientService.startConectionDynafleeApi();
		} catch (DynafleetAPIException e) {
			logger.error("Error DynafleetAPIException: ", e);
			logger.error("Descripcion: " + e.getFaultInfo().getExceptionInfo().getDescription());
			logger.error("Error Code: " + e.getFaultInfo().getExceptionInfo().getErrorCode());
			logger.error("Id: " + e.getFaultInfo().getExceptionInfo().getId());
		} catch (Exception e) {
			logger.error("Error Exception: ", e);
		}
	}

	public void setSutranClientService(SutranClientService sutranClientService) {
		this.sutranClientService = sutranClientService;
	}
}