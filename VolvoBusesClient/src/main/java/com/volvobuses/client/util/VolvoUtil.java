package com.volvobuses.client.util;

public class VolvoUtil {

	/***
	 * Metodo para obtener el rumbo en radianes
	 * @param src Rumbo obtenido de las coordenadas GPS
	 * @param dst Rumbo destino
	 * @return El rumbo en radianes
	 */
	public static double bearingInRadians(LatLng src, LatLng dst) {
	    double srcLat = Math.toRadians(src.getLatitude());
	    double dstLat = Math.toRadians(dst.getLatitude());
	    double dLng = Math.toRadians(dst.getLongitude() - src.getLongitude());

	    return Math.atan2(Math.sin(dLng) * Math.cos(dstLat),
	            Math.cos(srcLat) * Math.sin(dstLat) - 
	              Math.sin(srcLat) * Math.cos(dstLat) * Math.cos(dLng));
	}

	/**
	 * Metodo para obtener el rumbo en grados
	 * @param src Rumbo obtenido de las coordenadas GPS
	 * @param dst Rumbo destino
	 * @return El rumbo en grados
	 */
	public static double bearingInDegrees(LatLng src, LatLng dst) {
	    return Math.toDegrees((bearingInRadians(src, dst) + Math.PI) % Math.PI);
	}
}