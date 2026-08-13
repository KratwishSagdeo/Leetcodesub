# Write your MySQL query statement below
Select w1.id From Weather w1
join Weather w2
on DateDiff(w1.recordDate,w2.recordDate) = 1
where w1.temperature > w2.temperature;