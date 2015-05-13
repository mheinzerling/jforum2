# New and changed features in JForum 2.2.1 #

---

JForum is in constant development and improvement, and we always try to ship the best code possible.


## Libraries ##

---

Some libraries have changed from JForum 2.2.0 to version 2.2.1, and they are necessary to have the software running smoothly. Please make sure that no duplicated version of such exist in the WEB-INF/lib directory, as it would cause some strange runtime behavior.
Below are all changed libraries. The left column shows the old version, while the right column, the new version.

|Library|Old version|New version|
|:------|:----------|:----------|
|Commons FileUpload|1.2.1|1.2.2|
|HSQLDB|1.8.1.2|1.8.1.3|
|JGroups|2.9.0.GA|2.10.0.GA|
|PostgreSQL JDBC Driver|8.4-701|9.0-801|
|SLF4J-API|1.6.0|1.6.1|
|SLF4J-Log4J12|1.6.0|1.6.1|

## New Configurations ##

---

|Entry name|Default vale|Description|
|:---------|:-----------|:----------|
|search.result.limit|50000|max number of posts in the search result|
|top.downloads|50|number of top downloads to be displayed|