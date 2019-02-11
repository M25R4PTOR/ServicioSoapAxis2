/*
 * An XML document type.
 * Localname: GetXmlDataResponse
 * Namespace: http://smartbear.com
 * Java type: com.smartbear.GetXmlDataResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.smartbear.impl;
/**
 * A document containing one GetXmlDataResponse(@http://smartbear.com) element.
 *
 * This is a complex type.
 */
public class GetXmlDataResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.smartbear.GetXmlDataResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetXmlDataResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETXMLDATARESPONSE$0 = 
        new javax.xml.namespace.QName("http://smartbear.com", "GetXmlDataResponse");
    
    
    /**
     * Gets the "GetXmlDataResponse" element
     */
    public com.smartbear.GetXmlDataResponseDocument.GetXmlDataResponse getGetXmlDataResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.smartbear.GetXmlDataResponseDocument.GetXmlDataResponse target = null;
            target = (com.smartbear.GetXmlDataResponseDocument.GetXmlDataResponse)get_store().find_element_user(GETXMLDATARESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetXmlDataResponse" element
     */
    public void setGetXmlDataResponse(com.smartbear.GetXmlDataResponseDocument.GetXmlDataResponse getXmlDataResponse)
    {
        generatedSetterHelperImpl(getXmlDataResponse, GETXMLDATARESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GetXmlDataResponse" element
     */
    public com.smartbear.GetXmlDataResponseDocument.GetXmlDataResponse addNewGetXmlDataResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.smartbear.GetXmlDataResponseDocument.GetXmlDataResponse target = null;
            target = (com.smartbear.GetXmlDataResponseDocument.GetXmlDataResponse)get_store().add_element_user(GETXMLDATARESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetXmlDataResponse(@http://smartbear.com).
     *
     * This is a complex type.
     */
    public static class GetXmlDataResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.smartbear.GetXmlDataResponseDocument.GetXmlDataResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetXmlDataResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GETXMLDATARESULT$0 = 
            new javax.xml.namespace.QName("http://smartbear.com", "GetXmlDataResult");
        
        
        /**
         * Gets the "GetXmlDataResult" element
         */
        public com.smartbear.GetXmlDataResponseDocument.GetXmlDataResponse.GetXmlDataResult getGetXmlDataResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.smartbear.GetXmlDataResponseDocument.GetXmlDataResponse.GetXmlDataResult target = null;
                target = (com.smartbear.GetXmlDataResponseDocument.GetXmlDataResponse.GetXmlDataResult)get_store().find_element_user(GETXMLDATARESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "GetXmlDataResult" element
         */
        public boolean isSetGetXmlDataResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GETXMLDATARESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "GetXmlDataResult" element
         */
        public void setGetXmlDataResult(com.smartbear.GetXmlDataResponseDocument.GetXmlDataResponse.GetXmlDataResult getXmlDataResult)
        {
            generatedSetterHelperImpl(getXmlDataResult, GETXMLDATARESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "GetXmlDataResult" element
         */
        public com.smartbear.GetXmlDataResponseDocument.GetXmlDataResponse.GetXmlDataResult addNewGetXmlDataResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.smartbear.GetXmlDataResponseDocument.GetXmlDataResponse.GetXmlDataResult target = null;
                target = (com.smartbear.GetXmlDataResponseDocument.GetXmlDataResponse.GetXmlDataResult)get_store().add_element_user(GETXMLDATARESULT$0);
                return target;
            }
        }
        
        /**
         * Unsets the "GetXmlDataResult" element
         */
        public void unsetGetXmlDataResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GETXMLDATARESULT$0, 0);
            }
        }
        /**
         * An XML GetXmlDataResult(@http://smartbear.com).
         *
         * This is a complex type.
         */
        public static class GetXmlDataResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.smartbear.GetXmlDataResponseDocument.GetXmlDataResponse.GetXmlDataResult
        {
            private static final long serialVersionUID = 1L;
            
            public GetXmlDataResultImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            
        }
    }
}
