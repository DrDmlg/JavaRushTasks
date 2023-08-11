-- Write your code here:
SELECT name, position FROM employee
WHERE DAYNAME(date_of_birth) = 'Monday';