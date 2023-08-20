-- Write your code here:
ALTER TABLE employee
ADD INDEX position_index (position, salary_index);