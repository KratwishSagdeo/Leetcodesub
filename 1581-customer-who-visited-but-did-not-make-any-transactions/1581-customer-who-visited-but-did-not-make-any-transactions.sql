# Write your MySQL query statement below
SELECT customer_id, COUNT(visit_id) as count_no_trans
from visits
where visit_id NOT IN (
    Select visit_id
    FROM Transactions
)
group by customer_id;