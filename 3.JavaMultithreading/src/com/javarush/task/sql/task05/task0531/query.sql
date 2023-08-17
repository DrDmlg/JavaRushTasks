-- Write your code here:
SELECT * FROM object
WHERE discovery_date BETWEEN 2010-01-01 AND 2020-12-31;

/*select *
from object
where year(discovery_date) >= 2010
  and month(discovery_date) >= 1
  and year(discovery_date) <= 2020
  and month(discovery_date) <= 12

 */