-- Write your code here:
SELECT name, COUNT(*) AS year
FROM cars
WHERE prod_year = 2021
GROUP BY name;