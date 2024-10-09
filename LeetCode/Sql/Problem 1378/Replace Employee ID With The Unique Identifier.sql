SELECT
unique_id, name
from employees
Left join employeeUNI
on employees.id = employeeUNI.id
