/**
 * SampleWebServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */
package com.smartbear;


/**
 *  SampleWebServiceCallbackHandler Callback class, Users can extend this class and implement
 *  their own receiveResult and receiveError methods.
 */
public abstract class SampleWebServiceCallbackHandler {
    protected Object clientData;

    /**
     * User can pass in any object that needs to be accessed once the NonBlocking
     * Web service call is finished and appropriate method of this CallBack is called.
     * @param clientData Object mechanism by which the user can pass in user data
     * that will be avilable at the time this callback is called.
     */
    public SampleWebServiceCallbackHandler(Object clientData) {
        this.clientData = clientData;
    }

    /**
     * Please use this constructor if you don't want to set any clientData
     */
    public SampleWebServiceCallbackHandler() {
        this.clientData = null;
    }

    /**
     * Get the client data
     */
    public Object getClientData() {
        return clientData;
    }

    /**
     * auto generated Axis2 call back method for setSampleObject method
     * override this method for handling normal response from setSampleObject operation
     */
    public void receiveResultsetSampleObject(
        com.smartbear.SetSampleObjectResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from setSampleObject operation
     */
    public void receiveErrorsetSampleObject(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for helloWorld method
     * override this method for handling normal response from helloWorld operation
     */
    public void receiveResulthelloWorld(
        com.smartbear.HelloWorldResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from helloWorld operation
     */
    public void receiveErrorhelloWorld(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getCurrentTime method
     * override this method for handling normal response from getCurrentTime operation
     */
    public void receiveResultgetCurrentTime(
        com.smartbear.GetCurrentTimeResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getCurrentTime operation
     */
    public void receiveErrorgetCurrentTime(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getArray method
     * override this method for handling normal response from getArray operation
     */
    public void receiveResultgetArray(
        com.smartbear.GetArrayResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getArray operation
     */
    public void receiveErrorgetArray(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getSampleObject method
     * override this method for handling normal response from getSampleObject operation
     */
    public void receiveResultgetSampleObject(
        com.smartbear.GetSampleObjectResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getSampleObject operation
     */
    public void receiveErrorgetSampleObject(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getXmlData method
     * override this method for handling normal response from getXmlData operation
     */
    public void receiveResultgetXmlData(
        com.smartbear.GetXmlDataResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getXmlData operation
     */
    public void receiveErrorgetXmlData(java.lang.Exception e) {
    }
}
