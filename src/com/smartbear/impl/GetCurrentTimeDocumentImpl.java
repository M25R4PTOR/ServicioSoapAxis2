/*
 * An XML document type.
 * Localname: GetCurrentTime
 * Namespace: http://smartbear.com
 * Java type: com.smartbear.GetCurrentTimeDocument
 *
 * Automatically generated - do not modify.
 */
package com.smartbear.impl;
/**
 * A document containing one GetCurrentTime(@http://smartbear.com) element.
 *
 * This is a complex type.
 */
public class GetCurrentTimeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.smartbear.GetCurrentTimeDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetCurrentTimeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETCURRENTTIME$0 = 
        new javax.xml.namespace.QName("http://smartbear.com", "GetCurrentTime");
    
    
    /**
     * Gets the "GetCurrentTime" element
     */
    public com.smartbear.GetCurrentTimeDocument.GetCurrentTime getGetCurrentTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.smartbear.GetCurrentTimeDocument.GetCurrentTime target = null;
            target = (com.smartbear.GetCurrentTimeDocument.GetCurrentTime)get_store().find_element_user(GETCURRENTTIME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetCurrentTime" element
     */
    public void setGetCurrentTime(com.smartbear.GetCurrentTimeDocument.GetCurrentTime getCurrentTime)
    {
        generatedSetterHelperImpl(getCurrentTime, GETCURRENTTIME$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GetCurrentTime" element
     */
    public com.smartbear.GetCurrentTimeDocument.GetCurrentTime addNewGetCurrentTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.smartbear.GetCurrentTimeDocument.GetCurrentTime target = null;
            target = (com.smartbear.GetCurrentTimeDocument.GetCurrentTime)get_store().add_element_user(GETCURRENTTIME$0);
            return target;
        }
    }
    /**
     * An XML GetCurrentTime(@http://smartbear.com).
     *
     * This is a complex type.
     */
    public static class GetCurrentTimeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.smartbear.GetCurrentTimeDocument.GetCurrentTime
    {
        private static final long serialVersionUID = 1L;
        
        public GetCurrentTimeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
