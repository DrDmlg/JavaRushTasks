-- Write your code here:
SELECT * FROM event
WHERE year(date_time) = YEAR(curdate())
AND month(date_time) = MONTH(curdate());