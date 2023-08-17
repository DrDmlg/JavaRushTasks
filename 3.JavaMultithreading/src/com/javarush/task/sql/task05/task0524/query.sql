-- Write your code here:
SELECT book.isbn, book.title, author.last_name FROM book
JOIN author
ON book.author_id = author.id
WHERE author.last_name LIKE 'S%';

