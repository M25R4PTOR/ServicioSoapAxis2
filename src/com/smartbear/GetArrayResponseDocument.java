/*
 * An XML document type.
 * Localname: GetArrayResponse
 * Namespace: http://smartbear.com
 * Java type: com.smartbear.GetArrayResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.smartbear;


/**
 * A document containing one GetArrayResponse(@http://smartbear.com) element.
 *
 * This is a complex type.
 */
public interface GetArrayResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetArrayResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s807FB1A0CE0E21AD3515CF5A1E6E591D").resolveHandle("getarrayresponse6001doctype");
    
    /**
     * Gets the "GetArrayResponse" element
     */
    com.smartbear.GetArrayResponseDocument.GetArrayResponse getGetArrayResponse();
    
    /**
     * Sets the "GetArrayResponse" element
     */
    void setGetArrayResponse(com.smartbear.GetArrayResponseDocument.GetArrayResponse getArrayResponse);
    
    /**
     * Appends and returns a new empty "GetArrayResponse" element
     */
    com.smartbear.GetArrayResponseDocument.GetArrayResponse addNewGetArrayResponse();
    
    /**
     * An XML GetArrayResponse(@http://smartbear.com).
     *
     * This is a complex type.
     */
    public interface GetArrayResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetArrayResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s807FB1A0CE0E21AD3515CF5A1E6E591D").resolveHandle("getarrayresponsefac1elemtype");
        
        /**
         * Gets the "GetArrayResult" element
         */
        com.smartbear.ArrayOfInt getGetArrayResult();
        
        /**
         * True if has "GetArrayResult" element
         */
        boolean isSetGetArrayResult();
        
        /**
         * Sets the "GetArrayResult" element
         */
        void setGetArrayResult(com.smartbear.ArrayOfInt getArrayResult);
        
        /**
         * Appends and returns a new empty "GetArrayResult" element
         */
        com.smartbear.ArrayOfInt addNewGetArrayResult();
        
        /**
         * Unsets the "GetArrayResult" element
         */
        void unsetGetArrayResult();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.smartbear.GetArrayResponseDocument.GetArrayResponse newInstance() {
              return (com.smartbear.GetArrayResponseDocument.GetArrayResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.smartbear.GetArrayResponseDocument.GetArrayResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.smartbear.GetArrayResponseDocument.GetArrayResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.smartbear.GetArrayResponseDocument newInstance() {
          return (com.smartbear.GetArrayResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.smartbear.GetArrayResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.smartbear.GetArrayResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.smartbear.GetArrayResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.smartbear.GetArrayResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.smartbear.GetArrayResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.smartbear.GetArrayResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.smartbear.GetArrayResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.smartbear.GetArrayResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.smartbear.GetArrayResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.smartbear.GetArrayResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.smartbear.GetArrayResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.smartbear.GetArrayResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.smartbear.GetArrayResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.smartbear.GetArrayResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.smartbear.GetArrayResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.smartbear.GetArrayResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.smartbear.GetArrayResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.smartbear.GetArrayResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.smartbear.GetArrayResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.smartbear.GetArrayResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.smartbear.GetArrayResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.smartbear.GetArrayResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.smartbear.GetArrayResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.smartbear.GetArrayResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.smartbear.GetArrayResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.smartbear.GetArrayResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.smartbear.GetArrayResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.smartbear.GetArrayResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.smartbear.GetArrayResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.smartbear.GetArrayResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.smartbear.GetArrayResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.smartbear.GetArrayResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.smartbear.GetArrayResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.smartbear.GetArrayResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
