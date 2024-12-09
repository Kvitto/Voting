INSERT INTO USERS (EMAIL, FIRST_NAME, LAST_NAME, PASSWORD)
VALUES ('user@gmail.com', 'User_First', 'User_Last', 'password'),
       ('admin@gmail.ru', 'Admin_First', 'Admin_Last', 'admin');

INSERT INTO USER_ROLE (ROLE, USER_ID)
VALUES ('ROLE_USER', 1),
       ('ROLE_ADMIN', 2),
       ('ROLE_USER', 2);

INSERT INTO RESTAURANT (NAME)
VALUES ('MacDonnalds'),
       ('KFC'),
       ('Rosticks');

INSERT INTO DISH (DATE, DESCRIPTION, PRICE, RESTAURANT_ID)
VALUES ('2020-01-30', 'Chicken Roll', 350, 1),
       ('2020-01-30', 'Chili Chicken', 420, 2),
       ('2020-01-31', 'Beef burger', 279.99, 3);