/*
 * XML Type:  SampleTestClass
 * Namespace: http://smartbear.com
 * Java type: com.smartbear.SampleTestClass
 *
 * Automatically generated - do not modify.
 */
package com.smartbear;


/**
 * An XML SampleTestClass(@http://smartbear.com).
 *
 * This is a complex type.
 */
public interface SampleTestClass extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SampleTestClass.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s807FB1A0CE0E21AD3515CF5A1E6E591D").resolveHandle("sampletestclass3e8btype");
    
    /**
     * Gets the "X" element
     */
    double getX();
    
    /**
     * Gets (as xml) the "X" element
     */
    org.apache.xmlbeans.XmlDouble xgetX();
    
    /**
     * Sets the "X" element
     */
    void setX(double x);
    
    /**
     * Sets (as xml) the "X" element
     */
    void xsetX(org.apache.xmlbeans.XmlDouble x);
    
    /**
     * Gets the "Y" element
     */
    double getY();
    
    /**
     * Gets (as xml) the "Y" element
     */
    org.apache.xmlbeans.XmlDouble xgetY();
    
    /**
     * Sets the "Y" element
     */
    void setY(double y);
    
    /**
     * Sets (as xml) the "Y" element
     */
    void xsetY(org.apache.xmlbeans.XmlDouble y);
    
    /**
     * Gets the "Name" element
     */
    java.lang.String getName();
    
    /**
     * Gets (as xml) the "Name" element
     */
    org.apache.xmlbeans.XmlString xgetName();
    
    /**
     * True if has "Name" element
     */
    boolean isSetName();
    
    /**
     * Sets the "Name" element
     */
    void setName(java.lang.String name);
    
    /**
     * Sets (as xml) the "Name" element
     */
    void xsetName(org.apache.xmlbeans.XmlString name);
    
    /**
     * Unsets the "Name" element
     */
    void unsetName();
    
    /**
     * Gets the "IntArray" element
     */
    com.smartbear.ArrayOfInt getIntArray1();
    
    /**
     * True if has "IntArray" element
     */
    boolean isSetIntArray1();
    
    /**
     * Sets the "IntArray" element
     */
    void setIntArray1(com.smartbear.ArrayOfInt intArray1);
    
    /**
     * Appends and returns a new empty "IntArray" element
     */
    com.smartbear.ArrayOfInt addNewIntArray1();
    
    /**
     * Unsets the "IntArray" element
     */
    void unsetIntArray1();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.smartbear.SampleTestClass newInstance() {
          return (com.smartbear.SampleTestClass) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.smartbear.SampleTestClass newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.smartbear.SampleTestClass) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.smartbear.SampleTestClass parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.smartbear.SampleTestClass) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.smartbear.SampleTestClass parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.smartbear.SampleTestClass) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.smartbear.SampleTestClass parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.smartbear.SampleTestClass) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.smartbear.SampleTestClass parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.smartbear.SampleTestClass) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.smartbear.SampleTestClass parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.smartbear.SampleTestClass) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.smartbear.SampleTestClass parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.smartbear.SampleTestClass) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.smartbear.SampleTestClass parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.smartbear.SampleTestClass) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.smartbear.SampleTestClass parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.smartbear.SampleTestClass) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.smartbear.SampleTestClass parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.smartbear.SampleTestClass) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.smartbear.SampleTestClass parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.smartbear.SampleTestClass) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.smartbear.SampleTestClass parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.smartbear.SampleTestClass) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.smartbear.SampleTestClass parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.smartbear.SampleTestClass) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.smartbear.SampleTestClass parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.smartbear.SampleTestClass) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.smartbear.SampleTestClass parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.smartbear.SampleTestClass) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.smartbear.SampleTestClass parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.smartbear.SampleTestClass) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.smartbear.SampleTestClass parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.smartbear.SampleTestClass) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
