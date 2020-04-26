create table EMPLOYEES(  
  employee_id    number(4,0),  
  first_name    varchar2(20),
  last_name    varchar2(20),  
  job_id      varchar2(9),   
  hire_date date,  
  salary      number(7,2),  
  constraint pk_EMPLOYEES primary key (employee_id)); 
desc EMPLOYEES;
insert into EMPLOYEES values(7698, 'SOURAV', 'NANDY', 7839, to_date('1-5-1981','dd-mm-yyyy'),  2850 );
insert into EMPLOYEES values(7566, 'SOUVIK', 'BOSE', 7851,  to_date('2-4-1981','dd-mm-yyyy'), 2975 );
insert into EMPLOYEES values(7788, 'SCOTT', 'STYRIS', 7566, to_date('13-JUL-87','dd-mm-rr') - 85, 3000);
select last_name||', '||job_id "Employee and Title" from EMPLOYEES;