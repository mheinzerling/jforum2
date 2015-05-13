# What is JForum? #
JForum is a powerful and robust discussion board system implemented in Java<sup>tm</sup>. It provides an attractive interface, an efficient forum engine, an easy to use administrative panel, an advanced permission control system and much more.

Built from the ground up around an MVC framework, it can be deployed on any servlet container or application server, such as Tomcat, Resin and JBoss. Its clean design and implementation make JForum easy to customize and extend.

Best of all, JForum is freely available under the BSD Open Source license.

If you or your company are searching for a serious and robust forum software, JForum is the right choice.


## About JForum2 Project ##
This project is branched from the JForum 2.1.8 code base and mainly focus on bug fixing and security patches. Also, the third party Java libraries(jar) are updated to the latest stable version with some code modification as needed. Since JForum 2.3.0, **Apache Maven 3** was introduced as the build tool.

## JForum Support ##
[JForum Community](http://jforum.andowson.com/) is a support forum powered by JForum itself. If you got any question about JForum, you can go there and check it there. If you find some functional issue about JForum, please create an issue through the Issues tab.

## JForum 2.4.0 Released (2015/01/30) ##
Download jforum-2.4.0.war from [here](https://sourceforge.net/projects/jforum2/files/jforum-2.4.0.war/download), see NewFeatures240 for changes

## JForum 2.3.5 Released (2014/01/15) ##
see NewFeatures235 for changes

## JForum 2.3.4 Released (2012/06/25) ##
JForum 2.3.4's Major Changes:
  * Update to bsh 2.0b5
  * Update to Commons Codec 1.6
  * Update to Commons IO 2.2
  * Update to Ehcache Core 2.4.7
  * Update to FreeMarker 2.3.19
  * Update to HSQLDB 2.2.8
  * Update to HTML Parser 2.1
  * Update to JBossCache Core 3.2.7.GA
  * Update to JBoss Common Core 2.2.19.GA
  * Update to JBoss Logging SPI 2.1.2.GA
  * Update to JDOM 2.0.2
  * Update to JGroups 2.12.3.Final
  * Update to Log4J 1.2.17
  * Update to Lucene 3.6.0
  * Update to JavaMail 1.4.5
  * Update to MySQL Connector/J JDBC Driver 5.1.20
  * Update to PostgreSQL JDBC Driver 9.1-901.jdbc3
  * Update to Quartz 2.1.5
  * Update to SLF4J-API 1.6.6
  * Update to SLF4J-Log4j12 1.6.6
  * Update to MS SQL Server JDBC Driver 4.0
  * Update to jQuery 1.7.2
  * Fix [Issue 2](https://code.google.com/p/jforum2/issues/detail?id=2): code-tag parsing breaks regular expressions (assumes fixed set of groups)
  * Fix [Issue 3](https://code.google.com/p/jforum2/issues/detail?id=3): cleanup of style.css wrt table formatting
  * Fix [Issue 4](https://code.google.com/p/jforum2/issues/detail?id=4): moderation/admin controls not shown for locked topics / cannot unlock thread
  * Fix [Issue 5](https://code.google.com/p/jforum2/issues/detail?id=5): try harder to use browser language, don't give up after the first locale
  * Fix [Issue 6](https://code.google.com/p/jforum2/issues/detail?id=6): hsqldb's Topic selectByUserByLimit uses wrong order of arguments
  * Fix [Issue 7](https://code.google.com/p/jforum2/issues/detail?id=7): checkemail javascript doesn't allow "+" in email-address (common with gmail users)
  * Fix [Issue 8](https://code.google.com/p/jforum2/issues/detail?id=8): hsqldb supports AutoKeys
  * Fix [Issue 9](https://code.google.com/p/jforum2/issues/detail?id=9): order of search keywords has impact on results, one order returns results, the other doesn't
  * Fix [Issue 10](https://code.google.com/p/jforum2/issues/detail?id=10): some agreement texts not in UTF-8 encoding
  * Fix [Issue 11](https://code.google.com/p/jforum2/issues/detail?id=11):	Exception thrown and shown in Browser if attachment without desription is attached
  * Fix [Issue 14](https://code.google.com/p/jforum2/issues/detail?id=14):	Invalid Oracle DB Update Script to modify default of jforum\_topics table topic\_views column
  * Fix [Issue 15](https://code.google.com/p/jforum2/issues/detail?id=15):	Invalid Query for Oracle DB with LIMIT statement to select TopDownloads
  * Fix [Issue 16](https://code.google.com/p/jforum2/issues/detail?id=16):	German i18n text missing
  * Fix [Issue 17](https://code.google.com/p/jforum2/issues/detail?id=17):	Admin/Set-up - changes are not saved, cannot configure Jforum!
  * Fix [Issue 21](https://code.google.com/p/jforum2/issues/detail?id=21):	SQL Error in "Top Downloads" page when using SQL Server
  * Fix [Issue 23](https://code.google.com/p/jforum2/issues/detail?id=23):	NullPointerException is thrown at net.jforum.repository.RankingRepository line 126 while iterating list
  * Fix [Issue 25](https://code.google.com/p/jforum2/issues/detail?id=25):	Stack Overflow Error at GenericBanlistDAO.java:126
  * Fix [Issue 26](https://code.google.com/p/jforum2/issues/detail?id=26):	RESTAuthenticationTestCase fails on oracle
  * Fix [Issue 27](https://code.google.com/p/jforum2/issues/detail?id=27):	SummaryTest.testListPosts() fail when jforum is freshly installed
  * Fix [Issue 28](https://code.google.com/p/jforum2/issues/detail?id=28):	the junit test SummaryTest depends on google's smtp serve
  * Fix [Issue 29](https://code.google.com/p/jforum2/issues/detail?id=29):	SummaryDAO seems not working on Oracle. It tries to read a blob as a String which results a NullPointerException
  * Fix [Issue 31](https://code.google.com/p/jforum2/issues/detail?id=31):	JForum doesn't start after manual installation with oracle database.
  * Fix [Issue 32](https://code.google.com/p/jforum2/issues/detail?id=32):	LuceneSearchTestCase fails
  * Fix [Issue 36](https://code.google.com/p/jforum2/issues/detail?id=36):	About Fetch mail

---

## JForum 2.3.3 Released (2011/12/01) ##
JForum 2.3.3's Major Changes:

  * Update to Commons Lang 3.1
  * Update to HSQLDB 2.2.6
  * Update to Lucene 3.5.0
  * Update to Quartz 2.1.1
  * Update to SLF4J-API 1.6.4
  * Update to SLF4J-Log4j12 1.6.4
  * Update to JGroups 2.12.2.Final
  * Update to jQuery 1.7.1
  * Fix PostREST to return a link to the post after the insert
  * Fix Smilie is not displayed when disable BBCode
  * Fix the installation process to support WebLogic Server
  * Avoid CSS @import
  * Remove the tail query string(${startupTime}) of some static files(.css, .js)
  * Update web.xml to support JBoss AS
  * Make sure user email in not an empty string before sending
  * Change default lucene analyzer to StandardAnalyzer

---

## JForum 2.3.2 Released (2011/10/17) ##
JForum 2.3.2's Major Changes:

  * Update to Commons IO 2.1
  * Update to Commons Lang 3.0.1
  * Update to Ehcache Core 2.4.6
  * Update to Apache Lucene 3.4.0
  * Update to MySQL JDBC Driver 5.1.18
  * Update to Quartz 2.1.0
  * Update to SLF4J-API 1.6.2
  * Update to jQuery 1.6.4
  * Add JDOM 1.1.1
  * Use StopForumSpam.com api to ban forum spam during user registration
  * Check external avatar URL is really an image before save it
  * Record session ip
  * Change table jforum\_attach\_desc column mimetype to varchar(85) to support Microsoft Office 2007/2010 documents
  * Add PostREST.java for postApi which allows other application adding a post outside JForum
  * Add isAdmin(), isModerator() and isModerator(forumId) to User.java for checking poster's role
  * Apply patch for Terracotta/Ehcache
  * Fix online user session count after user registration
  * Fix if only exist one special rank in JForum, all users are marked as the special rank.
  * Fix post hasCodeBlock detection

---

## JForum 2.3.1 Released (2011/08/09) ##
JForum 2.3.1's Major Changes:
    * Update to Apache Lucene 3.3.0
    * Update to MySQL JDBC Driver 5.1.17
    * Update to jQuery 1.6.2
    * Display moderator username instead of group name
    * Fix post cache issues

---

## JForum 2.3.0 Released (2011/07/01) ##
JForum 2.3.0's Major Changes:
    * Introduced **Apache Maven 3** as project management tool
    * Update to Apache Lucene 3.2.0
    * Update to jQuery 1.6.1

---

## JForum 2.2.1 Released (2010/11/01) ##
JForum 2.2.1's Major Changes:
    * Add Top Download
    * Add browser language detection automatically

---

## JForum 2.2.0 Released (2010/07/01) ##
JForum 2.2.0's Major Changes:

Support or requirement:
  * Java 5
  * JBoss Cache 3.2
  * Lucene 3.0