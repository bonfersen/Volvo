/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Copyright (C) 2018 NEMESIS (Lima - Peru)
 * Sistemas - Desarrollo de Sistemas Informaticos
 * Luis Bustamante Villar lbustamante@nemesisdata.com 
 * All rights reserved. Used by permission
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 **/
package com.volvobuses.client.main;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.volvobuses.client.util.VolvoBusesConstants;

public class VolvoBusesMain {

	static final Logger logger = LogManager.getLogger(VolvoBusesMain.class.getName());

	public static void main(String[] args) {
		try {			
			new ClassPathXmlApplicationContext(VolvoBusesConstants.CONTEXT_PATHS);			
		} 
		catch (Exception e) {
			logger.error("Error en inicio de contexto: ", e);
		}
	}
}
