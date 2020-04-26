declare @manager_id int;
set @manager_id=103;
declare @sorted_by varchar;
set @sorted_by = last_name;
select employee_id, lastname, salary, department from employee where manager_id=@manager_id order by @sorted_by desc;