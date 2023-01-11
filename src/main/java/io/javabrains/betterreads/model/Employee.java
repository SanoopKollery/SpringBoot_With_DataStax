package io.javabrains.betterreads.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @PrimaryKey
    private String id;
    private String fname;
    private String lname;
    private int age;
    private String joindate;
    private float salary;

}
