-- Write your code here:
SELECT
       IF(YEAR(date_of_birth) < 2000, 'yes', 'no') AS exp,
       MONTH(date_of_birth) AS month

FROM employee
