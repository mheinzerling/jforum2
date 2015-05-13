# New and changed features in JForum 2.3.4 #

---

JForum is in constant development and improvement, and we always try to ship the best code possible.


## Libraries ##

---

Some libraries have been changed from JForum 2.3.3 to version 2.3.4, and they are necessary to have the software running smoothly. Please make sure that no duplicated version of such exist in the WEB-INF/lib directory, as it would cause some strange runtime behavior.
Below are all changed libraries. The left column shows the old version, while the right column, the new version.

|Library|Old version|New version|
|:------|:----------|:----------|
|bsh|2.0b4|2.0b5|
|Commons Codec|1.5|1.6|
|Commons IO|2.1|2.2|
|Ehcache Core|2.4.6|2.4.7|
|FreeMarker|2.3.18|2.3.19|
|HSQLDB|2.2.6|2.2.8|
|HTML Lexer|- |2.1|
|HTML Parser|1.6|2.1|
|JBossCache Core|3.2.5.GA|3.2.7.GA|
|JBoss Common Core|2.2.14.GA|2.2.19.GA|
|JBoss Logging SPI|2.0.5.GA|2.1.2.GA|
|JDOM|1.1.1|2.0.2|
|JGroups|2.12.2.Final|2.12.3.Final|
|Log4J|1.2.16|1.2.17|
|Lucene Analyzers|3.5.0|3.6.0|
|Lucene Core|3.5.0|3.6.0|
|Lucene Highlighter|3.5.0|3.6.0|
|Lucene Memory|3.5.0|3.6.0|
|Lucene Queries|3.5.0|3.6.0|
|JavaMail|1.4.4|1.4.5|
|MySQL Connector/J JDBC Driver|5.1.18|5.1.20|
|PostgreSQL JDBC Driver|9.0-801.jdbc3|9.1-901.jdbc3|
|Quartz|2.1.1|2.1.5|
|SLF4J-API|1.6.4|1.6.6|
|SLF4J-Log4J12|1.6.4|1.6.6|
|MS SQL Server JDBC Driver|2.0|4.0|
|jQuery|1.7.1|1.7.2|


## New Configurations ##

---

|Entry name|Default vale|Description|
|:---------|:-----------|:----------|
|avatar.image.dir|images/avatar|Avatar images path in URL|
|avatar.store.dir|${application.path}/${avatar.image.dir}/|Avatar images stored path in file system|
|stopForumSpam.api.enabled|true|Enable StopForumSpam API|
|stopForumSpam.api.url|http://www.stopforumspam.com/api?|StopForumSpam API URL|

## Database Schema ##

---

None