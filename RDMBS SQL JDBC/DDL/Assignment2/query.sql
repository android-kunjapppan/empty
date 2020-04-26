CREATE TABLE DEPTS
	(Dept_ID NUMBER(7),
	Dept_Name VARCHAR2(25),
constraint pk_DEPTS primary key (Dept_ID));
	select * from depts;
	DESCRIBE depts;
INSERT INTO depts values(10 ,' Accounts');
INSERT INTO depts values( null ,' TT');
UPDATE depts SET Dept_ID = 20 WHERE Dept_Name = 'TT';
Insert into depts values(A1 ,' Accounts');
Insert into depts values(30 ,' Accounts');
SELECT department_id, department_name
	FROM departments;