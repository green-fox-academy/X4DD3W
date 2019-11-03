-- Solutions: https://gist.github.com/backpackerhh/2487a2c59789ef13099d

-- Q1 Find the titles of all movies directed by Steven Spielberg.
SELECT title FROM Movie
WHERE director = "Steven Spielberg";

-- Q2 Find all years that have a movie that received a rating of 4 or 5,
-- and sort them in increasing order.
SELECT DISTINCT year FROM Movie m
JOIN Rating r ON m.mID = r.mID WHERE r.stars > 3
ORDER BY year ASC;

-- Q3 Find the titles of all movies that have no ratings.
SELECT title FROM Movie
LEFT JOIN Rating ON Movie.mID = Rating.mID WHERE Rating.stars IS NULL;

-- Q4 Find the names of all reviewers who have ratings with a NULL value for the date.
SELECT name FROM Reviewer
JOIN Rating ON Rating.rID = Reviewer.rID WHERE Rating.ratingDate IS NULL;

/*
Q5 Write a query to return the ratings data in a more readable format:
reviewer name, movie title, stars, and ratingDate.
Also, sort the data, first by reviewer name, then by movie title,
and lastly by number of stars. */
SELECT name, title, stars, ratingDate FROM Reviewer, Movie, Rating
WHERE Reviewer.rID = Rating.rID AND Movie.mID = Rating.mID
ORDER BY name, title, stars;

/*
Q6 For all cases where the same reviewer rated the same movie twice
and gave it a higher rating the second time,
return the reviewer's name and the title of the movie. */
-- ON versus USING: https://stackoverflow.com/questions/11366006/mysql-on-vs-using
SELECT DISTINCT name, title FROM Movie
INNER JOIN Rating R1 USING(mID)
INNER JOIN Rating R2 USING(rID)
INNER JOIN Reviewer USING(rID)
WHERE R1.mID = R2.mID
AND R1.ratingDate < R2.ratingDate AND R1.stars < R2.stars;

/*
Q7 For each movie that has at least one rating,
find the highest number of stars that movie received.
Return the movie title and number of stars.
Sort by movie title. */
SELECT title, MAX(stars) FROM Movie
INNER JOIN Rating USING(mID)
GROUP BY mID
ORDER BY title ASC;

-- Extra Q1 Find the names of all reviewers who rated Gone with the Wind.
SELECT DISTINCT name FROM Reviewer, Rating, Movie
WHERE Movie.mID = Rating.mID AND Rating.rID = Reviewer.rID
AND title = "Gone with the Wind";

-- OR:
SELECT DISTINCT name FROM Movie
INNER JOIN Rating USING(mId)
INNER JOIN Reviewer USING(rId)
WHERE title = "Gone with the Wind";

-- Extra Q2 For any rating where the reviewer is the same as the director of the movie,
-- return the reviewer name, movie title, and number of stars.
SELECT name, title, stars FROM reviewer, movie, rating
WHERE movie.mID = rating.mID AND rating.rID = reviewer.rID
AND reviewer.name = movie.director;

/*
Extra Q3 Return all reviewer names and movie names together in a single list, alphabetized.
(Sorting by the first name of the reviewer and first word in the title is fine;
no need for special processing on last names or removing "The".) */





