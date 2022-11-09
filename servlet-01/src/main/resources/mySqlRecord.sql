-- drop database if exists school;
CREATE DATABASE   
IF
	NOT EXISTS school CHARACTER set utf8 COLLATE utf8_general_ci;
SHOW DATABASES;
USE school;
CREATE TABLE
IF
	NOT EXISTS student (
	`id` INT ( 4 ) NOT NULL COMMENT '学号' auto_increment,
	`name` VARCHAR ( 64 ) NOT NULL DEFAULT '匿名' COMMENT '姓名',
	`pwd` VARCHAR ( 64 ) NOT NULL DEFAULT '123456' COMMENT '密码',
	`sex` VARCHAR ( 64 ) NOT NULL DEFAULT '女' COMMENT '性别',
	`birthday` VARCHAR ( 64 ) DEFAULT NULL COMMENT '出生日期',
	`address` VARCHAR ( 64 ) DEFAULT NULL COMMENT '家庭住址',
	`email` VARCHAR ( 64 ) DEFAULT NULL COMMENT '邮箱',
	PRIMARY KEY ( id ) 
	) ENGINE = INNODB  ;
DESC student;
ALTER TABLE student RENAME AS student1;
ALTER TABLE student ADD age INT ( 4 );
--修改约束 ALTER TABLE student MODIFY age VARCHAR ( 64 );
--字段重命名 ALTER TABLE student CHANGE age age1 VARCHAR ( 64 );
ALTER TABLE student DROP age1;
INSERT INTO student ( ) -- insert
INSERT INTO `school`.`student` ( `id`, `name`, `pwd`, `sex`, `birthday`, `address`, `email` )
VALUES
	( 1, '匿名', '123456', '女', NULL, NULL, NULL );-- update
UPDATE student SET address = 'london' WHERE	id = 1;-- delete
DELETE FROM	student WHERE	id = 2;
TRUNCATE student1;
















