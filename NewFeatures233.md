# New and changed features in JForum 2.3.3 #

---

JForum is in constant development and improvement, and we always try to ship the best code possible.


## Libraries ##

---

Some libraries have been changed from JForum 2.3.2 to version 2.3.3, and they are necessary to have the software running smoothly. Please make sure that no duplicated version of such exist in the WEB-INF/lib directory, as it would cause some strange runtime behavior.
Below are all changed libraries. The left column shows the old version, while the right column, the new version.

|Library|Old version|New version|
|:------|:----------|:----------|
|Commons Lang|3.0.1|3.1|
|HSQLDB|2.2.4|2.2.6|
|JGroups|2.12.1.Final|2.12.2.Final|
|Lucene Core|3.4.0|3.5.0|
|Lucene Analyzers|3.4.0|3.5.0|
|Lucene Highlighter|3.4.0|3.5.0|
|Lucene Memory|3.4.0|3.5.0|
|Lucene Queries|3.4.0|3.5.0|
|Quartz|2.1.0|2.1.1|
|SLF4J-API|1.6.2|1.6.4|
|SLF4J-Log4J12|1.6.2|1.6.4|
|jQuery|1.6.4|1.7.1|


## New Configurations ##

---

lucene.analyzer = ${lucene.analyzer.default}

## Database Schema ##

---

None