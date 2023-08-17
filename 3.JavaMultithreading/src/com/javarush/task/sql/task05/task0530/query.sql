-- Write your code here:
SELECT name, YEAR(discovery_date) AS d_year,
       MONTH(discovery_date) AS d_month,
       DAY(discovery_date) AS d_day
FROM object