-- Write your code here:
SELECT
    author.last_name AS author,
    author.country AS author_country,
    book.genre AS book_genre
FROM authors AS author
LEFT JOIN books AS book
ON author.id = book.author_id
WHERE book_genre  = 'fantasy'
GROUP BY author, author_country, book_genre
ORDER BY author_country ASC
LIMIT 5;