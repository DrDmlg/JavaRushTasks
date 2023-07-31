-- Write your code here:
SELECT department, COUNT(*) AS number_of_employee
FROM employee
GROUP BY department;