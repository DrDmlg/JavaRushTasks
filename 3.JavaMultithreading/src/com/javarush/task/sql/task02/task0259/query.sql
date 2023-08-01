-- Write your code here:
SELECT GROUP_CONCAT(position, name)
FROM employee
GROUP BY position
HAVING position = 'developer';