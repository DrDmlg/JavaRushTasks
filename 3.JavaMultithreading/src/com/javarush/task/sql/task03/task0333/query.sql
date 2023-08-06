-- Write your code here:
SELECT
    a.sex AS author_sex,
    a.country AS author_country,
    b.copies_sold_millions AS books_sold
FROM authors AS a
JOIN books AS b
ON a.author_id = b.author_id
WHERE b.books_sold > 10
GROUP BY a.sex, a.country, b.copies_sold_millions
ORDER BY b.copies_sold_millions DESC;