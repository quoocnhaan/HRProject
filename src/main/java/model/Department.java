/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author PC
 */
@Entity
@Table(name = "hr_department")
public class Department {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @Column(name = "department_id")
    private String departmentId;
    
    @OneToOne
    @JoinColumn(name = "manager_id")
    private Employee managerId;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "parent_id")
    private Department parentId;
    
    @Column(name = "total_employee")
    private int totalEmployee;
    
    @Column(name = "level")
    private int level;
    
    @Column(name = "status")
    private boolean status;

    public Department() {
    }

    public Department(String departmentId, Employee managerId, Department parentId, int totalEmployee, int level, boolean status) {
        this.departmentId = departmentId;
        this.managerId = managerId;
        this.parentId = parentId;
        this.totalEmployee = totalEmployee;
        this.level = level;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public Employee getManagerId() {
        return managerId;
    }

    public void setManagerId(Employee managerId) {
        this.managerId = managerId;
    }

    public Department getParentId() {
        return parentId;
    }

    public void setParentId(Department parentId) {
        this.parentId = parentId;
    }

    public int getTotalEmployee() {
        return totalEmployee;
    }

    public void setTotalEmployee(int totalEmployee) {
        this.totalEmployee = totalEmployee;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
}
