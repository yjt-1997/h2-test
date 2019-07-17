package cn.oocl.fs.springboot.entity;

import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue
    private int id;
    private String name;



    public Employee() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
