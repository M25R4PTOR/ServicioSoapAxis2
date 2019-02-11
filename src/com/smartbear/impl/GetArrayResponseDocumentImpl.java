/*
 * An XML document type.
 * Localname: GetArrayResponse
 * Namespace: http://smartbear.com
 * Java type: com.smartbear.GetArrayResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.smartbear.impl;
/**
 * A document containing one GetArrayResponse(@http://smartbear.com) element.
 *
 * This is a complex type.
 */
public class GetArrayResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.smartbear.GetArrayResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetArrayResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETARRAYRESPONSE$0 = 
        new javax.xml.namespace.QName("http://smartbear.com", "GetArrayResponse");
    
    
    /**
     * Gets the "GetArrayResponse" element
     */
    public com.smartbear.GetArrayResponseDocument.GetArrayResponse getGetArrayResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.smartbear.GetArrayResponseDocument.GetArrayResponse target = null;
            target = (com.smartbear.GetArrayResponseDocument.GetArrayResponse)get_store().find_element_user(GETARRAYRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetArrayResponse" element
     */
    public void setGetArrayResponse(com.smartbear.GetArrayResponseDocument.GetArrayResponse getArrayResponse)
    {
        generatedSetterHelperImpl(getArrayResponse, GETARRAYRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GetArrayResponse" element
     */
    public com.smartbear.GetArrayResponseDocument.GetArrayResponse addNewGetArrayResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.smartbear.GetArrayResponseDocument.GetArrayResponse target = null;
            target = (com.smartbear.GetArrayResponseDocument.GetArrayResponse)get_store().add_element_user(GETARRAYRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetArrayResponse(@http://smartbear.com).
     *
     * This is a complex type.
     */
    public static class GetArrayResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.smartbear.GetArrayResponseDocument.GetArrayResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetArrayResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GETARRAYRESULT$0 = 
            new javax.xml.namespace.QName("http://smartbear.com", "GetArrayResult");
        
        
        /**
         * Gets the "GetArrayResult" element
         */
        public com.smartbear.ArrayOfInt getGetArrayResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.smartbear.ArrayOfInt target = null;
                target = (com.smartbear.ArrayOfInt)get_store().find_element_user(GETARRAYRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "GetArrayResult" element
         */
        public boolean isSetGetArrayResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GETARRAYRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "GetArrayResult" element
         */
        public void setGetArrayResult(com.smartbear.ArrayOfInt getArrayResult)
        {
            generatedSetterHelperImpl(getArrayResult, GETARRAYRESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "GetArrayResult" element
         */
        public com.smartbear.ArrayOfInt addNewGetArrayResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.smartbear.ArrayOfInt target = null;
                target = (com.smartbear.ArrayOfInt)get_store().add_element_user(GETARRAYRESULT$0);
                return target;
            }
        }
        
        /**
         * Unsets the "GetArrayResult" element
         */
        public void unsetGetArrayResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GETARRAYRESULT$0, 0);
            }
        }
    }
}
