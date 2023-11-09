INSERT INTO user (full_name, birthday, email, password, id, role)
VALUES ('Романовский Иван Михайлович', 23022003, 'qwert@gmail.com', '12345', 8, '1234567'),
('Асаевич Никита Сергеевич', 23032003, '1234r5t6yui@gmail.com', '1235', 9, 'qwertyu'),
('Ходарева Таисия ???', 23022003, '12345678@gmail.com', 'asdf', 10, '1234567'),
('Магдина Валерия ???', 23022003, '1235@gmail.com', 'sdf', 11, '123456'),
('Зайцева Екатерина ???', 23022003, '123456@gmail.com', 'asdsddas', 12, 'asdfgh');

INSERT INTO tag (id, tag)
VALUES(1,'back-end developert'),
(2, 'юрист');

INSERT INTO mentor (experience, mentor_id, user_id, how_can_i_help, skills, tag_id)
VALUES('back-end expert', 1, 8, 'ничем', 'никаких', 2),
('front-end expert', 2, 9, 'чем-то могу', 'какие-то есть', 1);

INSERT INTO catalog_professions (id, name)
VALUES(1,'back-end developer'),
(2, 'юрист');