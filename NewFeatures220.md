# New and changed features in JForum 2.2.0 #

---

JForum is in constant development and improvement, and we always try to ship the best code possible.


## Libraries ##

---

Some libraries have changed from JForum 2.1.8 to version 2.2.0, and they are necessary to have the software running smoothly. Please make sure that no duplicated version of such exist in the WEB-INF/lib directory, as it would cause some strange runtime behavior.
Below are all changed libraries. The left column shows the old version, while the right column, the new version.

|Library|Old version|New version|
|:------|:----------|:----------|
|FreeMarker|2.3.9|2.3.16|
|HTML Parser|1.5|1.6|
|JCaptcha|1.0-RC2.0.1|1.0|
|Quartz|1.5.1|1.8.3|
|JavaMail(TM) API|1.4|1.4.3|
|JavaBeans(TM) Activation Framework (JAF)|1.0.2|1.1.1|
|Commons Codec|1.3|1.4|
|Commons FileUpload|Don't have|1.2.1|
|Commons HttpClient|3.0-rc3|Deleted|
|Commons IO|1.1|1.4|
|Commons Lang|2.3|2.5|
|Commons Logging|1.0.4|1.1.1|
|Apache log4j|1.2.12|1.2.16|
|Simple Logging Facade for Java (SLF4J)|Don't have|1.6.0|
|Lucene Core|2.2.0|3.0.2|
|Lucene Analyzer|2.2.0|3.0.2|
|Lucene Highlighter|2.2.0|3.0.2|
|JBossCache-Core|1.2.4|3.2.5.GA|
|jboss-common-core|5.0.0alpha|2.2.14.GA|
|jboss-jmx|5.0.0alpha|Deleted|
|jboss-system|5.0.0alpha|Deleted|
|JBoss Logging Programming Interface|Don't have|2.0.5.GA|
|JBoss Transaction API|Don't have|1.0.1.GA|
|Ehcache-Core|1.1|2.1.0|
|ehcache-jgroupsreplication|Don't have|1.3|
|JGroups|2.2.9-beta2|2.9.0.GA|
|c3p0|0.9.1-pre9|0.9.1.2|
|HSQLDB|1.8.0.1|1.8.1.2|
|MySQL Connector/J JDBC driver|5.0.3|5.0.8|
|PostgreSQL JDBC driver|8.0-313.jdbc3|8.4-701.jdbc3|
|Oracle JDBC driver|9.0.2.0.0|10.2.0.4.0|
|Microsoft SQL Server JDBC Driver|Don't have|2.0|
|concurrent|Unknown|Deleted|
|jaxen|1.1-beta-6|Deleted|
|jdom|1.0|Deleted|
|xalan|2.7.0|Deleted|
|Xerces-J|2.6.2|Deleted|
|xml-apis|1.2.01|Deleted|
|xmlrpc|Unknown|Deleted|
|xom|1.0|Deleted|
|jQuery|1.2.1|1.4.2|
|SyntaxHighlighter|1.5.1|2.1.364|

## New Configurations ##

---

|Entry name|Default vale|Description|
|:---------|:-----------|:----------|
|lucene.analyzer.chinese|org.apache.lucene.analysis.cjk.CJKAnalyzer|Chinese Token Analyzer|
|cache.engine.ehcache|net.jforum.cache.EhCacheEngine|Ehcache Engine implementation|