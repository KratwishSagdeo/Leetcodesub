// Problem: Replace Employee ID With The Unique Identifier
// Link: https://leetcode.com/problems/replace-employee-id-with-the-unique-identifier/?envType=study-plan-v2&envId=top-sql-50

# Write your MySQL query statement below
Select EmployeeUNI.unique_id,Employees.name From Employees
left join EmployeeUNI on Employees.id = EmployeeUNI.id;