package org.ttn.assignment.spring_data_jpa2_jpql_assignment.repository;

import org.ttn.assignment.spring_data_jpa2_jpql_assignment.entity.Employee;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @Query("""
        SELECT e.firstName, e.lastName
        FROM Employee e
        WHERE e.salary > (SELECT AVG(e2.salary) FROM Employee e2)
        ORDER BY e.age ASC, e.salary DESC
    """)
    List<Object[]> findEmployeesWithSalaryGreaterThanAverage();

    @Modifying
    @Query("""
        UPDATE Employee e
        SET e.salary = :salary
        WHERE e.salary < (SELECT AVG(e2.salary) FROM Employee e2)
    """)
    int updateSalaryBelowAverage(@Param("salary") Double salary);

    @Modifying
    @Query("""
        DELETE FROM Employee e
        WHERE e.salary = (SELECT MIN(e2.salary) FROM Employee e2)
    """)
    int deleteEmployeesWithMinimumSalary();


    //native query

    @Query(
            value = """
        SELECT emp_id, emp_first_name, emp_age
        FROM employee_table
        WHERE emp_last_name LIKE '%singh'
    """,
            nativeQuery = true
    )
    List<Object[]> findEmployeesWithLastNameEndingWithSingh();

    @Modifying
    @Query(
            value = """
        DELETE FROM employee_table
        WHERE emp_age > :age
    """,
            nativeQuery = true
    )
    int deleteEmployeesWithAgeGreaterThan(@Param("age") Integer age);
}
