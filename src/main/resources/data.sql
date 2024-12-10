INSERT INTO USERS (EMAIL, FIRST_NAME, LAST_NAME, PASSWORD)
VALUES ('user@gmail.com', 'User_First', 'User_Last', '{noop}password'),
       ('admin@gmail.ru', 'Admin_First', 'Admin_Last', '{noop}admin');

INSERT INTO USER_ROLE (ROLE, USER_ID)
VALUES ('USER', 1),
       ('ADMIN', 2),
       ('USER', 2);

INSERT INTO RESTAURANT (NAME)
VALUES ('MacDonnalds'),
       ('KFC'),
       ('Rosticks');

INSERT INTO DISH (DATE, DESCRIPTION, PRICE, RESTAURANT_ID)
VALUES ('2020-01-30', 'Chicken Roll', 350, 1),
       ('2020-01-30', 'Chili Chicken', 420, 2),
       ('2020-01-31', 'Beef burger', 279.99, 3);