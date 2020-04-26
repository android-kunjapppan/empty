declare @salary int;
set @salary=12000;
select lastname,salary from employee where salary >@salary;