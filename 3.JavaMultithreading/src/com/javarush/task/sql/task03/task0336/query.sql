-- Write your code here:
SELECT year_born FROM authors
WHERE year_born <= (SELECT MAX(date_released) FROM books);