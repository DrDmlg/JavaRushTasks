-- Write your code here:
SELECT YEAR(date), MONTH(date), DAY(date), SUM(total) FROM data
GROUP BY  YEAR(date), MONTH(date), day(date)