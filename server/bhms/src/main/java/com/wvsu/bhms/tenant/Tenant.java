package com.wvsu.bhms.tenant;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@Entity
public class Tenant {

    @Id
    @GeneratedValue
    private long id;
    private String firstName;
    private String lastName;
}
