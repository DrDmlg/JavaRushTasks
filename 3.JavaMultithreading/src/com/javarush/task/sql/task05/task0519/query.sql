-- Write your code here:
SELECT COUNT(*) AS total
FROM lego_set
WHERE number < 10000
GROUP BY released
ORDER BY total DESC;