create table MY_EMPLOYEE(  
  EMPLOYEE_ID    number(4,0),  
  FIRST_NAME     varchar2(20),
  LAST_NAME     varchar2(20),  
  DEPARTMENT_ID     varchar2(9),     
  SALARY      number(7,2),  
  constraint pk_MY_EMPLOYEE primary key (LAST_NAME)); 
desc MY_EMPLOYEE;