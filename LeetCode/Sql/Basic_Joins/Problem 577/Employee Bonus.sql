Select name, bonus
from (select
name, bonus
from Employee
left join bonus
on Employee.empId = bonus.empId) a
where bonus < 1000  or bonus is null
