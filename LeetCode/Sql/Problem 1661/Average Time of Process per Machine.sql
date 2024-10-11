select
machine_id, round(avg(avgTime),3) as processing_time 
from 
(select 
astart.machine_id,astart.process_id, (aend.timestamp - astart.timestamp) as avgTime 
from Activity astart 
join Activity aend 
on concat(astart.machine_id,astart.process_id) = concat(aend.machine_id,aend.process_id)
where astart.activity_type = 'start' and aend.activity_type = 'end'
) Activity
group by machine_id

---Method 2
---More efficient
SELECT
machine_id,
ROUND(
AVG(CASE WHEN activity_type = 'end' THEN timestamp END) -
AVG(CASE WHEN activity_type = 'start' THEN timestamp END), 3
) AS processing_time
FROM
activity 
group by machine_id
