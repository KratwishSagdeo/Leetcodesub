// Problem: Average Population of Each Continent
// Link: https://www.hackerrank.com/challenges/average-population-of-each-continent/problem?isFullScreen=true

select country.continent, floor(avg(city.population)) from city JOIN
country on City.countrycode = country.code
group by country.continent;