-- Write your code here:
SELECT CASE
           WHEN euro IS NULL THEN 'good'
           ELSE 'bad'
           END
FROM cars;