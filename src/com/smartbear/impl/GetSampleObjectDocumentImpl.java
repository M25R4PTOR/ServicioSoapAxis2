/*
 * An XML document type.
 * Localname: GetSampleObject
 * Namespace: http://smartbear.com
 * Java type: com.smartbear.GetSampleObjectDocument
 *
 * Automatically generated - do not modify.
 */
package com.smartbear.impl;
/**
 * A document containing one GetSampleObject(@http://smartbear.com) element.
 *
 * This is a complex type.
 */
public class GetSampleObjectDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.smartbear.GetSampleObjectDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetSampleObjectDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETSAMPLEOBJECT$0 = 
        new javax.xml.namespace.QName("http://smartbear.com", "GetSampleObject");
    
    
    /**
     * Gets the "GetSampleObject" element
     */
    public com.smartbear.GetSampleObjectDocument.GetSampleObject getGetSampleObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.smartbear.GetSampleObjectDocument.GetSampleObject target = null;
            target = (com.smartbear.GetSampleObjectDocument.GetSampleObject)get_store().find_element_user(GETSAMPLEOBJECT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetSampleObject" element
     */
    public void setGetSampleObject(com.smartbear.GetSampleObjectDocument.GetSampleObject getSampleObject)
    {
        generatedSetterHelperImpl(getSampleObject, GETSAMPLEOBJECT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GetSampleObject" element
     */
    public com.smartbear.GetSampleObjectDocument.GetSampleObject addNewGetSampleObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.smartbear.GetSampleObjectDocument.GetSampleObject target = null;
            target = (com.smartbear.GetSampleObjectDocument.GetSampleObject)get_store().add_element_user(GETSAMPLEOBJECT$0);
            return target;
        }
    }
    /**
     * An XML GetSampleObject(@http://smartbear.com).
     *
     * This is a complex type.
     */
    public static class GetSampleObjectImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.smartbear.GetSampleObjectDocument.GetSampleObject
    {
        private static final long serialVersionUID = 1L;
        
        public GetSampleObjectImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NO$0 = 
            new javax.xml.namespace.QName("http://smartbear.com", "no");
        
        
        /**
         * Gets the "no" element
         */
        public int getNo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NO$0, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "no" element
         */
        public org.apache.xmlbeans.XmlInt xgetNo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NO$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "no" element
         */
        public void setNo(int no)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NO$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NO$0);
                }
                target.setIntValue(no);
            }
        }
        
        /**
         * Sets (as xml) the "no" element
         */
        public void xsetNo(org.apache.xmlbeans.XmlInt no)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NO$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(NO$0);
                }
                target.set(no);
            }
        }
    }
}
