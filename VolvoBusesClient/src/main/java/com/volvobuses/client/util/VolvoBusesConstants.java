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
	 * Cadenas
	 */
	public static final String CERO = "0";
	
	public final static String VALIDACION_CAMPO_OBLIGATORIO = "obligatorio";

	public static final String ACTIVO = "1";
	
	public static final String CADENA_UNO = "1";
	
	/***
	 * Fechas
	 */
	public final static int FERIADO_ANYO_NUEVO = 1;
	public final static int FERIADO_DIA_TRABAJADOR = 1;
	public final static int FERIADO_DIA_SAN_PEDRO_SAN_PABLO = 29;
	public final static int FERIADO_DIA_INDEPENDENCIA = 28;
	public final static int FERIADO_DIA_FIESTAS_PATRIAS = 29;
	public final static int FERIADO_SANTA_ROSA_LIMA = 30;
	public final static int FERIADO_COMBATE_ANGAMOS = 8;
	public final static int FERIADO_DIA_TODOS_LOS_SANTOS = 1;
	public final static int FERIADO_DIA_VIRGEN_INMACULADA = 8;
	public final static int FERIADO_NAVIDAD = 25;
	
	public final static String HORAS = "hh";
	public final static String MINUTOS = "mm";
	public final static String SEGUNDOS = "ss";
	
	public static final int CERO_SEGUNDOS = 0;
	
	/***
	 * Caracteres Especiales
	 */
	public final static String VACIO = "";
	public final static String ESPACIO = " ";
	public final static String DOS_PUNTOS = ":";
	public final static String BACK_SLASH = "\\";
	public final static String SLASH = "/";
	public final static String PUNTO = ".";
	public final static String TAB = "\t";
	public final static String NUEVA_LINEA = "\n";
	public final static String GUION = "-";
	public final static String GUION_ABAJO = "_";
	public final static String ASTERISCO = "*";
	public static final String PLECA = "|";
	public final static String PUNTO_Y_COMA = ";";
	public final static String COMA = ",";
	public static final String PORCENTAJE = "%";
	public static final String NO_TIENE = "NO TIENE";
	
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
	
	/**
	 * Eventos
	 */
	public static final String OVERSPEED_EXCEEDED = "OVERSPEED_EXCEEDED";
	public static final String PANIC_ALARM_ACTIVATE = "PANIC_ALARM_ACTIVATE";
}
