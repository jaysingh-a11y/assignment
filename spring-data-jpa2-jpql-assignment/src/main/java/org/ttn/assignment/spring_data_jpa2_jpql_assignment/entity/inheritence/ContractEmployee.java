package org.ttn.assignment.spring_data_jpa2_jpql_assignment.entity.inheritence;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("CONTRACT")
public class ContractEmployee extends BaseEmployee {

    private Integer contractDuration;

    public Integer getContractDuration() { return contractDuration; }
    public void setContractDuration(Integer contractDuration) { this.contractDuration = contractDuration; }
}
