/*
 * An XML document type.
 * Localname: HelloWorld
 * Namespace: http://smartbear.com
 * Java type: com.smartbear.HelloWorldDocument
 *
 * Automatically generated - do not modify.
 */
package com.smartbear.impl;
/**
 * A document containing one HelloWorld(@http://smartbear.com) element.
 *
 * This is a complex type.
 */
public class HelloWorldDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.smartbear.HelloWorldDocument
{
    private static final long serialVersionUID = 1L;
    
    public HelloWorldDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HELLOWORLD$0 = 
        new javax.xml.namespace.QName("http://smartbear.com", "HelloWorld");
    
    
    /**
     * Gets the "HelloWorld" element
     */
    public com.smartbear.HelloWorldDocument.HelloWorld getHelloWorld()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.smartbear.HelloWorldDocument.HelloWorld target = null;
            target = (com.smartbear.HelloWorldDocument.HelloWorld)get_store().find_element_user(HELLOWORLD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "HelloWorld" element
     */
    public void setHelloWorld(com.smartbear.HelloWorldDocument.HelloWorld helloWorld)
    {
        generatedSetterHelperImpl(helloWorld, HELLOWORLD$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "HelloWorld" element
     */
    public com.smartbear.HelloWorldDocument.HelloWorld addNewHelloWorld()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.smartbear.HelloWorldDocument.HelloWorld target = null;
            target = (com.smartbear.HelloWorldDocument.HelloWorld)get_store().add_element_user(HELLOWORLD$0);
            return target;
        }
    }
    /**
     * An XML HelloWorld(@http://smartbear.com).
     *
     * This is a complex type.
     */
    public static class HelloWorldImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.smartbear.HelloWorldDocument.HelloWorld
    {
        private static final long serialVersionUID = 1L;
        
        public HelloWorldImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
