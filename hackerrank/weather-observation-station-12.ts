// Problem: Weather Observation Station 12
// Link: https://www.hackerrank.com/challenges/weather-observation-station-12/problem?isFullScreen=true

select distinct city from station
where city not regexp '^[aeiou]'
and city not regexp '[aeiou]$';