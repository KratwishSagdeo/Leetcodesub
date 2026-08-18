Select query_name,
Round(AVG(rating/position),2) as quality,
round(sum(rating<3)*100/count(*),2) as poor_query_percentage
from queries
where query_name is Not Null
group by query_name;