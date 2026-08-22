// Problem: Monthly Transactions I
// Link: https://leetcode.com/problems/monthly-transactions-i/?envType=study-plan-v2&envId=top-sql-50

# Write your MySQL query statement below
Select left(trans_date,7) as month,country,
count(id) as trans_count,
sum(if(state = 'approved',1,0))as approved_count,
sum(amount) as trans_total_amount,
sum(if(state = 'approved',amount,0)) as approved_total_amount

from Transactions
group by month,country;