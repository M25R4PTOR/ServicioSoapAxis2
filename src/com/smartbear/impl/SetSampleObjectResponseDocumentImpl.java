/*
 * An XML document type.
 * Localname: SetSampleObjectResponse
 * Namespace: http://smartbear.com
 * Java type: com.smartbear.SetSampleObjectResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.smartbear.impl;
/**
 * A document containing one SetSampleObjectResponse(@http://smartbear.com) element.
 *
 * This is a complex type.
 */
public class SetSampleObjectResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.smartbear.SetSampleObjectResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public SetSampleObjectResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SETSAMPLEOBJECTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://smartbear.com", "SetSampleObjectResponse");
    
    
    /**
     * Gets the "SetSampleObjectResponse" element
     */
    public com.smartbear.SetSampleObjectResponseDocument.SetSampleObjectResponse getSetSampleObjectResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.smartbear.SetSampleObjectResponseDocument.SetSampleObjectResponse target = null;
            target = (com.smartbear.SetSampleObjectResponseDocument.SetSampleObjectResponse)get_store().find_element_user(SETSAMPLEOBJECTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SetSampleObjectResponse" element
     */
    public void setSetSampleObjectResponse(com.smartbear.SetSampleObjectResponseDocument.SetSampleObjectResponse setSampleObjectResponse)
    {
        generatedSetterHelperImpl(setSampleObjectResponse, SETSAMPLEOBJECTRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "SetSampleObjectResponse" element
     */
    public com.smartbear.SetSampleObjectResponseDocument.SetSampleObjectResponse addNewSetSampleObjectResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.smartbear.SetSampleObjectResponseDocument.SetSampleObjectResponse target = null;
            target = (com.smartbear.SetSampleObjectResponseDocument.SetSampleObjectResponse)get_store().add_element_user(SETSAMPLEOBJECTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML SetSampleObjectResponse(@http://smartbear.com).
     *
     * This is a complex type.
     */
    public static class SetSampleObjectResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.smartbear.SetSampleObjectResponseDocument.SetSampleObjectResponse
    {
        private static final long serialVersionUID = 1L;
        
        public SetSampleObjectResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SETSAMPLEOBJECTRESULT$0 = 
            new javax.xml.namespace.QName("http://smartbear.com", "SetSampleObjectResult");
        
        
        /**
         * Gets the "SetSampleObjectResult" element
         */
        public java.lang.String getSetSampleObjectResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SETSAMPLEOBJECTRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "SetSampleObjectResult" element
         */
        public org.apache.xmlbeans.XmlString xgetSetSampleObjectResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SETSAMPLEOBJECTRESULT$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "SetSampleObjectResult" element
         */
        public boolean isSetSetSampleObjectResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SETSAMPLEOBJECTRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "SetSampleObjectResult" element
         */
        public void setSetSampleObjectResult(java.lang.String setSampleObjectResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SETSAMPLEOBJECTRESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SETSAMPLEOBJECTRESULT$0);
                }
                target.setStringValue(setSampleObjectResult);
            }
        }
        
        /**
         * Sets (as xml) the "SetSampleObjectResult" element
         */
        public void xsetSetSampleObjectResult(org.apache.xmlbeans.XmlString setSampleObjectResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SETSAMPLEOBJECTRESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SETSAMPLEOBJECTRESULT$0);
                }
                target.set(setSampleObjectResult);
            }
        }
        
        /**
         * Unsets the "SetSampleObjectResult" element
         */
        public void unsetSetSampleObjectResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SETSAMPLEOBJECTRESULT$0, 0);
            }
        }
    }
}
