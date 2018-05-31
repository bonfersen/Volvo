package com.sutran.client.util;

import javax.xml.namespace.QName;

public class SutranClientConstants {
	
	public static final QName SERVICE_NAME = new QName("http://wirelesscar.com/dynafleet/api", "DynafleetAPI");
	
	/*
	 * URL Webservice
	 */
	//public static final String WEBSERVICE_DYNAFLEET_URL = "https://api-preprod.dynafleetonline.com/wsdl";
	public static final String WEBSERVICE_DYNAFLEET_URL = "https://api2.dynafleetonline.com/wsdl";
	
	public static final String[] CONTEXT_PATHS = new String[] {
			"classpath:/META-INF/spring/sutranClientApplicationContext.xml", 
			"classpath:/META-INF/spring/sutranClientApplicationContext-service.xml",
			"classpath:/META-INF/spring/sutranQuartzContext-config.xml"};

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
}
