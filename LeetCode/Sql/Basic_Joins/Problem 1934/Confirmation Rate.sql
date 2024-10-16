select
a.user_id, round(isnull(cast(b.total_actions as float)/cast(nullif(a.total_actions, 0) as float),0.00),2)  as confirmation_rate
-- *
from
(select 
Signups.user_id,count(action) as total_actions
from Signups
left join Confirmations
on Signups.user_id = Confirmations.user_id
-- where action <> 'timeout' or action is null 
group by Signups.user_id
-- having count(action) >= 0 
) a
left join (
select 
Signups.user_id,count(action) as total_actions
from Signups
left join Confirmations
on Signups.user_id = Confirmations.user_id
where action <> 'timeout' or action is null 
group by Signups.user_id
having count(action) >= 0 ) b
on a.user_id = b.user_id


----Optimal solution
select
s.user_id, round(avg(case when action = 'confirmed' then 1.00 else 0.00 end),2) as confirmation_rate
from Signups s
left join Confirmations c
on s.user_id = c.user_id
group by s.user_id
