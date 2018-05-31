/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Copyright (C) 2017 NEMESIS (Lima - Peru)
 * Sistemas - Desarrollo de Sistemas Informaticos
 * Luis Bustamante Villar lbustamante@nemesisdata.com 
 * All rights reserved. Used by permission
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 **/
package com.sutran.client.main;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sutran.client.util.SutranClientConstants;

public class SutranClientMain {

	static final Logger logger = LogManager.getLogger(SutranClientMain.class.getName());

	public static void main(String[] args) {
		try {			
			new ClassPathXmlApplicationContext(SutranClientConstants.CONTEXT_PATHS);			
		} 
		catch (Exception e) {
			logger.error("Error en inicio de contexto: ", e);
		}
	}
}
