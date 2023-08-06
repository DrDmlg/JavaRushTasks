-- Write your code here:
SELECT full_name FROM film_directors
LEFT JOIN (SELECT title FROM films
                        WHERE films.ganre = 'comedy') AS f
ON film_directors.id = f.director_id;