-- Write your code here:
SELECT department, salary, name FROM employee
WHERE salary > 200 AND department != 'qa';