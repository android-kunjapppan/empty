CREATE TABLE emp
	(id NUMBER(7),
	last_name VARCHAR2(25),
	first_name VARCHAR2(25),
	dept_id NUMBER(7));
desc  emp;
Insert into emp values(101,'Sam','Sundar',10);
Insert into emp values(101,'Ram','Krishna',20);
Insert into emp values(102,'Gopi','null',40);
Insert into emp values(103,'null','ram',20);
select * from emp;
