-- Write your code her
SELECT YEAR(date_of_birth), COUNT(*) AS count
FROM employee
GROUP BY YEAR(date_of_birth);
