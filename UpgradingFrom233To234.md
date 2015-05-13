# Upgrading from version 2.3.3 to 2.3.4 #

---

Upgrading from JForum version 2.3.3 to version 2.3.4 is easy. All you have to do is to carefully follow the steps here described.

The suggested approach is to unpack JForum 2.3.4 into some temporary directory, make the steps here shown, and then, when all is finished and tested, copy it over the directory where the previous version is located. This is a suggestion, and you're free to proceed the way you prefer.

## What's new ##

---

For a list of changes made in JForum 2.3.4, please check [New and Changed Features in JForum 2.3.4](NewFeatures234.md).
## Backup your data ##

---

First, make a backup of the database and the current directory where JForum is installed. JForum's directories are: _templates_, _images_, _upload_ and _WEB-INF/config_. Each database has a different backup [tool](http://www.aquafold.com/), so please check its documentation or with your system administrator. For HSQLDB backup, the database files are in the directory _WEB-INF/config/database/hsqldb_, and all you have to do is to copy it.
## Backup configuration files ##

---

You'd like to take special care for _SystemGlobals.properties_, _jforum-custom.conf_ and _quartz-jforum.properties_, as these are the main configuration files. Backup them and then compare and merge your current version with the new version that comes with JForum 2.3.4. The same is valid for database-specific configurations, that are stored in the directory _WEB-INF/config/database_.
## Check the configuration files ##

---

### SystemGlobals.properties / jforum-custom.conf ###

Open the file _WEB-INF/config/SystemGlobals.properties_ and check every property, setting it up according to your needs. Please note that JForum stores customized configurations (those saved from the Admin Panel -> Configurations page) into a file named _jforum-custom.conf_, which your current installation of JForum may or may not have. If you have it, please make sure to update any necessary value there as well.
### modulesMapping.properties ###

Open the file _WEB-INF/config/modulesMapping.properties_ and remove the following line, if it exists:

`install = net.jforum.view.install.InstallAction`
### quartz-jforum.properties ###
Open the file _WEB-INF/config/quartz-jforum.properties_ and check every schedule, setting it up according to your needs.
## Testing ##

---

Now, test JForum 2.3.4 before adding it to the production environment. The easier way is to put it under some another Context. If it starts and runs without any problems, then you can proceed to the final step, which is just a matter of replacing the old version with this new one.