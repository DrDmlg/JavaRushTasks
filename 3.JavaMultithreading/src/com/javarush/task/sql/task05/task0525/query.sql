-- Write your code here:
SELECT author.full_name, COUNT(book.id) AS books FROM author
JOIN book
ON author.id = book.author_id
GROUP BY full_name
HAVING books > 1;
