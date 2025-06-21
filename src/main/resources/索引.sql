SHOW INDEX FROM	student;-- 列出索引
ALTER TABLE student ADD UNIQUE INDEX uniquename ( NAME );-- 加索引
CREATE unique_name ON student ( NAME ); --  默认UNIQUE
EXPLAIN SELECT	* FROM	student WHERE	id = 1 	AND NAME = 'A';-- 索引使用情况

EXPLAIN select * from student where sex ='女999999';
EXPLAIN select * from student where name ='MOCK_999999';
EXPLAIN select * from student where id ='999999';


