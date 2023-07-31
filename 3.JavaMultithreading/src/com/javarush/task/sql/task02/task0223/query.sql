-- Write your code here:
SELECT department, COUNT(*) AS count
FROM employee
GROUP BY department