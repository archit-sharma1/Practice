-- Method 1
select w1id as id
from (
    select
    distinct w1.id as w1id ,w1.recordDate as w1recdate,w1.temperature as w1temp,w2.id,w2.recordDate as w2recdate,w2.    temperature as w2temp, w1.temperature - w2.temperature as tempdiff
    from Weather w1
    left join weather w2
    on DATEDIFF(day, w2.recordDate, w1.recordDate) =1
) t
where tempdiff > 0

--More efficient
-- Method 2
SELECT currentday.id
FROM Weather as currentday
join Weather as prevousday
on currentday.recordDate = DATEADD(DAY, 1, prevousday.recordDate)
WHERE currentday.temperature > prevousday.temperature 
