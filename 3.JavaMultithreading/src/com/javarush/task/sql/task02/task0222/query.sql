-- Write your code here:
SELECT name AS  count,  COUNT(*)
FROM cars
GROUP BY name;
