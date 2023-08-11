-- Write your code here:
SELECT * FROM event
WHERE DATEDIFF(date_time, CURDATE()) < 20;