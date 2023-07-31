-- Write your code here:
SELECT prod_year, COUNT(*) AS count_in_year
FROM cars
WHERE name = 'kia'
GROUP BY prod_year
