# Write your MySQL query statement below
Select Employee.name, Bonus.bonus from Employee
left join Bonus on Employee.empId = Bonus.empId
Where Bonus.bonus < 1000 OR Bonus.bonus is NULL;