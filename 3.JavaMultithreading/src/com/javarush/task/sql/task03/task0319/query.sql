-- Write your code here:
SELECT r.ret_name,
       r.ret_location,
       s.sup_name,
       s.sup_country
FROM top_retailers AS r
JOIN suppliers AS s
ON r.ret_location = s.sup_country;