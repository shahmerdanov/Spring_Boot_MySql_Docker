USE company;

CREATE TABLE employees
(
    id       INT PRIMARY KEY AUTO_INCREMENT,
    name     VARCHAR(255),
    position VARCHAR(255),
    salary   DECIMAL(19, 2)
);

INSERT INTO employees (name, position, salary)
VALUES ('Shamil Shahmerdanov', 'Java Developer', 55000.00),
       ('Elvin Huseyinov', 'Data Analyst', 55000.00);
