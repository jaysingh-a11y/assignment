INSERT INTO employee_table (emp_first_name, emp_last_name, emp_salary, emp_age)
VALUES
    ('Amit', 'Singh', 50000, 30),
    ('Rohit', 'Kumar', 40000, 28),
    ('Neha', 'Singh', 70000, 35),
    ('Priya', 'Sharma', 30000, 25),
    ('Vikas', 'Singh', 90000, 40);

INSERT INTO employee_salary
(first_name, last_name, age, basic_salary, bonus_salary, tax_amount, special_allowance_salary)
VALUES
    ('Amit', 'Singh', 30, 40000, 5000, 3000, 2000),
    ('Neha', 'Singh', 35, 60000, 8000, 5000, 4000);

INSERT INTO base_employee (name, emp_type, salary, contract_duration)
VALUES
    ('Amit', 'PERMANENT', 60000, NULL),
    ('Rohit', 'CONTRACT', NULL, 12);