create table MY_EMPLOYEE(  
  EMPLOYEE_ID    number(4,0),  
  FIRST_NAME     varchar2(20),
  LAST_NAME     varchar2(20),  
  DEPARTMENT_ID     varchar2(9),     
  SALARY      number(7,2),  
  constraint pk_MY_EMPLOYEE primary key (LAST_NAME)); 
desc MY_EMPLOYEE;
insert into MY_EMPLOYEE values(205,'Shelley', 'Higgins', 110 , 12000);
insert into MY_EMPLOYEE values(100,'Steven' , 'King'   ,  90 , 24000);
insert into MY_EMPLOYEE values(101,'Neena'  , 'Kochhar'  , 90 , 17000);
insert into MY_EMPLOYEE values(102,'Lex De' , 'Haan'  ,   90,  17000);
insert into MY_EMPLOYEE values(111,'Ismael'  , 'Sciarra' , 100 , 7700);
insert into MY_EMPLOYEE values(112,'Jose Manuel','Urman' ,  100 , 7800);
insert into MY_EMPLOYEE values(204,'Hermann' ,  'Baer'  ,   70 ,  10000);
select * from MY_EMPLOYEE;
