# New and changed features that have not yet been released #

---

JForum is in constant development and improvement, and we always try to ship the best code possible. The minimum required Java version is now Java 6.


## Libraries ##

---

  * updated PostgreSQL driver from 9.3-1102-jdbc4 to 9.4-1201-jdbc4
  * updated FreeMarker from 2.3.21 to 2.3.22
  * updated JDOM2 from 2.0.5 to 2.0.6
  * updated JavaMail from 1.5.2 to 1.5.3
  * updated Apache Commons Lang3 from 3.3.2 to 3.4
  * updated JBoss Cache from 2.2.19 to 2.2.22
  * updated SLF4J from 1.7.10 to 1.7.12
  * updated MySQL driver from 5.1.34 to 5.1.35
  * updated Apache Tika from 1.7 to 1.8


## New Features and fixes ##

---

  * Better fix for "Arbitrary File Upload and Remote Code Execution – Smileys"
  * Only show number of edits of a post to logged-in users
  * Don't ignore user's "Hide my online status" setting
  * Salt the user password with an installation-specific value
  * Fix problem where smilies could not be inserted into posts by clicking their icons
  * Added some missing settings to the Configurations page
  * Dates can be displayed in the local timezone of the forum visitor instead of the timezone of the forum server
  * [broken "can edit message" setting](http://jforum.andowson.com/posts/list/117.page) has been fixed
  * Numerous code improvements suggested by FindBugs and PMD
  * fix [Issue 22](https://code.google.com/p/jforum2/issues/detail?id=22): Some user attributes not stored in DB
  * fix [Issue 66](https://code.google.com/p/jforum2/issues/detail?id=66): Improve Automatic URL matching

## New Configurations ##

---

|**Entry name**|**Default value**|**Description**|
|:-------------|:----------------|:--------------|
|dateTime.local|false|whether to display dates in the visitor timezone or the server timezone|


## Database Schema ##

---
