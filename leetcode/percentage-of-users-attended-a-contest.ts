// Problem: Percentage of Users Attended a Contest
// Link: https://leetcode.com/problems/percentage-of-users-attended-a-contest/?envType=study-plan-v2&envId=top-sql-50

# Write your MySQL query statement below
Select contest_id, as percentage from Users u
left join Register r on
u.user_id = r.user_id
group by r.contest_id;