package com.smartbear;

import java.net.MalformedURLException;
import java.rmi.RemoteException;

import com.smartbear.impl.HelloWorldDocumentImpl.HelloWorldImpl;

public class UsarServicio {

	public static void main(String[] args) throws MalformedURLException, RemoteException {
		String url = "http://secure.smartbearsoftware.com/samples/testcomplete14/webservices/Service.asmx?wsdl";
		SampleWebServiceStub servicio = new SampleWebServiceStub(null, url);

		org.apache.xmlbeans.SchemaType x;

		HelloWorldImpl aux = new HelloWorldImpl(null);

		HelloWorldDocument je;

		System.out.println("Resultado: " + je.toString());
	}
}
