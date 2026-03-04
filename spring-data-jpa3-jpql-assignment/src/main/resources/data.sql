INSERT INTO authors (id, name, street_number, location, state) VALUES
                                                                   (1, 'Jay Singh', '101', 'Noida', 'UP'),
                                                                   (2, 'Amit Sharma', '202', 'Delhi', 'DL'),
                                                                   (3, 'Rohit Verma', '303', 'Gurgaon', 'HR'),
                                                                   (4, 'Neha Gupta', '404', 'Pune', 'MH'),
                                                                   (5, 'Priya Mehta', '505', 'Mumbai', 'MH');

INSERT INTO books (id, book_name) VALUES
                                      (1, 'Spring Boot Guide'),
                                      (2, 'Hibernate Essentials'),
                                      (3, 'Java Deep Dive'),
                                      (4, 'Microservices Architecture'),
                                      (5, 'System Design Basics');

UPDATE authors SET one_to_one_book_id = 1 WHERE id = 1;
UPDATE authors SET one_to_one_book_id = 2 WHERE id = 2;
UPDATE authors SET one_to_one_book_id = 3 WHERE id = 3;
UPDATE authors SET one_to_one_book_id = 4 WHERE id = 4;
UPDATE authors SET one_to_one_book_id = 5 WHERE id = 5;

INSERT INTO books (id, book_name, author_id) VALUES
                                                 (6, 'Spring Data JPA', 1),
                                                 (7, 'Hibernate Core', 1),
                                                 (8, 'REST APIs with Spring', 2),
                                                 (9, 'Advanced Java', 3),
                                                 (10, 'Cloud Native Apps', 4);

INSERT INTO subjects (id, name, author_id) VALUES
                                               (1, 'Java', 1),
                                               (2, 'Spring', 1),
                                               (3, 'JPA', 1),
                                               (4, 'Hibernate', 2),
                                               (5, 'Microservices', 2),
                                               (6, 'Spring Boot', 3),
                                               (7, 'Design Patterns', 3),
                                               (8, 'SQL', 4),
                                               (9, 'Cloud', 4),
                                               (10, 'System Design', 5);

INSERT INTO author_book_mtm (author_id, book_id) VALUES
                                                     (1, 4),
                                                     (1, 5),
                                                     (2, 3),
                                                     (3, 5),
                                                     (4, 4),
                                                     (5, 3);