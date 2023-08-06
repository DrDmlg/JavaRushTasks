-- Write your code here:
SELECT * FROM authors
WHERE full_name NOT LIKE (SELECT  concat(first_name, ' ', last_name) FROM authors
                                                             WHERE last_name = 'Shakespeare');