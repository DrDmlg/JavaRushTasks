-- Write your code here:
SELECT name, SUM(price), AVG(price)
FROM cars
GROUP BY name
HAVING AVG(price) > 100000;