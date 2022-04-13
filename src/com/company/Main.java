package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*
        CREATE TABLE students(
                id INTEGER PRIMARY KEY ,
                name VARCHAR (55)NOT NULL ,
                adres VARCHAR(150)NOT NULL ,
                mail VARCHAR(70)NOT NULL ,
                biriktir int REFERENCES course(id)

);
        INSERT INTO students(id, name, adres, mail, biriktir)
        VALUES (1,'Shmit','Berlin Germany','shmit@gmail.com',1),
                (2,'Maya','Paris France','maya@gmail.com',2),
        (3,'Jon ','London England','jon@gmail.com',3);

        CREATE TABLE course(
                id INTEGER PRIMARY KEY ,
                courseName VARCHAR (55)NOT NULL ,
                lessonName VARCHAR (55),
                adres VARCHAR(150)NOT NULL,
                biriktir INTEGER REFERENCES teachers(id)

        );
        INSERT INTO course(id, courseName, lessonName,adres,biriktir)
        VALUES (1,'Peacksoft','JAVA','Berlin Germany',1),
                (2,'Penthuse','JAVASCRİPT','Paris France',2),
        (3,'SoftAcademy','C#','London England',3);

        CREATE TABLE teachers(
                id INTEGER PRIMARY KEY ,
                name VARCHAR (55)NOT NULL ,
                adres VARCHAR(150)NOT NULL ,
                mail VARCHAR(70)NOT NULL ,
                number VARCHAR(15)

        );
        INSERT INTO teachers(id, name, adres, mail, number)
        VALUES (1,'Borise','Amsterdam Holland','borise@gmail.com','+4393743735'),
                (2,'Zoya','Kiev Ukraine','zoya@gmail.com','+4987399576276'),
        (3,'Kerry ','Qubek Canada','kerry@gmail.com','+438463594735');

        CREATE TABLE university(
                id INTEGER PRIMARY KEY ,
                name VARCHAR (55)NOT NULL ,
                adres VARCHAR(150)NOT NULL ,
                mail VARCHAR(70)NOT NULL ,
                biriktir int REFERENCES course(id)

);
        INSERT INTO university(id, name, adres, mail, biriktir)
        VALUES (1,'Berlin University','Berlin Germany','shmit@gmail.com',1),
                (2,'Parise University','Paris France','maya@gmail.com',2),
        (3,'London University','London England','jon@gmail.com',3);

        CREATE TABLE course(
                id INTEGER PRIMARY KEY ,
                courseName VARCHAR (55)NOT NULL ,
                lessonName VARCHAR (55),
                adres VARCHAR(150)NOT NULL,
                biriktir INTEGER REFERENCES teachers(id)

        );
        INSERT INTO course(id, courseName, lessonName,adres,biriktir)
        VALUES (1,'Peacksoft','JAVA','Berlin Germany',1),
                (2,'Penthuse','JAVASCRİPT','Paris France',2),
        (3,'SoftAcademy','C#','London England',3);

        CREATE TABLE teachers(
                id INTEGER PRIMARY KEY ,
                name VARCHAR (55)NOT NULL ,
                adres VARCHAR(150)NOT NULL ,
                mail VARCHAR(70)NOT NULL ,
                number VARCHAR(15)

        );
        INSERT INTO teachers(id, name, adres, mail, number)
        VALUES (1,'Borise','Amsterdam Holland','borise@gmail.com','+4393743735'),
                (2,'Zoya','Kiev Ukraine','zoya@gmail.com','+4987399576276'),
        (3,'Kerry ','Qubek Canada','kerry@gmail.com','+438463594735');

        CREATE TABLE college(
                id INTEGER PRIMARY KEY ,
                name VARCHAR (55)NOT NULL ,
                adres VARCHAR(150)NOT NULL ,
                mail VARCHAR(70)NOT NULL ,
                biriktir int REFERENCES course(id)

);
        INSERT INTO college(id, name, adres, mail, biriktir)
        VALUES (1,'Berin College','Berlin Germany','shmit@gmail.com',1),
                (2,'Parise College','Paris France','maya@gmail.com',2),
        (3,'London College','London England','jon@gmail.com',3);

        CREATE TABLE course(
                id INTEGER PRIMARY KEY ,
                courseName VARCHAR (55)NOT NULL ,
                lessonName VARCHAR (55),
                adres VARCHAR(150)NOT NULL,
                biriktir INTEGER REFERENCES teachers(id)

        );
        INSERT INTO course(id, courseName, lessonName,adres,biriktir)
        VALUES (1,'Peacksoft','JAVA','Berlin Germany',1),
                (2,'Penthuse','JAVASCRİPT','Paris France',2),
        (3,'SoftAcademy','C#','London England',3);

        CREATE TABLE teachers(
                id INTEGER PRIMARY KEY ,
                name VARCHAR (55)NOT NULL ,
                adres VARCHAR(150)NOT NULL ,
                mail VARCHAR(70)NOT NULL ,
                number VARCHAR(15)

        );
        INSERT INTO teachers(id, name, adres, mail, number)
        VALUES (1,'Borise','Amsterdam Holland','borise@gmail.com','+4393743735'),
                (2,'Zoya','Kiev Ukraine','zoya@gmail.com','+4987399576276'),
        (3,'Kerry ','Qubek Canada','kerry@gmail.com','+438463594735');

        CREATE TABLE school(
                id INTEGER PRIMARY KEY ,
                name VARCHAR (55)NOT NULL ,
                adres VARCHAR(150)NOT NULL ,
                mail VARCHAR(70)NOT NULL ,
                biriktir int REFERENCES course(id)

);
        INSERT INTO school(id, name, adres, mail, biriktir)
        VALUES (1,'Berlin School','Berlin Germany','shmit@gmail.com',1),
                (2,'Parise School','Paris France','maya@gmail.com',2),
        (3,'London School ','London England','jon@gmail.com',3);

        CREATE TABLE course(
                id INTEGER PRIMARY KEY ,
                courseName VARCHAR (55)NOT NULL ,
                lessonName VARCHAR (55),
                adres VARCHAR(150)NOT NULL,
                biriktir INTEGER REFERENCES teachers(id)

        );
        INSERT INTO course(id, courseName, lessonName,adres,biriktir)
        VALUES (1,'Peacksoft','JAVA','Berlin Germany',1),
                (2,'Penthuse','JAVASCRİPT','Paris France',2),
        (3,'SoftAcademy','C#','London England',3);

        CREATE TABLE teachers(
                id INTEGER PRIMARY KEY ,
                name VARCHAR (55)NOT NULL ,
                adres VARCHAR(150)NOT NULL ,
                mail VARCHAR(70)NOT NULL ,
                number VARCHAR(15)

        );
        INSERT INTO teachers(id, name, adres, mail, number)
        VALUES (1,'Borise','Amsterdam Holland','borise@gmail.com','+4393743735'),
                (2,'Zoya','Kiev Ukraine','zoya@gmail.com','+4987399576276'),
        (3,'Kerry ','Qubek Canada','kerry@gmail.com','+438463594735');

        CREATE TABLE ausbildung(
                id INTEGER PRIMARY KEY ,
                name VARCHAR (55)NOT NULL ,
                adres VARCHAR(150)NOT NULL ,
                mail VARCHAR(70)NOT NULL ,
                biriktir int REFERENCES course(id)

);
        INSERT INTO ausbildung(id, name, adres, mail, biriktir)
        VALUES (1,'Berlin Ausbildung','Berlin Germany','shmit@gmail.com',1),
                (2,'Paris Ausbildung','Paris France','maya@gmail.com',2),
        (3,'London Ausbildung ','London England','jon@gmail.com',3);

        CREATE TABLE course(
                id INTEGER PRIMARY KEY ,
                courseName VARCHAR (55)NOT NULL ,
                lessonName VARCHAR (55),
                adres VARCHAR(150)NOT NULL,
                biriktir INTEGER REFERENCES teachers(id)

        );
        INSERT INTO course(id, courseName, lessonName,adres,biriktir)
        VALUES (1,'Peacksoft','JAVA','Berlin Germany',1),
                (2,'Penthuse','JAVASCRİPT','Paris France',2),
        (3,'SoftAcademy','C#','London England',3);

        CREATE TABLE teachers(
                id INTEGER PRIMARY KEY ,
                name VARCHAR (55)NOT NULL ,
                adres VARCHAR(150)NOT NULL ,
                mail VARCHAR(70)NOT NULL ,
                number VARCHAR(15)

        );
        INSERT INTO teachers(id, name, adres, mail, number)
        VALUES (1,'Borise','Amsterdam Holland','borise@gmail.com','+4393743735'),
                (2,'Zoya','Kiev Ukraine','zoya@gmail.com','+4987399576276'),
        (3,'Kerry ','Qubek Canada','kerry@gmail.com','+438463594735');

        CREATE TABLE internat(
                id INTEGER PRIMARY KEY ,
                name VARCHAR (55)NOT NULL ,
                adres VARCHAR(150)NOT NULL ,
                mail VARCHAR(70)NOT NULL ,
                biriktir int REFERENCES course(id)

);
        INSERT INTO internat(id, name, adres, mail, biriktir)
        VALUES (1,'Berlin Internat','Berlin Germany','shmit@gmail.com',1),
                (2,'Paris Internat','Paris France','maya@gmail.com',2),
        (3,'London Internat ','London England','jon@gmail.com',3);

        CREATE TABLE course(
                id INTEGER PRIMARY KEY ,
                courseName VARCHAR (55)NOT NULL ,
                lessonName VARCHAR (55),
                adres VARCHAR(150)NOT NULL,
                biriktir INTEGER REFERENCES teachers(id)

        );
        INSERT INTO course(id, courseName, lessonName,adres,biriktir)
        VALUES (1,'Peacksoft','JAVA','Berlin Germany',1),
                (2,'Penthuse','JAVASCRİPT','Paris France',2),
        (3,'SoftAcademy','C#','London England',3);

        CREATE TABLE teachers(
                id INTEGER PRIMARY KEY ,
                name VARCHAR (55)NOT NULL ,
                adres VARCHAR(150)NOT NULL ,
                mail VARCHAR(70)NOT NULL ,
                number VARCHAR(15)

        );
        INSERT INTO teachers(id, name, adres, mail, number)
        VALUES (1,'Borise','Amsterdam Holland','borise@gmail.com','+4393743735'),
                (2,'Zoya','Kiev Ukraine','zoya@gmail.com','+4987399576276'),
        (3,'Kerry ','Qubek Canada','kerry@gmail.com','+438463594735');

        CREATE TABLE danceculb(
                id INTEGER PRIMARY KEY ,
                name VARCHAR (55)NOT NULL ,
                adres VARCHAR(150)NOT NULL ,
                mail VARCHAR(70)NOT NULL ,
                biriktir int REFERENCES course(id)

);
        INSERT INTO danceculb(id, name, adres, mail, biriktir)
        VALUES (1,'Berlin Dance Club','Berlin Germany','shmit@gmail.com',1),
                (2,'Paris Dance Club','Paris France','maya@gmail.com',2),
        (3,'London Dance Club ','London England','jon@gmail.com',3);

        CREATE TABLE course(
                id INTEGER PRIMARY KEY ,
                courseName VARCHAR (55)NOT NULL ,
                lessonName VARCHAR (55),
                adres VARCHAR(150)NOT NULL,
                biriktir INTEGER REFERENCES teachers(id)

        );
        INSERT INTO course(id, courseName, lessonName,adres,biriktir)
        VALUES (1,'Peacksoft','JAVA','Berlin Germany',1),
                (2,'Penthuse','JAVASCRİPT','Paris France',2),
        (3,'SoftAcademy','C#','London England',3);

        CREATE TABLE teachers(
                id INTEGER PRIMARY KEY ,
                name VARCHAR (55)NOT NULL ,
                adres VARCHAR(150)NOT NULL ,
                mail VARCHAR(70)NOT NULL ,
                number VARCHAR(15)

        );
        INSERT INTO teachers(id, name, adres, mail, number)
        VALUES (1,'Borise','Amsterdam Holland','borise@gmail.com','+4393743735'),
                (2,'Zoya','Kiev Ukraine','zoya@gmail.com','+4987399576276'),
        (3,'Kerry ','Qubek Canada','kerry@gmail.com','+438463594735');


*/
    }
}
