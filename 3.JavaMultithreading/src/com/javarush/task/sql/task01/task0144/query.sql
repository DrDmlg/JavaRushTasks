-- Write your code here:
SELECT description FROM parts
ORDER BY required, identifier, description DESC
LIMIT 5
OFFSET 23;