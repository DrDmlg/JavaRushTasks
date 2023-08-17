-- Write your code here:
SELECT number, ROUND(inventory + inventory * 1/100) AS with_spare_parts FROM lego_set
