alter table student add money int(4) ;

TRUNCATE student;
INSERT INTO student(name,money)
VALUES('A',2000),('B',10000);

set autocommit = 0;-- 关闭自动提交
start TRANSACTION;-- 开启事务
UPDATE student set money = money -500 where name ='A';
UPDATE student set money = money +500 where name ='B';
COMMIT;-- 提交
ROLLBACK;-- 回滚
set commit =1 ;-- 开启自动提交

select name,money from student