// Problem: Weather Observation Station 9
// Link: https://www.hackerrank.com/challenges/weather-observation-station-9/problem?isFullScreen=true

select distinct city from station
where city not regexp '^[aeiou]';