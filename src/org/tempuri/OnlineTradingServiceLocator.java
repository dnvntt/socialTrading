/**
 * OnlineTradingServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class OnlineTradingServiceLocator extends org.apache.axis.client.Service implements org.tempuri.OnlineTradingService {

    public OnlineTradingServiceLocator() {
    }


    public OnlineTradingServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public OnlineTradingServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for OnlineTradingServiceSoap
    private java.lang.String OnlineTradingServiceSoap_address = "http://10.26.53.91/BOProxyServiceNew/OnlineTradingService.asmx";

    public java.lang.String getOnlineTradingServiceSoapAddress() {
        return OnlineTradingServiceSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String OnlineTradingServiceSoapWSDDServiceName = "OnlineTradingServiceSoap";

    public java.lang.String getOnlineTradingServiceSoapWSDDServiceName() {
        return OnlineTradingServiceSoapWSDDServiceName;
    }

    public void setOnlineTradingServiceSoapWSDDServiceName(java.lang.String name) {
        OnlineTradingServiceSoapWSDDServiceName = name;
    }

    public org.tempuri.OnlineTradingServiceSoap getOnlineTradingServiceSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(OnlineTradingServiceSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getOnlineTradingServiceSoap(endpoint);
    }

    public org.tempuri.OnlineTradingServiceSoap getOnlineTradingServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.tempuri.OnlineTradingServiceSoapStub _stub = new org.tempuri.OnlineTradingServiceSoapStub(portAddress, this);
            _stub.setPortName(getOnlineTradingServiceSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setOnlineTradingServiceSoapEndpointAddress(java.lang.String address) {
        OnlineTradingServiceSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.tempuri.OnlineTradingServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                org.tempuri.OnlineTradingServiceSoapStub _stub = new org.tempuri.OnlineTradingServiceSoapStub(new java.net.URL(OnlineTradingServiceSoap_address), this);
                _stub.setPortName(getOnlineTradingServiceSoapWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("OnlineTradingServiceSoap".equals(inputPortName)) {
            return getOnlineTradingServiceSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org", "OnlineTradingService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org", "OnlineTradingServiceSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("OnlineTradingServiceSoap".equals(portName)) {
            setOnlineTradingServiceSoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
