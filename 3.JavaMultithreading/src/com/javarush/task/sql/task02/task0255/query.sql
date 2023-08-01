-- Write your code here:
SELECT name, MAX(price), MIN(price)
FROM cars
GROUP BY name
HAVING MAX(price) < 200000;