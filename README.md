# itext
iText library used by Jasper Reports as of version 2.1.7 modified by JasperSoft

The base version in this repository comes from JasperSoft:
http://jaspersoft.jfrog.io/jaspersoft/third-party-ce-artifacts/com/lowagie/itext/2.1.7.js7/
specifically source JAR:
http://jaspersoft.jfrog.io/jaspersoft/third-party-ce-artifacts/com/lowagie/itext/2.1.7.js7/itext-2.1.7.js7-sources.jar

Later the sources were updated to be the same as those of js9:
https://jaspersoft.jfrog.io/ui/native/third-party-ce-artifacts/com/lowagie/itext/2.1.7.js9/
specifically source JAR:
https://jaspersoft.jfrog.io/artifactory/third-party-ce-artifacts/com/lowagie/itext/2.1.7.js9/itext-2.1.7.js9-sources.jar

Seeburger changes include making it compatible with newer versions of the BouncyCastle cryptography provider:

```
03 Feb 2021, modified:
core/com/lowagie/text/pdf/PdfPKCS7.java
core/com/lowagie/text/pdf/PdfPublicKeySecurityHandler.java
Purpose: Compatibility with BouncyCastle 1.68

Additional files/directories modified/added for the sake of DevOps (not core functionality):
pom.xml
README.md

15 Apr 2022
core/com/lowagie/text/pdf/PdfPKCS7.java
core/com/lowagie/text/pdf/PdfPublicKeySecurityHandler.java
Purpose: Synchronizing sources to be the same as version JS9
https://jaspersoft.jfrog.io/artifactory/third-party-ce-artifacts/com/lowagie/itext/2.1.7.js9/itext-2.1.7.js9-sources.jar

```