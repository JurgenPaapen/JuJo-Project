DROP TABLE IF EXISTS User;
DROP TABLE IF EXISTS Project;
DROP TABLE IF EXISTS Task;
DROP TABLE IF EXISTS Client;
DROP TABLE IF EXISTS User_Project;
DROP TABLE IF EXISTS Task_Project;

CREATE TABLE User (
  ID int(10) NOT NULL,
  CompanyName varchar(255) NOT NULL,
  FirstName varchar(100) NOT NULL,
  LastName varchar(255) NOT NULL,
  Address varchar(255) NOT NULL,
  HouseNumber varchar(10) NOT NULL,
  ZippCode varchar(7) NOT NULL,
  City varchar(255) NOT NULL,
  PhoneNumber int(10) NOT NULL,
  Email varchar(255) NOT NULL,
  VATNumber varchar(255) NOT NULL,
  KVKNumber int(100) NOT NULL,
      PRIMARY KEY (ID),
      UNIQUE INDEX (ID));

CREATE TABLE Project (
  ID int(10) NOT NULL AUTO_INCREMENT,
  Type varchar(75) NOT NULL,
  Name varchar(255) NOT NULL,
  ClientID int(10) NOT NULL,
      PRIMARY KEY (ID));

CREATE TABLE Task (
  ProjectID int(10) NOT NULL AUTO_INCREMENT,
  Name varchar(255) NOT NULL,
  CostPerHour int(10) NOT NULL,
      PRIMARY KEY (ProjectID));

CREATE TABLE Client (
  ID int(10) NOT NULL AUTO_INCREMENT,
  CompanyName varchar(255) NOT NULL,
  Address varchar(255) NOT NULL,
  ZipCode varchar(255) NOT NULL,
  City varchar(255) NOT NULL,
  Country varchar(255) NOT NULL,
  Email varchar(255),
      PRIMARY KEY (ID),
      UNIQUE INDEX (ID));

CREATE TABLE User_Project (
  UserID int(10) NOT NULL,
  ProjectID int(10) NOT NULL,
      PRIMARY KEY (UserID, ProjectID));


CREATE TABLE Task_Project (
  TaskProjectID int(10) NOT NULL,
  ProjectID int(10) NOT NULL,
  Timestamp timestamp NOT NULL,
  Duration time NOT NULL,
      PRIMARY KEY (TaskProjectID, ProjectID));

ALTER TABLE Project
    ADD CONSTRAINT FKProject552187
      FOREIGN KEY (ClientID) REFERENCES Client (ID);

ALTER TABLE User_Project
    ADD CONSTRAINT FKUser_Proje800064
      FOREIGN KEY (UserID) REFERENCES `User` (ID);

ALTER TABLE User_Project
    ADD CONSTRAINT FKUser_Proje828875
      FOREIGN KEY (ProjectID) REFERENCES Project (ID);

ALTER TABLE Task_Project
    ADD CONSTRAINT FKTask_Proje568126
      FOREIGN KEY (TaskProjectID) REFERENCES Task (ProjectID);

ALTER TABLE Task_Project
    ADD CONSTRAINT FKTask_Proje188997
      FOREIGN KEY (ProjectID) REFERENCES Project (ID);
