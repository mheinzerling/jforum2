# New and changed features in JForum 2.3.5 #

---


## Libraries ##

---

Some libraries have been updated in this release, and they are necessary to have the software running smoothly. Please make sure that no duplicated version of such exist in the WEB-INF/lib directory, as it would cause some strange runtime behavior.

  * C3P0 0.9.2.1
  * Commons FileUpload 1.3
  * Lucene 3.6.2
  * jQuery 1.10.2
  * JDOM 2.0.5
  * JavaMail 1.5.1
  * FreeMarker 2.3.20
  * EhCache 2.4.8
  * MySQL driver 5.1.27
  * PostgreSQL JDBC Driver 9.3-1100
  * HSQLDB 2.3.1
  * Quartz 2.1.7
  * slf4j 1.7.5

## New Features ##

---

  * RSS feed for a particular user's posts
  * New search options: exact phrase, subject/message differentiation, search by date, search by username/user ID, group by forum
  * New BB tags "tt", "strike" and "wikipedia" (even language-specific)
  * Enhancements to the "My Bookmarks" page: listing forum and topic watches
  * Added link to a user's public profile page on his/her profile edit page
  * Fixed a couple of XSS vulnerabilities
  * Built-in access statistics for board administrators
  * Use porter stemming for indexing content - makes it easier to find singular/plural forms of words
  * User profiles support Twitter handles
  * Option to display a board-wide announcement at the top of each page
  * Option to index and search post attachments
  * Runs on OpenJDK if you use this [patched JCaptcha library](http://code.google.com/p/jforum2/downloads/list)
  * The header contains a link "My Posts" to all posts made by the current user
  * It's possible to share a post on multiple sites via ShareThis integration
  * Improvement to the user post page - the post text can be revealed only upon a button click (makes the page easier to work with if multiple lengthy posts are found)
  * add support for [X-FRAME-OPTIONS header](https://developer.mozilla.org/en-US/docs/HTTP/X-Frame-Options) to guard against clickjacking

## New Configurations ##

---

|**Entry name**|**Default value**|**Description**|
|:-------------|:----------------|:--------------|
|google.analytics.tracker|blank|Filling in a Google Analytics ID will cause a GA tracking snippet to be inserted in each forum page|
|posts.edit.after.reply|true|If set to false, disallows editing a post (or a reply) after there have been later replies|
|show.online.status | true | Whether or not to show the online status of users |
|show.ip | true | Whether or not to show the IP address for a post |
|show.avatar | true | Whether or not to show avatars |
|karma.show | true | Whether or not to show karma |
|lucene.index.attachments | false | Whether post attachments should be searched along with the post text. This feature might use a lot of memory. |
|social.enabled | false | Whether to show the ShareThis button on the topic page. |
|user.posts.toggle | false | Whether the post contents on the user post page are always visible, or whether they're initially invisible, and displayed only after a mouse click. |
| http.x-frame-options | SAMEORIGIN | prevents framing of the web app by some other site to guard against clickjacking (framing by the same site is still possible); use DENY to prevent all framing; leave blank to allow all framing |

## Database Schema ##

---

  * ALTER TABLE jforum\_users ADD COLUMN user\_twitter VARCHAR(50) DEFAULT NULL;

  * For PostgreSQL only: fixed a bug for posts made during the hour when daylight savings time (DST) is switched back by an hour
  * ALTER TABLE jforum\_posts ALTER COLUMN post\_time TYPE timestamp with time zone;
  * ALTER TABLE jforum\_posts ALTER COLUMN post\_edit\_time TYPE timestamp with time zone;
  * ALTER TABLE jforum\_topics ALTER COLUMN topic\_time TYPE timestamp with time zone;