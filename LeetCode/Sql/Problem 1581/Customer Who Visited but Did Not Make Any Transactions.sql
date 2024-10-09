--Method -1
select
customer_id, count(visit_id) as count_no_trans
from visits
where not exists (
    select
    *
    from transactions
    where visits.visit_id = transactions.visit_id
)
group by customer_id

--Method 2

select 
customer_id, count(*) as [count_no_trans]
from Visits
left join Transactions on Visits.visit_id = Transactions.visit_id
WHERE Transactions.visit_id is null
GROUP BY (customer_id);
