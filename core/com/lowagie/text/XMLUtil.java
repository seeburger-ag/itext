/*
 * XMLUtil.java
 *
 * created at 28.02.2021 by Ivan Vaklinov <i.vaklinov@seeburger.com>
 *
 * Copyright (c) 2021 SEEBURGER AG, Germany.
 *
 * The contents of this file are subject to the Mozilla Public License Version 1.1
 * (the "License"); you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at http://www.mozilla.org/MPL/
 *
 * Software distributed under the License is distributed on an "AS IS" basis,
 * WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
 * for the specific language governing rights and limitations under the License.
 *
 * The Original Code is 'iText, a free JAVA-PDF library'.
 *
 * The Initial Developer of the Original Code is Bruno Lowagie. Portions created by
 * the Initial Developer are Copyright (C) 1999, 2000, 2001, 2002 by Bruno Lowagie.
 * All Rights Reserved.
 * Co-Developer of the code is Paulo Soares. Portions created by the Co-Developer
 * are Copyright (C) 2008 by Paulo Soares. All Rights Reserved.
 *
 * Contributor(s): all the names of the contributors are added in the source code
 * where applicable.
 *
 * Alternatively, the contents of this file may be used under the terms of the
 * LGPL license (the "GNU LIBRARY GENERAL PUBLIC LICENSE"), in which case the
 * provisions of LGPL are applicable instead of those above.  If you wish to
 * allow use of your version of this file only under the terms of the LGPL
 * License and not to allow others to use your version of this file under
 * the MPL, indicate your decision by deleting the provisions above and
 * replace them with the notice and other provisions required by the LGPL.
 * If you do not delete the provisions above, a recipient may use your version
 * of this file under either the MPL or the GNU LIBRARY GENERAL PUBLIC LICENSE.
 *
 * This library is free software; you can redistribute it and/or modify it
 * under the terms of the MPL as stated above or under the terms of the GNU
 * Library General Public License as published by the Free Software Foundation;
 * either version 2 of the License, or any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Library general Public License for more
 * details.
 *
 * If you didn't download this code from the following link, you should check if
 * you aren't using an obsolete version:
 * http://www.lowagie.com/iText/
 */
package com.lowagie.text;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXNotSupportedException;


/**
 * Utility class for providing XML security related and other functions.
 *
 * @author Ivan Vaklinov
 */
public class XMLUtil
{
    // Standard (more or less) XML parser features to control
    private static final String EXTERNAL_GENERAL_ENTITIES   = "http://xml.org/sax/features/external-general-entities";
    private static final String EXTERNAL_PARAMETER_ENTITIES = "http://xml.org/sax/features/external-parameter-entities";
    private static final String LOAD_EXTERNAL_DTD           = "http://apache.org/xml/features/nonvalidating/load-external-dtd";


    /**
     * Configures an XML (DOM) parser factory to handle XML in a secure manner.
     *
     * @param dbf XML parser factory
     *
     * @throws ParserConfigurationException
     */
    public static void configureXMLFactoryForSecureHandling(DocumentBuilderFactory dbf)
        throws ParserConfigurationException
    {
        // Configure the XML document builder factory as shown in
        // https://www.owasp.org/index.php/XML_External_Entity_(XXE)_Prevention_Cheat_Sheet
        dbf.setFeature(EXTERNAL_GENERAL_ENTITIES, false);
        dbf.setFeature(EXTERNAL_PARAMETER_ENTITIES, false);
        dbf.setFeature(LOAD_EXTERNAL_DTD, false);
        dbf.setXIncludeAware(false);

        // To prevent billion LOLs type of attacks we limit the total entity expansions
        dbf.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);
    }


    /**
     * Configures an XML (SAX) parser factory to handle XML in a secure manner.
     *
     * @param spf XML parser factory
     *
     * @throws ParserConfigurationException
     * @throws SAXNotRecognizedException
     * @throws SAXNotSupportedException
     */
    public static void configureXMLFactoryForSecureHandling(SAXParserFactory spf)
        throws SAXNotSupportedException, SAXNotRecognizedException, ParserConfigurationException
    {
        // Configure the XML document builder factory as shown in
        // https://www.owasp.org/index.php/XML_External_Entity_(XXE)_Prevention_Cheat_Sheet
        spf.setFeature(EXTERNAL_GENERAL_ENTITIES, false);
        spf.setFeature(EXTERNAL_PARAMETER_ENTITIES, false);
        spf.setFeature(LOAD_EXTERNAL_DTD, false);
        spf.setXIncludeAware(false);

        // To prevent billion LOLs type of attacks we limit the total entity expansions
        spf.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);
    }
}
