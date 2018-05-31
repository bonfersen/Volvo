
package org.tempuri;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.18
 * 2018-05-30T22:48:28.213-05:00
 * Generated source version: 2.7.18
 */

@WebFault(name = "FleetMgmtException", targetNamespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Service.Data.Exception")
public class IExternalFleetMgmtServiceGetVehicleSpeedIntervalsFleetMgmtExceptionFaultFaultMessage extends Exception {
    
    private org.datacontract.schemas._2004._07.tmix_cap_fleetmgmt_library_wcf_external_service_data.FleetMgmtException fleetMgmtException;

    public IExternalFleetMgmtServiceGetVehicleSpeedIntervalsFleetMgmtExceptionFaultFaultMessage() {
        super();
    }
    
    public IExternalFleetMgmtServiceGetVehicleSpeedIntervalsFleetMgmtExceptionFaultFaultMessage(String message) {
        super(message);
    }
    
    public IExternalFleetMgmtServiceGetVehicleSpeedIntervalsFleetMgmtExceptionFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public IExternalFleetMgmtServiceGetVehicleSpeedIntervalsFleetMgmtExceptionFaultFaultMessage(String message, org.datacontract.schemas._2004._07.tmix_cap_fleetmgmt_library_wcf_external_service_data.FleetMgmtException fleetMgmtException) {
        super(message);
        this.fleetMgmtException = fleetMgmtException;
    }

    public IExternalFleetMgmtServiceGetVehicleSpeedIntervalsFleetMgmtExceptionFaultFaultMessage(String message, org.datacontract.schemas._2004._07.tmix_cap_fleetmgmt_library_wcf_external_service_data.FleetMgmtException fleetMgmtException, Throwable cause) {
        super(message, cause);
        this.fleetMgmtException = fleetMgmtException;
    }

    public org.datacontract.schemas._2004._07.tmix_cap_fleetmgmt_library_wcf_external_service_data.FleetMgmtException getFaultInfo() {
        return this.fleetMgmtException;
    }
}
