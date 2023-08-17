-- Write your code here:
SELECT DISTINCT author.full_name, COUNT(DISTINCT publisher.name) AS publishers
FROM author
LEFT JOIN book ON author.id = book.author_id
LEFT JOIN publisher ON book.publisher_id = publisher.id
GROUP BY author.id;

