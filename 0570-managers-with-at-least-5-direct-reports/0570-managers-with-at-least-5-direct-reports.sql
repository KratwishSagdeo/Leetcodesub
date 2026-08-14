# Write your MySQL query statement below
select a.name as name from employee as a
join employee as b
on a.id=b.managerid
group by a.name,a.id
having count(b.managerid)>=5;