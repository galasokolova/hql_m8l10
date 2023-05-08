INSERT INTO library.author (id, first_name, last_name, genre)
VALUES (1, 'Mark', 'Twain', 'novel'),
       (2, 'Toni', 'Morrison', 'Literary fiction'),
       (3, 'Stephen', 'King', 'Horror'),
       (4, 'John', 'Gresham', 'Legal thriller'),
       (5, 'Cormac', 'McCarthy', 'post-apocalyptic');

INSERT INTO library.book (id, title, author_id, publisher_id, date_and_time)
VALUES (1, 'The Adventures of Tom Sawyer', 1, 1, curdate()),
       (2, 'Adventures of Huckleberry Finn', 1, 1, curdate()),
       (3, 'The Prince and the Pauper', 1, 1, curdate()),
       (4, 'Beloved', 2, 2, curdate()),
       (5, 'Song of Solomon', 2, 2, curdate()),
       (6, 'Carrie', 3, 2, curdate()),
       (7, 'It', 3, 2, curdate()),
       (8, 'The Stand', 3, 2, curdate()),
       (9, 'Pet Sematary', 3, 2, curdate()),
       (10, 'A Time to Kill', 4, 3, curdate()),
       (11, 'The Client', 4, 3, curdate()),
       (12, 'The Road', 5, 3, curdate()),
       (13, 'No Country for Old Men', 5, 3, curdate());

INSERT INTO library.publisher (id, name)
values
    (1, 'No Country for Old Men'),
    (2, 'HarperCollins'),
    (3, 'Simon & Schuster');

ALTER TABLE library.book ADD COLUMN date_and_time TIMESTAMP DEFAULT CURRENT_DATE;

UPDATE library.book SET date_and_time =  DATE(CURRENT_DATE);

select date_and_time from book;

UPDATE library.book SET date_and_time = DATE_FORMAT(NOW(), '%Y-%m-%d')
where id between 1 and 13;

ALTER TABLE `library`.`book`
       DROP COLUMN `date`;

ALTER TABLE library.book
       ADD COLUMN date DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP;

DROP TABLE book;
CREATE TABLE library.book(
       id int,
       title varchar(100),
       author_id int,
       publisher_id varchar(100),
       date_and_time date);






