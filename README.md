# Fleet-application-Spring-boot-

This application is made up by spring boot
Fleet application to manage car,car movement and hire of car to different customer
it is role base application with the following roles
 1.Admin role
 2.Mechanics role
 3.Accountant role

it have the following parts

1.Mechanics who feed data about car model,type,make to system
2.Accountant who deal with invoices
3.Admin who control the whole system include assing and remove roles
4.Recptionist
5.Audit which can keep track of who add or change records at which time and date
6.Spring security role based

users
1.admin(username:roby ,password:12345)
2.mechanics(username:faby ,password:12345)
2.accountant(username:ayesha ,password:12345)
2.Provider(username:Tina ,password:12345)

Requirements

1.Eclipse
2.Mysql

create database name fleetDB on mysql workbench

got to src->main->resourecs->application modify depend on your database configuration username and password


spring.datasource.url=jdbc:mysql://localhost:3307/fleetDB?useSSL=false
spring.datasource.username=root
spring.datasource.password=142730mnls


#Hbibernate
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL5InnoDBDialect

spring.jpa.hibernate.ddl-auto=update

logging.level.org.hibernate.SQL=DEBUG
