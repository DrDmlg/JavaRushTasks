-- Write your code here:
SELECT title FROM films
LEFT JOIN (SELECT last_name FROM film_directors
                            WHERE film_derectors.last_name = 'Spielberg') AS director
ON director.id = films.director_id;