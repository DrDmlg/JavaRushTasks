-- Write your code here:
SELECT department AS departmnet_name, COUNT(*) AS count
FROM employee
WHERE position IN ('frontend developer', 'backend developer')
GROUP BY department;