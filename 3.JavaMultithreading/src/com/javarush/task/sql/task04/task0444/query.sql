-- Write your code here:
SELECT CONCAT(plane, '-', CHAR_LENGTH(plane))
FROM cities
ORDER BY LENGTH(plane) ASC
LIMIT 3;
