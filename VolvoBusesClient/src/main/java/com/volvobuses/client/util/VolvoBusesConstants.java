package com.volvobuses.client.util;

import javax.xml.namespace.QName;

public class VolvoBusesConstants {
	
	public static final QName SERVICE_NAME = new QName("http://tempuri.org/", "FleetMgmtService");
	
	/*
	 * URL Webservice
	 */
	public static final String WEBSERVICE_DYNAFLEET_URL = "https://fm.servicesvolvobuses.com/Tmix.Cap.FleetMgmt.Library.Wcf.External/1.4/FleetMgmtService.svc?wsdl";
	
	public static final String[] CONTEXT_PATHS = new String[] {
			"classpath:/META-INF/spring/volvoBusesClientApplicationContext.xml", 
			"classpath:/META-INF/spring/volvoBusesClientApplicationContext-service.xml",
			"classpath:/META-INF/spring/volvoBusesClientQuartzContext-config.xml"};

	/**
	 * Tiempo de inicio de un nuevo hilo, establecido a una hora
	 */
	public static final long TIEMPO_ESPERA_CONSUMO_WEBSERVICE_VEHICULO = new Long("3600000");
	/**
	 * Tiempo de espera de consumo entre cada 20 metodos
	 */
	public static final long TIEMPO_ESPERA_CONSUMO_WEBSERVICE_POR_METODO = new Long("10000");
	/**
	 * Tiempo de espera de consumo entre cada 20 inicios de sesion
	 */
	public static final long TIEMPO_ESPERA_CONSUMO_WEBSERVICE_POR_LOGIN = new Long("60000");
	
	public static final short MAX_CANTIDAD_CONSUMOS_LOGIN = 19;
	
	public static final short MAX_CANTIDAD_CONSUMOS_METODO = 19;
	
	/**
	 * Cero
	 */
	public static final String CERO = "0";
	
	public final static String VALIDACION_CAMPO_OBLIGATORIO = "obligatorio";

	public static final String ACTIVO = "1";
	
	/**
	 * 
	 */
	public static final String CADENA_UNO = "1";
	
	/**
	 * Constante de parametricas
	 */
	public static final String URL_TELEMETRIA_BUSES = "UTBU001";
	public static final String METODO_TELEMETRIA_BUSES_LOGIN = "MTBU001";
	public static final String METODO_TELEMETRIA_BUSES_VEHICLES = "MTBU002";
	public static final String METODO_TELEMETRIA_BUSES_VEHICLE_POSITIONS = "MTBU003";
	public static final String METODO_TELEMETRIA_BUSES_VEHICLE_EVENTS = "MTBU004";
	public static final String METODO_TELEMETRIA_BUSES_DRIVERS = "MTBU005";
	public static final String METODO_TELEMETRIA_BUSES_DRIVER_SPEED_INTERVAL = "MTBU006";
	public static final String TIEMPO_HORAS_CONSUMO_TELEMETRIA_BUSES = "TCTB001";
}
