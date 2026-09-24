// Problem: The Blunder
// Link: https://www.hackerrank.com/challenges/the-blunder/problem?isFullScreen=true

select CEIL(Avg(salary)-avg(replace(salary,'0','')))
from employees;