// Problem: Invalid Tweets
// Link: https://leetcode.com/problems/invalid-tweets/?envType=study-plan-v2&envId=top-sql-50

# Write your MySQL query statement below
Select tweet_id from Tweets
where Length(content)>15;