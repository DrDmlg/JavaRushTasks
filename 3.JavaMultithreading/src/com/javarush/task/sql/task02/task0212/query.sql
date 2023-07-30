-- Write your code here:
SELECT IF(position = 'manager', IF(salary > 10000, 'good', 'bad'), IF(salary > 5000, 'good', 'bad'))
FROM employee
WHERE city = 'London';


-- Не совсем понял что какие колонки нужно вывести, поэтому вывел все.
-- Добавил алиас AS result