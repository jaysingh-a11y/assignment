package org.ttn.assignment.spring_data_jpa2_jpql_assignment.entity.inheritence;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("PERMANENT")
public class PermanentEmployee extends BaseEmployee {

    private Double salary;

    public Double getSalary() { return salary; }
    public void setSalary(Double salary) { this.salary = salary; }
}
