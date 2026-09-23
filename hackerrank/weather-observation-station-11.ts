// Problem: Weather Observation Station 11
// Link: https://www.hackerrank.com/challenges/weather-observation-station-11/problem?isFullScreen=true

select distinct city from station
where city not regexp '^[aeiou]'
or city not regexp '[aeiou]$';