-- Write your code here:
SELECT * FROM car
WHERE model NOT LIKE '%a%'
AND quantity-car.booked_quantity BETWEEN 5 AND 500;