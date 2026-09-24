// Problem: Occupations
// Link: https://www.hackerrank.com/challenges/occupations/problem?isFullScreen=true

SELECT 
    MIN(CASE WHEN Occupation = 'Doctor' THEN Name END) AS Doctor,
    MIN(CASE WHEN Occupation = 'Professor' THEN Name END) AS Professor,
    MIN(CASE WHEN Occupation = 'Singer' THEN Name END) AS Singer,
    MIN(CASE WHEN Occupation = 'Actor' THEN Name END) AS Actor
FROM (
    SELECT Name, Occupation,
           ROW_NUMBER() OVER (PARTITION BY Occupation ORDER BY Name) as row_num
    FROM OCCUPATIONS
) sub
GROUP BY row_num;