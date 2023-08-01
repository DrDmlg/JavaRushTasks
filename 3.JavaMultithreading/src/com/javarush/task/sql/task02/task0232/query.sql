-- Write your code here:
SELECT is_full_time, COUNT(*)
FROM students
-- WHERE is_full_time IN ('no', 'yes')
GROUP BY is_full_time;
-- не понял какие значения должны быть в табл.
