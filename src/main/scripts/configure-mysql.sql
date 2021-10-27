
#docker run --name mysql-test -e MYSQL_ROOT_PASSWORD=pass -d -p 3306:3306 mysql

#CREATE DATABASES
CREATE DATABASE sf_recipe_dev;
CREATE DATABASE sf_recipe_prod;

#CREATE DATABASES USERS ACCOUNTS
CREATE USER 'sf_recipe_dev_user'@'localhost' IDENTIFIED BY 'recipe';
CREATE USER 'sf_recipe_prod_user'@'localhost' IDENTIFIED BY 'recipe';

#NO LOCAL INSTANCE
CREATE USER 'sf_recipe_dev_user'@'%' IDENTIFIED BY 'recipe';
CREATE USER 'sf_recipe_prod_user'@'%' IDENTIFIED BY 'recipe';

#DATABASES GRANTS LOCAL INSTANCE
GRANT SELECT ON sf_recipe_dev.* TO 'sf_recipe_dev_user'@'localhost';
GRANT INSERT ON sf_recipe_dev.* TO 'sf_recipe_dev_user'@'localhost';
GRANT DELETE ON sf_recipe_dev.* TO 'sf_recipe_dev_user'@'localhost';
GRANT UPDATE ON sf_recipe_dev.* TO 'sf_recipe_dev_user'@'localhost';
GRANT SELECT ON sf_recipe_prod.* TO 'sf_recipe_prod_user'@'localhost';
GRANT INSERT ON sf_recipe_prod.* TO 'sf_recipe_prod_user'@'localhost';
GRANT DELETE ON sf_recipe_prod.* TO 'sf_recipe_prod_user'@'localhost';
GRANT UPDATE ON sf_recipe_prod.* TO 'sf_recipe_prod_user'@'localhost';

#NO LOCAL INSTANCE
GRANT SELECT ON sf_recipe_dev.* TO 'sf_recipe_dev_user'@'%';
GRANT INSERT ON sf_recipe_dev.* TO 'sf_recipe_dev_user'@'%';
GRANT DELETE ON sf_recipe_dev.* TO 'sf_recipe_dev_user'@'%';
GRANT UPDATE ON sf_recipe_dev.* TO 'sf_recipe_dev_user'@'%';
GRANT SELECT ON sf_recipe_prod.* TO 'sf_recipe_prod_user'@'%';
GRANT INSERT ON sf_recipe_prod.* TO 'sf_recipe_prod_user'@'%';
GRANT DELETE ON sf_recipe_prod.* TO 'sf_recipe_prod_user'@'%';
GRANT UPDATE ON sf_recipe_prod.* TO 'sf_recipe_prod_user'@'%';


