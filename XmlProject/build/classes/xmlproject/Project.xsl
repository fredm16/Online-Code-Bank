<?xml version="1.0" encoding="UTF-8"?>

<!--
    Document   : Project.xsl
    Created on : 03 November 2020, 10:32
    Author     : david
    Description:
        Purpose of transformation follows.
-->

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>

    <!-- TODO customize transformation rules 
         syntax recommendation http://www.w3.org/TR/xslt 
    -->
    <xsl:template match="/">
        <html>
            <head>
                <title>Contact Page</title>
            </head>
            <body style="background-color:red; font-family: brush script mt">
                <h1>Contact Page</h1>
                <ul>
                    <a href= "mailto:davidbyrne860@gmail.com">Email us here</a><br></br>
                    <a href= "tel:0858869368"> Call us at 085-886-9368</a><br></br>
                    <a href= "sms:0858869368"> Text us at 085-886-9368</a><br></br>
                </ul>
                <h2>These are the hours we can be contacted</h2>
                <ul>
                    <a>Monday~9:00 A.M.- 5:00 P.M.</a><br></br>
                    <a>Tuesday~9:00 A.M.- 5:00 P.M.</a><br></br>
                    <a>Wednesday~9:00 A.M.- 2:30 P.M.</a><br></br>
                    <a>Thursday~9:00 A.M.- 5:00 P.M.</a><br></br>
                    <a>Friday~9:00 A.M.- 5:00 P.M.</a><br></br>
                    <a>Saturday~11:00 A.M.- 1:00 P.M.</a><br></br>
                    <a>Sunday~Closed</a><br></br>
                </ul>
                <h3>IMPORTANT:Due to higher demand replys may take 2/3 business days</h3>
            </body>
        </html>
    </xsl:template>

</xsl:stylesheet>
