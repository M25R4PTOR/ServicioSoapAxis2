/*
 * An XML document type.
 * Localname: HelloWorldResponse
 * Namespace: http://smartbear.com
 * Java type: com.smartbear.HelloWorldResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.smartbear.impl;
/**
 * A document containing one HelloWorldResponse(@http://smartbear.com) element.
 *
 * This is a complex type.
 */
public class HelloWorldResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.smartbear.HelloWorldResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public HelloWorldResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HELLOWORLDRESPONSE$0 = 
        new javax.xml.namespace.QName("http://smartbear.com", "HelloWorldResponse");
    
    
    /**
     * Gets the "HelloWorldResponse" element
     */
    public com.smartbear.HelloWorldResponseDocument.HelloWorldResponse getHelloWorldResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.smartbear.HelloWorldResponseDocument.HelloWorldResponse target = null;
            target = (com.smartbear.HelloWorldResponseDocument.HelloWorldResponse)get_store().find_element_user(HELLOWORLDRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "HelloWorldResponse" element
     */
    public void setHelloWorldResponse(com.smartbear.HelloWorldResponseDocument.HelloWorldResponse helloWorldResponse)
    {
        generatedSetterHelperImpl(helloWorldResponse, HELLOWORLDRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "HelloWorldResponse" element
     */
    public com.smartbear.HelloWorldResponseDocument.HelloWorldResponse addNewHelloWorldResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.smartbear.HelloWorldResponseDocument.HelloWorldResponse target = null;
            target = (com.smartbear.HelloWorldResponseDocument.HelloWorldResponse)get_store().add_element_user(HELLOWORLDRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML HelloWorldResponse(@http://smartbear.com).
     *
     * This is a complex type.
     */
    public static class HelloWorldResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.smartbear.HelloWorldResponseDocument.HelloWorldResponse
    {
        private static final long serialVersionUID = 1L;
        
        public HelloWorldResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName HELLOWORLDRESULT$0 = 
            new javax.xml.namespace.QName("http://smartbear.com", "HelloWorldResult");
        
        
        /**
         * Gets the "HelloWorldResult" element
         */
        public java.lang.String getHelloWorldResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HELLOWORLDRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "HelloWorldResult" element
         */
        public org.apache.xmlbeans.XmlString xgetHelloWorldResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HELLOWORLDRESULT$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "HelloWorldResult" element
         */
        public boolean isSetHelloWorldResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(HELLOWORLDRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "HelloWorldResult" element
         */
        public void setHelloWorldResult(java.lang.String helloWorldResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HELLOWORLDRESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HELLOWORLDRESULT$0);
                }
                target.setStringValue(helloWorldResult);
            }
        }
        
        /**
         * Sets (as xml) the "HelloWorldResult" element
         */
        public void xsetHelloWorldResult(org.apache.xmlbeans.XmlString helloWorldResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HELLOWORLDRESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(HELLOWORLDRESULT$0);
                }
                target.set(helloWorldResult);
            }
        }
        
        /**
         * Unsets the "HelloWorldResult" element
         */
        public void unsetHelloWorldResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(HELLOWORLDRESULT$0, 0);
            }
        }
    }
}
