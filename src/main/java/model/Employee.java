/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author PC
 */
@Entity
@Table(name = "hr_employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String employeeId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "manager_id")
    private Employee manager;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "role_id")
    private Role role;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    private List<EmployeeFamily> family;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "paid_leave_id")
    private PaidLeave paidLeave;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "maternity_leave_id")
    private MaternityLeave maternityLeave;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "insurance_id")
    private Insurance insurance;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "transportation_allowance_id")
    private TransportationAllowance transportationAllowance;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "contact_id")
    private Contact contact;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "attendance_information_id")
    private AttendanceInformation attendanceInformation;
    
    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    private List<KOW> kow;

    @Column(name = "name")
    private String name;

    @Column(name = "gender")
    private boolean gender;

    @Column(name = "date_of_birth")
    private Date dateOfBirth;

    @Column(name = "senority")
    private int senority;

    @Column(name = "major")
    private String major;

    @Column(name = "educational_background")
    private String educationalBackground;

    @Column(name = "academicLevel")
    private String academicLevel;

    @Column(name = "academicTitle")
    private String academicTitle;

    @Column(name = "ethnicity")
    private String ethnicity;

    @Column(name = "tax_code")
    private String taxCode;

    @Column(name = "tax_code_issue_date")
    private Date taxCodeIssueDate;

    @Column(name = "tax_code_issue_place")
    private String taxCodeIssuePlace;

    @Column(name = "nationality")
    private String nationality;

    @Column(name = "id_number")
    private String idNumber;

    @Column(name = "id_issue_date")
    private Date idIssueDate;

    @Column(name = "id_issue_place")
    private String idIssuePlace;

    @Column(name = "marital_status")
    private String maritalStatus;

    @Column(name = "status")
    private boolean status;

}
