package com.volvobuses.client.main;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

import com.volvobuses.client.service.VolvoBusesService;

public class VolvoBusesScheduledJob extends QuartzJobBean {

	private static final Logger logger = LogManager.getLogger(VolvoBusesScheduledJob.class);

	private VolvoBusesService volvoBusesService;

	protected void executeInternal(JobExecutionContext arg0) throws JobExecutionException {
		try {			
			volvoBusesService.startConectionDynafleeApi();
		} catch (Exception e) {
			logger.error("Error en ejecutar servicio : ", e);
		}
	}

	public void setVolvoBusesService(VolvoBusesService volvoBusesService) {
		this.volvoBusesService = volvoBusesService;
	}
}