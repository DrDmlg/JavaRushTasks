-- Write your code here:
SELECT * FROM authors
WHERE id NOT IN (SELECT author_id FROM books
                                  WHERE author_id  IS NOT NULL
                                  AND genre = 'novel')