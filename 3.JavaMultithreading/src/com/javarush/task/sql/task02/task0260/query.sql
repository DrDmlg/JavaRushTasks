-- Write your code here:
SELECT rating, name
FROM employee
GROUP BY rating, name
HAVING rating > 2
ORDER BY rating ASC;