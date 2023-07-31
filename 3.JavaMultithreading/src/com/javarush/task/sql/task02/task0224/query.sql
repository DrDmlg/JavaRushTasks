-- Write your code here:
SELECT department, COUNT(*)
FROM employee
WHERE position = 'backend developers'
GROUP BY department;