-- Write your code here:
SELECT name, COUNT(*)
FROM cars
GROUP BY name
HAVING COUNT(*) > 1;