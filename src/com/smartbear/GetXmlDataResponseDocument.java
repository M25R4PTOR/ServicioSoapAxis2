/*
 * An XML document type.
 * Localname: GetXmlDataResponse
 * Namespace: http://smartbear.com
 * Java type: com.smartbear.GetXmlDataResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.smartbear;


/**
 * A document containing one GetXmlDataResponse(@http://smartbear.com) element.
 *
 * This is a complex type.
 */
public interface GetXmlDataResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetXmlDataResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s807FB1A0CE0E21AD3515CF5A1E6E591D").resolveHandle("getxmldataresponse53b9doctype");
    
    /**
     * Gets the "GetXmlDataResponse" element
     */
    com.smartbear.GetXmlDataResponseDocument.GetXmlDataResponse getGetXmlDataResponse();
    
    /**
     * Sets the "GetXmlDataResponse" element
     */
    void setGetXmlDataResponse(com.smartbear.GetXmlDataResponseDocument.GetXmlDataResponse getXmlDataResponse);
    
    /**
     * Appends and returns a new empty "GetXmlDataResponse" element
     */
    com.smartbear.GetXmlDataResponseDocument.GetXmlDataResponse addNewGetXmlDataResponse();
    
    /**
     * An XML GetXmlDataResponse(@http://smartbear.com).
     *
     * This is a complex type.
     */
    public interface GetXmlDataResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetXmlDataResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s807FB1A0CE0E21AD3515CF5A1E6E591D").resolveHandle("getxmldataresponsef201elemtype");
        
        /**
         * Gets the "GetXmlDataResult" element
         */
        com.smartbear.GetXmlDataResponseDocument.GetXmlDataResponse.GetXmlDataResult getGetXmlDataResult();
        
        /**
         * True if has "GetXmlDataResult" element
         */
        boolean isSetGetXmlDataResult();
        
        /**
         * Sets the "GetXmlDataResult" element
         */
        void setGetXmlDataResult(com.smartbear.GetXmlDataResponseDocument.GetXmlDataResponse.GetXmlDataResult getXmlDataResult);
        
        /**
         * Appends and returns a new empty "GetXmlDataResult" element
         */
        com.smartbear.GetXmlDataResponseDocument.GetXmlDataResponse.GetXmlDataResult addNewGetXmlDataResult();
        
        /**
         * Unsets the "GetXmlDataResult" element
         */
        void unsetGetXmlDataResult();
        
        /**
         * An XML GetXmlDataResult(@http://smartbear.com).
         *
         * This is a complex type.
         */
        public interface GetXmlDataResult extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetXmlDataResult.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s807FB1A0CE0E21AD3515CF5A1E6E591D").resolveHandle("getxmldataresult149delemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static com.smartbear.GetXmlDataResponseDocument.GetXmlDataResponse.GetXmlDataResult newInstance() {
                  return (com.smartbear.GetXmlDataResponseDocument.GetXmlDataResponse.GetXmlDataResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.smartbear.GetXmlDataResponseDocument.GetXmlDataResponse.GetXmlDataResult newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.smartbear.GetXmlDataResponseDocument.GetXmlDataResponse.GetXmlDataResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.smartbear.GetXmlDataResponseDocument.GetXmlDataResponse newInstance() {
              return (com.smartbear.GetXmlDataResponseDocument.GetXmlDataResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.smartbear.GetXmlDataResponseDocument.GetXmlDataResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.smartbear.GetXmlDataResponseDocument.GetXmlDataResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.smartbear.GetXmlDataResponseDocument newInstance() {
          return (com.smartbear.GetXmlDataResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.smartbear.GetXmlDataResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.smartbear.GetXmlDataResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.smartbear.GetXmlDataResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.smartbear.GetXmlDataResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.smartbear.GetXmlDataResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.smartbear.GetXmlDataResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.smartbear.GetXmlDataResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.smartbear.GetXmlDataResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.smartbear.GetXmlDataResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.smartbear.GetXmlDataResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.smartbear.GetXmlDataResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.smartbear.GetXmlDataResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.smartbear.GetXmlDataResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.smartbear.GetXmlDataResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.smartbear.GetXmlDataResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.smartbear.GetXmlDataResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.smartbear.GetXmlDataResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.smartbear.GetXmlDataResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.smartbear.GetXmlDataResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.smartbear.GetXmlDataResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.smartbear.GetXmlDataResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.smartbear.GetXmlDataResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.smartbear.GetXmlDataResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.smartbear.GetXmlDataResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.smartbear.GetXmlDataResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.smartbear.GetXmlDataResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.smartbear.GetXmlDataResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.smartbear.GetXmlDataResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.smartbear.GetXmlDataResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.smartbear.GetXmlDataResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.smartbear.GetXmlDataResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.smartbear.GetXmlDataResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.smartbear.GetXmlDataResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.smartbear.GetXmlDataResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
