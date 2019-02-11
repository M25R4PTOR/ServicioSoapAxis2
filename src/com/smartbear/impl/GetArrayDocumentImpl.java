/*
 * An XML document type.
 * Localname: GetArray
 * Namespace: http://smartbear.com
 * Java type: com.smartbear.GetArrayDocument
 *
 * Automatically generated - do not modify.
 */
package com.smartbear.impl;
/**
 * A document containing one GetArray(@http://smartbear.com) element.
 *
 * This is a complex type.
 */
public class GetArrayDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.smartbear.GetArrayDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetArrayDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETARRAY1$0 = 
        new javax.xml.namespace.QName("http://smartbear.com", "GetArray");
    
    
    /**
     * Gets the "GetArray" element
     */
    public com.smartbear.GetArrayDocument.GetArray getGetArray1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.smartbear.GetArrayDocument.GetArray target = null;
            target = (com.smartbear.GetArrayDocument.GetArray)get_store().find_element_user(GETARRAY1$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetArray" element
     */
    public void setGetArray1(com.smartbear.GetArrayDocument.GetArray getArray1)
    {
        generatedSetterHelperImpl(getArray1, GETARRAY1$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GetArray" element
     */
    public com.smartbear.GetArrayDocument.GetArray addNewGetArray1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.smartbear.GetArrayDocument.GetArray target = null;
            target = (com.smartbear.GetArrayDocument.GetArray)get_store().add_element_user(GETARRAY1$0);
            return target;
        }
    }
    /**
     * An XML GetArray(@http://smartbear.com).
     *
     * This is a complex type.
     */
    public static class GetArrayImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.smartbear.GetArrayDocument.GetArray
    {
        private static final long serialVersionUID = 1L;
        
        public GetArrayImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
