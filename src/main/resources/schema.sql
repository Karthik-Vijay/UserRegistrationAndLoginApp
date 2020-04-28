DROP TABLE IF EXISTS USER;

CREATE TABLE IF NOT EXISTS USER
(
   USERNAME varchar(255) not null,
   PASSWORD varchar(255) not null,
   EMAIL varchar(255) not null,
   ADDRESS varchar(255) not null,
   PHONENO varchar(255) not null,
   PRIMARY key(USERNAME)
);
