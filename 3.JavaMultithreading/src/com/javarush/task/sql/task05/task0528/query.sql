-- Write your code here:
SELECT  DISTINCT publisher.name
FROM book
JOIN author ON book.author_id = author.id
JOIN publisher ON book.publisher_id = publisher.id
WHERE author.full_name = 'Mark Twain';
