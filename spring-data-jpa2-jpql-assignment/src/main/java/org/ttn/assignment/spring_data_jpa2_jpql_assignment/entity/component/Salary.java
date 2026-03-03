package org.ttn.assignment.spring_data_jpa2_jpql_assignment.entity.component;

import jakarta.persistence.Embeddable;

@Embeddable
public class Salary {

    private Double basicSalary;
    private Double bonusSalary;
    private Double taxAmount;
    private Double specialAllowanceSalary;

    public Double getBasicSalary() { return basicSalary; }
    public Double getBonusSalary() { return bonusSalary; }
    public Double getTaxAmount() { return taxAmount; }
    public Double getSpecialAllowanceSalary() { return specialAllowanceSalary; }

    public void setBasicSalary(Double basicSalary) { this.basicSalary = basicSalary; }
    public void setBonusSalary(Double bonusSalary) { this.bonusSalary = bonusSalary; }
    public void setTaxAmount(Double taxAmount) { this.taxAmount = taxAmount; }
    public void setSpecialAllowanceSalary(Double specialAllowanceSalary) { this.specialAllowanceSalary = specialAllowanceSalary; }
}
