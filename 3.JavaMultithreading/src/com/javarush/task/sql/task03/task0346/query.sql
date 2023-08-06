-- Write your code here:
SELECT * FROM films
JOIN (SELECT year_born FROM film_directors
                       WHERE film.directors.year_born < 1940) AS director
ON director.id = films.director_id
WHERE films.genre = 'sci-fi';