-- Write your code here:
SELECT *,
       CASE
           WHEN position IN ('backend developer') THEN 'yes'
           WHEN position IN ('frontend developer') THEN 'yes'
           ELSE 'no'
           END
FROM employee
WHERE depatrment = 'cool devs';
