# New and changed features in JForum 2.3.0 #

---

JForum is in constant development and improvement, and we always try to ship the best code possible.


## Libraries ##

---

Some libraries have changed from JForum 2.2.1 to version 2.3.0, and they are necessary to have the software running smoothly. Please make sure that no duplicated version of such exist in the WEB-INF/lib directory, as it would cause some strange runtime behavior.
Below are all changed libraries. The left column shows the old version, while the right column, the new version.

|Library|Old version|New version|
|:------|:----------|:----------|
|Commons Codec|1.4|1.5|
|Commons Collections|- |3.2.1|
|Commons IO|1.4|2.0.1|
|Commons Lang|2.5|2.6|
|Ehcache Core|2.1.0|2.4.2|
|Ehcache Jgroups Replication|1.3|1.4|
|FreeMarker|2.3.16|2.3.18|
|HSQLDB|1.8.1.3|2.2.4|
|JGroups|2.10.0.GA|2.12.1.Final|
|JTA|- |1.1|
|Lucene Core|3.0.2|3.2.0|
|Lucene Analyzers|3.0.2|3.2.0|
|Lucene Highlighter|3.0.2|3.2.0|
|Lucene Memory|- |3.2.0|
|Lucene Queries|- |3.2.0|
|JavaMail|1.4.3|1.4.4|
|MySQL Connector/J JDBC Driver|5.0.8|5.1.16|
|Quartz|1.8.3|2.0.1|

## New Configurations ##

---

|Entry name|Default vale|Description|
|:---------|:-----------|:----------|
|mail.pop3.disabletop|true|If set to true, the POP3 TOP command will not be used to fetch message headers.|