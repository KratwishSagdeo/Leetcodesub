// Problem: Weather Observation Station 16
// Link: https://www.hackerrank.com/challenges/weather-observation-station-16/problem?isFullScreen=true

SELECT ROUND(LAT_N, 4) 
FROM STATION 
WHERE LAT_N > 38.7780
ORDER BY LAT_N asc 
LIMIT 1;