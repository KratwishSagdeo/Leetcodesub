// Problem: Find Customer Referee
// Link: https://leetcode.com/problems/find-customer-referee/submissions/2101298518/

SELECT name 
FROM Customer 
WHERE referee_id != 2 OR referee_id IS NULL;