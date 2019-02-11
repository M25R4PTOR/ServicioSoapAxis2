/*
 * XML Type:  SampleTestClass
 * Namespace: http://smartbear.com
 * Java type: com.smartbear.SampleTestClass
 *
 * Automatically generated - do not modify.
 */
package com.smartbear.impl;
/**
 * An XML SampleTestClass(@http://smartbear.com).
 *
 * This is a complex type.
 */
public class SampleTestClassImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.smartbear.SampleTestClass
{
    private static final long serialVersionUID = 1L;
    
    public SampleTestClassImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName X$0 = 
        new javax.xml.namespace.QName("http://smartbear.com", "X");
    private static final javax.xml.namespace.QName Y$2 = 
        new javax.xml.namespace.QName("http://smartbear.com", "Y");
    private static final javax.xml.namespace.QName NAME$4 = 
        new javax.xml.namespace.QName("http://smartbear.com", "Name");
    private static final javax.xml.namespace.QName INTARRAY1$6 = 
        new javax.xml.namespace.QName("http://smartbear.com", "IntArray");
    
    
    /**
     * Gets the "X" element
     */
    public double getX()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(X$0, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "X" element
     */
    public org.apache.xmlbeans.XmlDouble xgetX()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(X$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "X" element
     */
    public void setX(double x)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(X$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(X$0);
            }
            target.setDoubleValue(x);
        }
    }
    
    /**
     * Sets (as xml) the "X" element
     */
    public void xsetX(org.apache.xmlbeans.XmlDouble x)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(X$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(X$0);
            }
            target.set(x);
        }
    }
    
    /**
     * Gets the "Y" element
     */
    public double getY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(Y$2, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "Y" element
     */
    public org.apache.xmlbeans.XmlDouble xgetY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(Y$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Y" element
     */
    public void setY(double y)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(Y$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(Y$2);
            }
            target.setDoubleValue(y);
        }
    }
    
    /**
     * Sets (as xml) the "Y" element
     */
    public void xsetY(org.apache.xmlbeans.XmlDouble y)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(Y$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(Y$2);
            }
            target.set(y);
        }
    }
    
    /**
     * Gets the "Name" element
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Name" element
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "Name" element
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAME$4) != 0;
        }
    }
    
    /**
     * Sets the "Name" element
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$4);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "Name" element
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$4);
            }
            target.set(name);
        }
    }
    
    /**
     * Unsets the "Name" element
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAME$4, 0);
        }
    }
    
    /**
     * Gets the "IntArray" element
     */
    public com.smartbear.ArrayOfInt getIntArray1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.smartbear.ArrayOfInt target = null;
            target = (com.smartbear.ArrayOfInt)get_store().find_element_user(INTARRAY1$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "IntArray" element
     */
    public boolean isSetIntArray1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INTARRAY1$6) != 0;
        }
    }
    
    /**
     * Sets the "IntArray" element
     */
    public void setIntArray1(com.smartbear.ArrayOfInt intArray1)
    {
        generatedSetterHelperImpl(intArray1, INTARRAY1$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "IntArray" element
     */
    public com.smartbear.ArrayOfInt addNewIntArray1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.smartbear.ArrayOfInt target = null;
            target = (com.smartbear.ArrayOfInt)get_store().add_element_user(INTARRAY1$6);
            return target;
        }
    }
    
    /**
     * Unsets the "IntArray" element
     */
    public void unsetIntArray1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INTARRAY1$6, 0);
        }
    }
}
