# itext
iText library used by Jasper Reports as of version 2.1.7 modified by JasperSoft

The base version in this repository comes from JasperSoft:
http://jaspersoft.jfrog.io/jaspersoft/third-party-ce-artifacts/com/lowagie/itext/2.1.7.js7/
specifically source JAR:
http://jaspersoft.jfrog.io/jaspersoft/third-party-ce-artifacts/com/lowagie/itext/2.1.7.js7/itext-2.1.7.js7-sources.jar

Seeburger changes include making it compatible with newer versions of the BouncyCastle cryptography provider:

```
03 Feb 2021, modified:
core/com/lowagie/text/pdf/PdfPKCS7.java
core/com/lowagie/text/pdf/PdfPublicKeySecurityHandler.java
Purpose: Compatibility with BouncyCastle 1.68

Additional files/directories modified/added for the sake of DevOps (not core functionality):
pom.xml
README.md
```