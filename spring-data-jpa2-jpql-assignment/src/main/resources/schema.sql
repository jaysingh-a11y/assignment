DROP TABLE IF EXISTS employee_table;
DROP TABLE IF EXISTS employee_salary;
DROP TABLE IF EXISTS base_employee;

CREATE TABLE employee_table (
                                emp_id BIGINT NOT NULL AUTO_INCREMENT,
                                emp_first_name VARCHAR(50),
                                emp_last_name VARCHAR(50),
                                emp_salary DOUBLE,
                                emp_age INT,
                                PRIMARY KEY (emp_id)
);

CREATE TABLE employee_salary (
                                 id BIGINT NOT NULL AUTO_INCREMENT,
                                 first_name VARCHAR(50),
                                 last_name VARCHAR(50),
                                 age INT,
                                 basic_salary DOUBLE,
                                 bonus_salary DOUBLE,
                                 tax_amount DOUBLE,
                                 special_allowance_salary DOUBLE,
                                 PRIMARY KEY (id)
);

CREATE TABLE base_employee (
                               id BIGINT NOT NULL AUTO_INCREMENT,
                               name VARCHAR(50),
                               emp_type VARCHAR(20),
                               salary DOUBLE,
                               contract_duration INT,
                               PRIMARY KEY (id)
);