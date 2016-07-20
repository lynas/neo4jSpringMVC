package com.lynas.model;

import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.List;

/**
 * Created by LynAs on 7/20/2016
 */
@NodeEntity
public class Organization {
    private Long id;
    private String Name;

    @Relationship(type = "HAS")
    private List<Employee> employees;

    public Organization() {
    }

    public Organization(Long id, String name, List<Employee> employees) {
        this.id = id;
        Name = name;
        this.employees = employees;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
