// Problem: Top Earners
// Link: https://www.hackerrank.com/challenges/earnings-of-employees/problem?isFullScreen=true

Select (salary*months) as earnings,count(*)
from employee
group by earnings
order by earnings desc
limit 1;