-- Write your code here:
SELECT brand, model, quantity, booked_quantity
FROM car
WHERE model IN ('renault', 'opel',
                'seat', 'skoda')
   OR quantity - car.booked_quantity < 10;