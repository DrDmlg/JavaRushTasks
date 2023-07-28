-- Write your code here:
SELECT id, identifier, description FROM parts
ORDER BY identifier, required DESC, description ASC;