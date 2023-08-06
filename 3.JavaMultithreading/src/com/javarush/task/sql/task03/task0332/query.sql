-- Write your code here:
SELECT
    auth.last_name AS author,
    book.genre AS  book_genre,
    book.date_released
FROM author AS auth
RIGHT JOIN books AS book
ON auth.author_id = book.author_id
WHERE book.date_released < 1900
GROUP BY book.genre, book.date_released;