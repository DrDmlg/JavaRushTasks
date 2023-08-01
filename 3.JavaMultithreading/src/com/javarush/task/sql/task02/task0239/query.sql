-- Write your code here:
SELECT YEAR(date_of_birth), MONTH(date_of_birth)
FROM employee
WHERE MONTH(date_of_birth) IN (12, 1, 2);

-- "рожденных зимой" - возможно какая то колонка должна быть, возможно через case.. хз