# SimpleJDBC
Two simple classes to use you're MySQL-Database in Java
(Please make sure to have mySQL and the mySQL Notifier installed)

Here's a quick cheat sheed for the MySQL stuff:

<ins>To start the server (on Windows):</ins>

 - enter the cmd
 - cd to the 'MySQL Workbench' folder:
	press win and enter 'MySQL Workbench'
	press 'Open file location'
	right click MySQL Workbench and press 'Open file location'
	copy the path to your clipboard
	switch to the cmd and enter 'cd' and paste the location
 - log-in:
	enter in the cmd 'mysql -u <username> -p'
	type in your password
 - quit: type 'quit'

 - actions on the database-server:
	right click the notifier (click on the arrow facing up in your taskbar to find it)
	select the right database by hovering over it
	press on start/stop/restart
 
<ins>Important Commands:</ins>
	
drop database <database name>; - deletes database permanently
show databases; - shows all installed databases
 - normally: information_schema, mysql, performance_schema, sys
create database <database name>; - create new database
use <database name>; - select the database you want to work with
create table <table name> (<column name> <datatype (length)>); - creates new tables in the db
 - datatypes are: int, char(always fixed lenght), varchar(variable length, but max.), date, ...
insert into <table name> values (<values>); - fill in the rows of the table
 - values: always in '' and seperated by ,
delete from <table name> where <condition>; - deletes a row in the table
 - 'where <condition>' can be left out to delete everything in the table
 - condition: <table name> = '<value>'
