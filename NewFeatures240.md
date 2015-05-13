# New and changed features in JForum 2.4.0 #

---

JForum is in constant development and improvement, and we always try to ship the best code possible. The minimum required Java version is now Java 6.


## Libraries ##

---

  * upgrade Apache Tika from 1.4 to 1.7
  * upgrade JavaMail from 1.5.1 to 1.5.2
  * upgrade slf4j from 1.7.5 to 1.7.10
  * upgrade HSQLDB from 2.3.1 to 2.3.2
  * upgrade MySQL driver from 5.1.27 to 5.1.34
  * upgrade PostgreSQL driver from 9.3-1100-jdbc3 to 9.3-1102-jdbc4
  * upgrade Apache Commons FileUpload from 1.3 to 1.3.1
  * upgrade jQuery from 1.10.2 to 1.11.2
  * upgrade FreeMarker from 2.3.20 to 2.3.21
  * upgrade Microsoft JDBC Driver for SQL Server from 4.0 to 4.1
  * upgrade Oracle JDBC Driver from 10.2.0.4 to 12.1.0.2
  * upgrade Apache Commons IO from 2.2 to 2.4
  * upgrade Apache Commons Lang3 from 3.1 to 3.3.2
  * upgrade Apache Codec from 1.6 to 1.10
  * upgrade c3p0 from 0.9.2.1 to 0.9.5
  * upgrade Quartz from 2.1.7 to 2.2.1
  * add CSRFGuard 3.0.0


## New Features ##

---

  * fix [Issue 47](https://code.google.com/p/jforum2/issues/detail?id=47): jforum csrf vulnerability fix
  * fix [Issue 48](https://code.google.com/p/jforum2/issues/detail?id=48): tr\_TR.properties new language add
  * fix [Issue 58](https://code.google.com/p/jforum2/issues/detail?id=58): Added Dutch (Nederlandse) translation properties file
  * fix [Issue 53](https://code.google.com/p/jforum2/issues/detail?id=53): Editing color or font size do not work
  * fix [Issue 54](https://code.google.com/p/jforum2/issues/detail?id=54): Cannot differ anchor for url and anchor for google
  * fix [Issue 55](https://code.google.com/p/jforum2/issues/detail?id=55): JForum: given folder is not classpath
  * fix locale does not change after selecting a different language from list box on install.page
  * update zh\_TW.properties and zh\_CN.properties for new I18n keys
  * fix [Issue 56](https://code.google.com/p/jforum2/issues/detail?id=56): org.hsqldb.HsqlException: data exception: invalid character value for cast
  * fix [Issue 57](https://code.google.com/p/jforum2/issues/detail?id=57): Oracle TopicModel.topicPosters missing user\_twitter column
  * fix [Issue 65](https://code.google.com/p/jforum2/issues/detail?id=65): 100 char topic subject exceeds 100 chars when someone replies due to "RE:" pre-appended
  * change bottom.htm copyright year from 2013 to 2015
  * fix pom.xml resources exclusion, don't package templates directory into jforum.jar
  * fix search\_keywords encoding changed in Tomcat 8 for Chinese characters
  * change the maxlength of some html form input elements according to the db schema table definition
  * for forum administrators: ability to maintain a list of spam words and phrases that can not be used in posts
  * support Vimeo embedding analogous to Youtube embedding
  * various vulnerabilities have been fixed

## New Configurations ##

---

|**Entry name**|**Default value**|**Description**|
|:-------------|:----------------|:--------------|
|announcement|empty|This used to be configured under Admin Control Panel->Announcement; it's now under Admin Control Panel->Configurations->Public announcement|


## Database Schema ##

---

  * For the spam blocking feature: `CREATE TABLE jforum_spam (pattern VARCHAR(100) NOT NULL);`
  * Change jforum\_topics.topic\_title to VARCHAR(120)
  * Change jforum\_posts\_text.post\_subject to VARCHAR(130)
  * Change jforum\_users.user\_password to VARCHAR(128)
  * Change jforum\_users.user\_avatar to VARCHAR(255)