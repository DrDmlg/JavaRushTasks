-- Write your code here:
SELECT
       CASE
           WHEN IFNULL(euro, 6) > 5 THEN 'best'
           WHEN euro = 5 THEN 'good'
           ELSE 'bad'
           END
FROM cars;


-- хз что от меня хотят в последнем условии