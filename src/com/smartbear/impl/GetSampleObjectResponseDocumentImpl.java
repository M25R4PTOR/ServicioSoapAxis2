/*
 * An XML document type.
 * Localname: GetSampleObjectResponse
 * Namespace: http://smartbear.com
 * Java type: com.smartbear.GetSampleObjectResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.smartbear.impl;
/**
 * A document containing one GetSampleObjectResponse(@http://smartbear.com) element.
 *
 * This is a complex type.
 */
public class GetSampleObjectResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.smartbear.GetSampleObjectResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetSampleObjectResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETSAMPLEOBJECTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://smartbear.com", "GetSampleObjectResponse");
    
    
    /**
     * Gets the "GetSampleObjectResponse" element
     */
    public com.smartbear.GetSampleObjectResponseDocument.GetSampleObjectResponse getGetSampleObjectResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.smartbear.GetSampleObjectResponseDocument.GetSampleObjectResponse target = null;
            target = (com.smartbear.GetSampleObjectResponseDocument.GetSampleObjectResponse)get_store().find_element_user(GETSAMPLEOBJECTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetSampleObjectResponse" element
     */
    public void setGetSampleObjectResponse(com.smartbear.GetSampleObjectResponseDocument.GetSampleObjectResponse getSampleObjectResponse)
    {
        generatedSetterHelperImpl(getSampleObjectResponse, GETSAMPLEOBJECTRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GetSampleObjectResponse" element
     */
    public com.smartbear.GetSampleObjectResponseDocument.GetSampleObjectResponse addNewGetSampleObjectResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.smartbear.GetSampleObjectResponseDocument.GetSampleObjectResponse target = null;
            target = (com.smartbear.GetSampleObjectResponseDocument.GetSampleObjectResponse)get_store().add_element_user(GETSAMPLEOBJECTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetSampleObjectResponse(@http://smartbear.com).
     *
     * This is a complex type.
     */
    public static class GetSampleObjectResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.smartbear.GetSampleObjectResponseDocument.GetSampleObjectResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetSampleObjectResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GETSAMPLEOBJECTRESULT$0 = 
            new javax.xml.namespace.QName("http://smartbear.com", "GetSampleObjectResult");
        
        
        /**
         * Gets the "GetSampleObjectResult" element
         */
        public com.smartbear.SampleTestClass getGetSampleObjectResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.smartbear.SampleTestClass target = null;
                target = (com.smartbear.SampleTestClass)get_store().find_element_user(GETSAMPLEOBJECTRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "GetSampleObjectResult" element
         */
        public boolean isSetGetSampleObjectResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GETSAMPLEOBJECTRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "GetSampleObjectResult" element
         */
        public void setGetSampleObjectResult(com.smartbear.SampleTestClass getSampleObjectResult)
        {
            generatedSetterHelperImpl(getSampleObjectResult, GETSAMPLEOBJECTRESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "GetSampleObjectResult" element
         */
        public com.smartbear.SampleTestClass addNewGetSampleObjectResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.smartbear.SampleTestClass target = null;
                target = (com.smartbear.SampleTestClass)get_store().add_element_user(GETSAMPLEOBJECTRESULT$0);
                return target;
            }
        }
        
        /**
         * Unsets the "GetSampleObjectResult" element
         */
        public void unsetGetSampleObjectResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GETSAMPLEOBJECTRESULT$0, 0);
            }
        }
    }
}
