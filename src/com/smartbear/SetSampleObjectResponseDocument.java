/*
 * An XML document type.
 * Localname: SetSampleObjectResponse
 * Namespace: http://smartbear.com
 * Java type: com.smartbear.SetSampleObjectResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.smartbear;


/**
 * A document containing one SetSampleObjectResponse(@http://smartbear.com) element.
 *
 * This is a complex type.
 */
public interface SetSampleObjectResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SetSampleObjectResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s807FB1A0CE0E21AD3515CF5A1E6E591D").resolveHandle("setsampleobjectresponse82abdoctype");
    
    /**
     * Gets the "SetSampleObjectResponse" element
     */
    com.smartbear.SetSampleObjectResponseDocument.SetSampleObjectResponse getSetSampleObjectResponse();
    
    /**
     * Sets the "SetSampleObjectResponse" element
     */
    void setSetSampleObjectResponse(com.smartbear.SetSampleObjectResponseDocument.SetSampleObjectResponse setSampleObjectResponse);
    
    /**
     * Appends and returns a new empty "SetSampleObjectResponse" element
     */
    com.smartbear.SetSampleObjectResponseDocument.SetSampleObjectResponse addNewSetSampleObjectResponse();
    
    /**
     * An XML SetSampleObjectResponse(@http://smartbear.com).
     *
     * This is a complex type.
     */
    public interface SetSampleObjectResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SetSampleObjectResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s807FB1A0CE0E21AD3515CF5A1E6E591D").resolveHandle("setsampleobjectresponse4ef3elemtype");
        
        /**
         * Gets the "SetSampleObjectResult" element
         */
        java.lang.String getSetSampleObjectResult();
        
        /**
         * Gets (as xml) the "SetSampleObjectResult" element
         */
        org.apache.xmlbeans.XmlString xgetSetSampleObjectResult();
        
        /**
         * True if has "SetSampleObjectResult" element
         */
        boolean isSetSetSampleObjectResult();
        
        /**
         * Sets the "SetSampleObjectResult" element
         */
        void setSetSampleObjectResult(java.lang.String setSampleObjectResult);
        
        /**
         * Sets (as xml) the "SetSampleObjectResult" element
         */
        void xsetSetSampleObjectResult(org.apache.xmlbeans.XmlString setSampleObjectResult);
        
        /**
         * Unsets the "SetSampleObjectResult" element
         */
        void unsetSetSampleObjectResult();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.smartbear.SetSampleObjectResponseDocument.SetSampleObjectResponse newInstance() {
              return (com.smartbear.SetSampleObjectResponseDocument.SetSampleObjectResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.smartbear.SetSampleObjectResponseDocument.SetSampleObjectResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.smartbear.SetSampleObjectResponseDocument.SetSampleObjectResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.smartbear.SetSampleObjectResponseDocument newInstance() {
          return (com.smartbear.SetSampleObjectResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.smartbear.SetSampleObjectResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.smartbear.SetSampleObjectResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.smartbear.SetSampleObjectResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.smartbear.SetSampleObjectResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.smartbear.SetSampleObjectResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.smartbear.SetSampleObjectResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.smartbear.SetSampleObjectResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.smartbear.SetSampleObjectResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.smartbear.SetSampleObjectResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.smartbear.SetSampleObjectResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.smartbear.SetSampleObjectResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.smartbear.SetSampleObjectResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.smartbear.SetSampleObjectResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.smartbear.SetSampleObjectResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.smartbear.SetSampleObjectResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.smartbear.SetSampleObjectResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.smartbear.SetSampleObjectResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.smartbear.SetSampleObjectResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.smartbear.SetSampleObjectResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.smartbear.SetSampleObjectResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.smartbear.SetSampleObjectResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.smartbear.SetSampleObjectResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.smartbear.SetSampleObjectResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.smartbear.SetSampleObjectResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.smartbear.SetSampleObjectResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.smartbear.SetSampleObjectResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.smartbear.SetSampleObjectResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.smartbear.SetSampleObjectResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.smartbear.SetSampleObjectResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.smartbear.SetSampleObjectResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.smartbear.SetSampleObjectResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.smartbear.SetSampleObjectResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.smartbear.SetSampleObjectResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.smartbear.SetSampleObjectResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
