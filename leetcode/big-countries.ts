// Problem: Big Countries
// Link: https://leetcode.com/problems/big-countries/?envType=study-plan-v2&envId=top-sql-50

# Write your MySQL query statement below
Select name,population,area from World
where (area >= 3000000 OR population>=25000000);