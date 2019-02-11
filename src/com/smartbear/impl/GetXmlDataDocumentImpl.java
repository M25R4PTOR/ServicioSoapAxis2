/*
 * An XML document type.
 * Localname: GetXmlData
 * Namespace: http://smartbear.com
 * Java type: com.smartbear.GetXmlDataDocument
 *
 * Automatically generated - do not modify.
 */
package com.smartbear.impl;
/**
 * A document containing one GetXmlData(@http://smartbear.com) element.
 *
 * This is a complex type.
 */
public class GetXmlDataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.smartbear.GetXmlDataDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetXmlDataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETXMLDATA$0 = 
        new javax.xml.namespace.QName("http://smartbear.com", "GetXmlData");
    
    
    /**
     * Gets the "GetXmlData" element
     */
    public com.smartbear.GetXmlDataDocument.GetXmlData getGetXmlData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.smartbear.GetXmlDataDocument.GetXmlData target = null;
            target = (com.smartbear.GetXmlDataDocument.GetXmlData)get_store().find_element_user(GETXMLDATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetXmlData" element
     */
    public void setGetXmlData(com.smartbear.GetXmlDataDocument.GetXmlData getXmlData)
    {
        generatedSetterHelperImpl(getXmlData, GETXMLDATA$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GetXmlData" element
     */
    public com.smartbear.GetXmlDataDocument.GetXmlData addNewGetXmlData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.smartbear.GetXmlDataDocument.GetXmlData target = null;
            target = (com.smartbear.GetXmlDataDocument.GetXmlData)get_store().add_element_user(GETXMLDATA$0);
            return target;
        }
    }
    /**
     * An XML GetXmlData(@http://smartbear.com).
     *
     * This is a complex type.
     */
    public static class GetXmlDataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.smartbear.GetXmlDataDocument.GetXmlData
    {
        private static final long serialVersionUID = 1L;
        
        public GetXmlDataImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
