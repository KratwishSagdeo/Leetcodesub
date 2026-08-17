// Problem: Project Employees I
// Link: https://leetcode.com/problems/project-employees-i/?envType=study-plan-v2&envId=top-sql-50

# Write your MySQL query statement below
Select p.project_id,
round(sum(e.experience_years)/count(e.employee_id),2) as Average_years
from project p
left join Employee e
on p.employee_id = e.employee_id
group by p.project_id;