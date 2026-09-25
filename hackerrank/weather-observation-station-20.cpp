// Problem: Weather Observation Station 20
// Link: https://www.hackerrank.com/challenges/weather-observation-station-20/problem?isFullScreen=true

SELECT ROUND(LAT_N, 4) 
FROM (
    SELECT LAT_N 
    FROM STATION 
    ORDER BY LAT_N
) AS a
WHERE (SELECT COUNT(LAT_N) FROM STATION WHERE LAT_N < a.LAT_N) 
    = (SELECT COUNT(LAT_N) FROM STATION WHERE LAT_N > a.LAT_N);