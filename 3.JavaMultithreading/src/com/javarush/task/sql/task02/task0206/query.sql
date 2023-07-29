-- Write your code here:
SELECT *, IF(salary <= 500, 1000, 0)
FROM employee
WHERE id > 5
LIMIT 10;