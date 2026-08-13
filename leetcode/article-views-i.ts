// Problem: Article Views I
// Link: https://leetcode.com/problems/article-views-i/?envType=study-plan-v2&envId=top-sql-50

Select distinct author_id as id
from Views
where author_id = viewer_id
order by id asc;