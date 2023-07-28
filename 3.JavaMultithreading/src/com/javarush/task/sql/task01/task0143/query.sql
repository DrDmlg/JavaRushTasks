-- Write your code here:
SELECT id, identifier, description FROM parts
ORDER BY identifier ASC, required, description DESC
LIMIT 7;