-- Write your code here:
SELECT * FROM authors
WHERE id IN (SELECT authors FROM books
                            WHERE genre = 'fantasy');