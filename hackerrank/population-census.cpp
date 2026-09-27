// Problem: Population Census
// Link: https://www.hackerrank.com/challenges/asian-population/problem?isFullScreen=true

Select sum(city.population) from city Join Country on CITY.CountryCode = Country.Code
where country.continent = 'Asia';