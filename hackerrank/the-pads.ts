// Problem: The PADS
// Link: https://www.hackerrank.com/challenges/the-pads/problem?isFullScreen=true

SELECT CONCAT(Name, '(', SUBSTR(Occupation, 1, 1), ')')
FROM OCCUPATIONS
ORDER BY Name;

SELECT CONCAT('There are a total of ', COUNT(Occupation), ' ', LOWER(Occupation), 's.')
FROM OCCUPATIONS
GROUP BY Occupation
ORDER BY COUNT(Occupation) ASC, Occupation ASC;