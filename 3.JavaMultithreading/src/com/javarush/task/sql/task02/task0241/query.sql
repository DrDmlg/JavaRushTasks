-- Write your code here:
SELECT  YEAR(date_of_birth) AS year,  MONTH(date_of_birth) AS month
FROM employee
GROUP BY year, month;