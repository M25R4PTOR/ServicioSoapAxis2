/*
 * An XML document type.
 * Localname: SetSampleObject
 * Namespace: http://smartbear.com
 * Java type: com.smartbear.SetSampleObjectDocument
 *
 * Automatically generated - do not modify.
 */
package com.smartbear.impl;
/**
 * A document containing one SetSampleObject(@http://smartbear.com) element.
 *
 * This is a complex type.
 */
public class SetSampleObjectDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.smartbear.SetSampleObjectDocument
{
    private static final long serialVersionUID = 1L;
    
    public SetSampleObjectDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SETSAMPLEOBJECT$0 = 
        new javax.xml.namespace.QName("http://smartbear.com", "SetSampleObject");
    
    
    /**
     * Gets the "SetSampleObject" element
     */
    public com.smartbear.SetSampleObjectDocument.SetSampleObject getSetSampleObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.smartbear.SetSampleObjectDocument.SetSampleObject target = null;
            target = (com.smartbear.SetSampleObjectDocument.SetSampleObject)get_store().find_element_user(SETSAMPLEOBJECT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SetSampleObject" element
     */
    public void setSetSampleObject(com.smartbear.SetSampleObjectDocument.SetSampleObject setSampleObject)
    {
        generatedSetterHelperImpl(setSampleObject, SETSAMPLEOBJECT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "SetSampleObject" element
     */
    public com.smartbear.SetSampleObjectDocument.SetSampleObject addNewSetSampleObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.smartbear.SetSampleObjectDocument.SetSampleObject target = null;
            target = (com.smartbear.SetSampleObjectDocument.SetSampleObject)get_store().add_element_user(SETSAMPLEOBJECT$0);
            return target;
        }
    }
    /**
     * An XML SetSampleObject(@http://smartbear.com).
     *
     * This is a complex type.
     */
    public static class SetSampleObjectImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.smartbear.SetSampleObjectDocument.SetSampleObject
    {
        private static final long serialVersionUID = 1L;
        
        public SetSampleObjectImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName OBJ$0 = 
            new javax.xml.namespace.QName("http://smartbear.com", "obj");
        
        
        /**
         * Gets the "obj" element
         */
        public com.smartbear.SampleTestClass getObj()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.smartbear.SampleTestClass target = null;
                target = (com.smartbear.SampleTestClass)get_store().find_element_user(OBJ$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "obj" element
         */
        public boolean isSetObj()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(OBJ$0) != 0;
            }
        }
        
        /**
         * Sets the "obj" element
         */
        public void setObj(com.smartbear.SampleTestClass obj)
        {
            generatedSetterHelperImpl(obj, OBJ$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "obj" element
         */
        public com.smartbear.SampleTestClass addNewObj()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.smartbear.SampleTestClass target = null;
                target = (com.smartbear.SampleTestClass)get_store().add_element_user(OBJ$0);
                return target;
            }
        }
        
        /**
         * Unsets the "obj" element
         */
        public void unsetObj()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(OBJ$0, 0);
            }
        }
    }
}
