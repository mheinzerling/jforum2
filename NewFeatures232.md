# New and changed features in JForum 2.3.2 #

---

JForum is in constant development and improvement, and we always try to ship the best code possible.


## Libraries ##

---

Some libraries have been changed from JForum 2.3.1 to version 2.3.2, and they are necessary to have the software running smoothly. Please make sure that no duplicated version of such exist in the WEB-INF/lib directory, as it would cause some strange runtime behavior.
Below are all changed libraries. The left column shows the old version, while the right column, the new version.

|Library|Old version|New version|
|:------|:----------|:----------|
|Commons IO|2.0.1|2.1|
|Commons Lang|2.6|3.0.1|
|Ehcache Core|2.4.2|2.4.6|
|JDOM|- |1.1.1|
|Lucene Core|3.3.0|3.4.0|
|Lucene Analyzers|3.3.0|3.4.0|
|Lucene Highlighter|3.3.0|3.4.0|
|Lucene Memory|3.3.0|3.4.0|
|Lucene Queries|3.3.0|3.4.0|
|MySQL Connector/J JDBC Driver|5.1.17|5.1.18|
|Quartz|2.0.2|2.1.0|
|SLF4J-API|1.6.1|1.6.2|
|SLF4J-Log4J12|1.6.1|1.6.2|
|jQuery|1.6.2|1.6.4|


## New Configurations ##

---

None

## Database Schema ##

---

Table: jforum\_attach\_desc
  * mimetype VARCHAR(50)=>mimetype VARCHAR(85)