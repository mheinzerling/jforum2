# Manual Installation #

Here will be shown how to manually configure and install JForum. It is assumed that you have some knowledge of how to install / configure a Java servlet container (or already have one up and running), and the database is properly configured.

For automated installation, check the Installation & configuration - Wizard section.

Note: These instructions are for the installation of JForum, release version 2.3.x. Some of the steps here described may not be valid for older versions, which are no longer supported.

## Downloading JForum ##

---

To get JForum, go to the [download page](http://code.google.com/p/jforum2/downloads/list) and get the latest version.

## Unpacking ##

---

After the download, unpack the .war file into your webapp's directory (or any place you want to put it). A directory named _jforum-`<`release`>`_ will be created, where `<`release`>` is the version, which may be "2.3.0", "2.3.1" etc... this it just for easy version identification.

You can rename the directory if you want. The next step you should do is register the JForum application within your Servlet Container, like [Tomcat](http://tomcat.apache.org). This document will use the context name "jforum", but of course you can use any name you want.

## Directory permissions ##

---

JForum expects that some directories are writable by the web server. Before you start installing, please check if the following directories, and their sub-directories, exist and have full write permissions:

  * upload
  * tmp
  * images
  * WEB-INF/config
  * WEB-INF/jforumLuceneIndex

## Database configuration ##

---

First of all, you must have [MySQL](http://www.mysql.com/), [PostgreSQL](http://www.postgresql.org), [Oracle](http://www.oracle.com) or [SQL Server](http://www.microsoft.com/sqlserver/) installed and properly configured. [HSQLDB](http://www.hsqldb.org/) is supported as well, and has built-in support, so you don't need to download it (eg, it is an embedded database).

Open the file _WEB-INF/config/SystemGlobals.properties_. Now search for a key named `database.driver.name` and configure it according to the following table:
|Database|  	Key value|
|:-------|:-----------|
|MySQL| 	mysql|
|PostgreSQL| 	postgresql|
|HSQLDB| 	hsqldb|
|Oracle| 	oracle|
|SQL Server| 	sqlserver|

The default value is mysql, which means JForum will try to use MySQL. Note that the value should be in lowercase.

Next, you can tell JForum whether to use a Connection Pool or not. A connection pool will increase the performance of your application, but there are some situations where the use of a connection pool is not recommended or even possible, so you can change it according to your needs.

By default JForum uses a connection pool, option which is specified by the key `database.connection.implementation`. The following table shows the possible values for this key:
|Connection Storage Type  	|Key value|
|:-------------------------|:--------|
|Pooled Connections 	|_net.jforum.PooledConnection_|
|Simple Connections 	|_net.jforum.SimpleConnection_|
|DataSource Connections 	|_net.jforum.DataSourceConnection_|

If you have chosen _net.jforum.DataSourceConnection_, then set the name of the datasource in key `database.datasource.name`, and ignore the table below. Otherwise, do the following steps:

Edit the file _WEB-INF/config/database/`<`DBNAME`>`/`<`DBNAME`>`.properties_, where _`<`DBNAME`>`_ is the database name you are using - for instance, mysql, postgresql or hsqldb. In this file there are some options you should change, according to the table below:
|Key Name  	|Key value description|
|:----------|:--------------------|
|database.connection.username 	|_Database username_|
|database.connection.password 	|_Database password_|
|database.connection.host 	|_The host where the database is located_|
|dbname 	|_The database name. The default value is jforum. All JForum tables are preceded by "jforum`_`", so you don't need to worry about conflicting table names._|

The other properties you may leave with the default values if you don't know what to put.

## Creating the database tables ##

---

The next step is to create the tables. To do that, use the create script named "_`<`DBNAME`>_`db\_struct.sql_", placed at _WEB-INF/config/database/`<`DBNAME`>`_. This script will create all necessary tables to run JForum. The script was tested and should work with no problem at all. Also, please keep in mind that if you are upgrading JForum you need to take a look to see if a migration script exists. Look in the file named "_Readme.txt_" in the root directory to see.

## Populating the tables ##

---

Now it is time to run the script to populate the database tables. To do that, use the script named "_`<`DBNAME`>_`data\_dump.sql_", also located at _WEB-INF/config/database/`<`DBNAME`>`_. One more time, you should have no problems with this step. If you do, please remember to inform the error message, as well the database name and version you're using.

## General configuration ##

---

The main configuration file for JForum is _WEB-INF/config/SystemGlobals.properties_. The file is well documented, and you certainly will want to change some of the settings there, like forum's URL, name, description, location of some directories and etc.

You need to create a customed configuration file named _jforum-custom.conf_ under WEB-INF/config/ directory. Add the following key and value into it:
installed=true

## Security Information and Considerations ##

---

  * Remove the line "`install = net.jforum.view.install.InstallAction`" from the file _WEB-INF/config/modulesMapping.properties_
  * JForum uses a servlet mapping to invoke the pages. This mapping is `*`.page, and is already properly configured at _WEB-INF/web.xml_. If you are running JForum on an ISPs which have Apache HTTPD in front of Tomcat, you may need to contact their Technical Support and ask them to explicity enable the mapping for you.
  * The directory "images", "tmp", "upload" and "WEB-INF" (and their sub-directories) should have write permission to the user who runs the web server. You'll get nasty exceptions if there is no write permission. In the same way, if you're going to use the file attachments support, the directoy you'd chosen to store the files ("uploads" by default) should also be writable.
  * The administration interface is accessible via the link Admin Control Panel, located in the bottom of the main page. You will only see this link if you are logged as Administrator. See above the default password for the admin user:

> The username is Admin and the password is admin
  * This step is **HIGHLY** recommended: Open the file _WEB-INF/config/SystemGlobals.properties_ and search for a key named `user.hash.sequence`. There is already a default value to the key, but is **VERY RECOMMENDED** that you change the value. It may be anything, and you won't need to remember the value. You can just change one or other char, insert some more... just type there some numbers and random characters, and then save the file. This value will be used to enhance the security of your JForum installation, and you will just need to do this step once.
