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
