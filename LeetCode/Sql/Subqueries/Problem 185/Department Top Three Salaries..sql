select department,employee,salary
from 
(
SELECT 
d.name AS department,
e.name AS employee,
salary,
dense_rank() over (partition by d.name order by salary desc) as rownum1
-- row_number() over (partition by salary order by salary desc) as rownum2
FROM employee e
LEFT JOIN department d
ON  d.id = e.departmentId
-- order by department,salary desc
) a
where a.rownum1 < 4
