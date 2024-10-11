with a as (SELECT
students.student_id, STUDENT_NAME, 
subjects.subject_name
FROM Students
cross join subjects),

b as (
SELECT
students.student_id, STUDENT_NAME, 
Examinations.subject_name , COUNT(Examinations.subject_name) as attended_exams 
FROM Students
left JOIN Examinations
ON Students.student_id = Examinations.student_id
GROUP BY STUDENT_NAME,Examinations.subject_name,students.student_id
)

select
a.student_id, a.student_name, 
a.subject_name, case when b.attended_exams is null then 0 else b.attended_exams end as attended_exams
from a
left join b
on concat(a.student_id, a.STUDENT_NAME, a.subject_name) = concat(b.student_id, b.STUDENT_NAME, b.subject_name)
order by a.student_id, a.STUDENT_NAME, a.subject_name

----Method 2
select d.student_id,d.student_name,j.subject_name,count(e.subject_name) as attended_exams
from Students d
cross join Subjects j
left join Examinations e
on e.subject_name=j.subject_name and d.student_id=e.student_id

group by d.student_id,d.student_name,j.subject_name;
