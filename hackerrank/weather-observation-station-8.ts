// Problem: Weather Observation Station 8
// Link: https://www.hackerrank.com/challenges/weather-observation-station-8/problem?isFullScreen=true

select distinct city from station
where city regexp '^[aeiou]' and city regexp '[aeiou]$';