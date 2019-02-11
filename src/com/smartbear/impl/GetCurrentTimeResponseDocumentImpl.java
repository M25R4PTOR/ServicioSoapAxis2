/*
 * An XML document type.
 * Localname: GetCurrentTimeResponse
 * Namespace: http://smartbear.com
 * Java type: com.smartbear.GetCurrentTimeResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.smartbear.impl;
/**
 * A document containing one GetCurrentTimeResponse(@http://smartbear.com) element.
 *
 * This is a complex type.
 */
public class GetCurrentTimeResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.smartbear.GetCurrentTimeResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetCurrentTimeResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETCURRENTTIMERESPONSE$0 = 
        new javax.xml.namespace.QName("http://smartbear.com", "GetCurrentTimeResponse");
    
    
    /**
     * Gets the "GetCurrentTimeResponse" element
     */
    public com.smartbear.GetCurrentTimeResponseDocument.GetCurrentTimeResponse getGetCurrentTimeResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.smartbear.GetCurrentTimeResponseDocument.GetCurrentTimeResponse target = null;
            target = (com.smartbear.GetCurrentTimeResponseDocument.GetCurrentTimeResponse)get_store().find_element_user(GETCURRENTTIMERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetCurrentTimeResponse" element
     */
    public void setGetCurrentTimeResponse(com.smartbear.GetCurrentTimeResponseDocument.GetCurrentTimeResponse getCurrentTimeResponse)
    {
        generatedSetterHelperImpl(getCurrentTimeResponse, GETCURRENTTIMERESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GetCurrentTimeResponse" element
     */
    public com.smartbear.GetCurrentTimeResponseDocument.GetCurrentTimeResponse addNewGetCurrentTimeResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.smartbear.GetCurrentTimeResponseDocument.GetCurrentTimeResponse target = null;
            target = (com.smartbear.GetCurrentTimeResponseDocument.GetCurrentTimeResponse)get_store().add_element_user(GETCURRENTTIMERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetCurrentTimeResponse(@http://smartbear.com).
     *
     * This is a complex type.
     */
    public static class GetCurrentTimeResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.smartbear.GetCurrentTimeResponseDocument.GetCurrentTimeResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetCurrentTimeResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GETCURRENTTIMERESULT$0 = 
            new javax.xml.namespace.QName("http://smartbear.com", "GetCurrentTimeResult");
        
        
        /**
         * Gets the "GetCurrentTimeResult" element
         */
        public java.util.Calendar getGetCurrentTimeResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GETCURRENTTIMERESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "GetCurrentTimeResult" element
         */
        public org.apache.xmlbeans.XmlDateTime xgetGetCurrentTimeResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(GETCURRENTTIMERESULT$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "GetCurrentTimeResult" element
         */
        public void setGetCurrentTimeResult(java.util.Calendar getCurrentTimeResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GETCURRENTTIMERESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GETCURRENTTIMERESULT$0);
                }
                target.setCalendarValue(getCurrentTimeResult);
            }
        }
        
        /**
         * Sets (as xml) the "GetCurrentTimeResult" element
         */
        public void xsetGetCurrentTimeResult(org.apache.xmlbeans.XmlDateTime getCurrentTimeResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(GETCURRENTTIMERESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(GETCURRENTTIMERESULT$0);
                }
                target.set(getCurrentTimeResult);
            }
        }
    }
}
