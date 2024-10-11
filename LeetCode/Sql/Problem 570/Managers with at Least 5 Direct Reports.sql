select
name
from employee
join(
select count(id) as count, managerID
from employee
group by managerID) t
on employee.id = t.managerId
where t.count >= 5
