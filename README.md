# itext
iText library used by Jasper Reports as of version 2.1.7 modified by JasperSoft

The base version in this repository comes from JasperSoft:
http://jaspersoft.jfrog.io/jaspersoft/third-party-ce-artifacts/com/lowagie/itext/2.1.7.js7/
specifically source JAR:
http://jaspersoft.jfrog.io/jaspersoft/third-party-ce-artifacts/com/lowagie/itext/2.1.7.js7/itext-2.1.7.js7-sources.jar

Seeburger changes include making it compatible with newer versions of the BouncyCastle cryptography provider:

```
24.02.2021, modified:
core/com/lowagie/text/XMLUtil.java
core/com/lowagie/text/pdf/XfaForm.java
core/com/lowagie/text/xml/TagMap.java
core/com/lowagie/text/xml/XmlParser.java
core/com/lowagie/text/xml/xmp/XmpReader.java
core/com/lowagie/tools/BuildTutorial.java
rups/com/lowagie/rups/model/XfaFile.java
Purpose: Security against external attacks in XML parsing.

03 Feb 2021, modified:
core/com/lowagie/text/pdf/PdfPKCS7.java
core/com/lowagie/text/pdf/PdfPublicKeySecurityHandler.java
Purpose: Compatibility with BouncyCastle 1.68

Additional files/directories modified/added for the sake of DevOps (not core functionality):
pom.xml
README.md
```