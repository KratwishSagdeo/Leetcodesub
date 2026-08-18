// Problem: Queries Quality and Percentage
// Link: https://leetcode.com/problems/queries-quality-and-percentage/?envType=study-plan-v2&envId=top-sql-50

Select query_name,
Round(AVG(rating/position),2) as quality,
round(sum(rating<3)*100/count(*),2) as poor_query_percentage
from queries
where query_name is Not Null
group by query_name;