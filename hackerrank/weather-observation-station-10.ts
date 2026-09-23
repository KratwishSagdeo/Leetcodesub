// Problem: Weather Observation Station 10
// Link: https://www.hackerrank.com/challenges/weather-observation-station-10/problem?isFullScreen=true

select distinct city from station
where city not regexp '[aeiou]$';