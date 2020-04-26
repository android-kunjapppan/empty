create table DEPARTMENTS(  
  DEPTNO     number(2,0),  
  DNAME      varchar2(14),  
  LOC       varchar2(13),  
  constraint pk_DEPARTMENTS primary key (DEPTNO)  
)
desc DEPARTMENTS;