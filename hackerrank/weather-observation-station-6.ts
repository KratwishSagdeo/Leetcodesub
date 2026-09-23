// Problem: Weather Observation Station 6
// Link: https://www.hackerrank.com/challenges/weather-observation-station-6/problem?isFullScreen=true

SELECT DISTINCT CITY FROM STATION
WHERE CITY LIKE 'a%' or city like 'e%' or city like 'i%' or city like 'o%' or city like 'u%';