package cn.oocl.fs.springboot.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "company")
public class Company {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String address;

    @OneToMany
    @JoinColumn(name = "company_id")
    private List<Employee> employees;

    public Company() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}
