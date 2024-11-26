/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.swing.ImageIcon;

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

    @Column(name = "employee_id")
    private String employeeId;

    @Column(name = "name")
    private String name;

    @Column(name = "gender")
    private boolean gender;

    @Column(name = "image")
    private byte[] image;

    @Column(name = "date_of_birth")
    private Date dateOfBirth;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "manager_id")
    private Employee manager;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "role_detail_id")
    private RoleDetail roleDetail;

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

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "department_id")
    private Department department;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "transportation_allowance_id")
    private TransportationAllowance transportationAllowance;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "contact_id")
    private Contact contact;

    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    private List<Contract> contracts;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "attendance_information_id")
    private AttendanceInformation attendanceInformation;

    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    private List<KOW> kow;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "driver_license_id")
    private DriverLicense driverLicense;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "credit_card_id")
    private CreditCard creditCard;

    @OneToMany(mappedBy = "approver", cascade = CascadeType.ALL)
    private List<Contract> approvedContracts;

    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    private List<LeaveRequest> leaveRequest;

    @OneToMany(mappedBy = "approver", cascade = CascadeType.ALL)
    private List<LeaveRequest> approvedListRequest;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "resignation_id")
    private Resignation resignation;

    @OneToMany(mappedBy = "reciver", cascade = CascadeType.ALL)
    private List<Notification> notifications;

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

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "managerId")
    private Department managerOf;

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

    public Employee() {
        family = new ArrayList<>();
        contracts = new ArrayList<>();
        kow = new ArrayList<>();
        approvedContracts = new ArrayList<>();
        leaveRequest = new ArrayList<>();
        approvedListRequest = new ArrayList<>();
        notifications = new ArrayList<>();
    }

    public Employee(String employeeId, String name, boolean gender, byte[] image, Date dateOfBirth, Employee manager, RoleDetail roleDetail, User user, List<EmployeeFamily> family, PaidLeave paidLeave, MaternityLeave maternityLeave, Insurance insurance, TransportationAllowance transportationAllowance, Contact contact, List<Contract> contracts, AttendanceInformation attendanceInformation, List<KOW> kow, DriverLicense driverLicense, CreditCard creditCard, List<Contract> approvedContracts, List<LeaveRequest> leaveRequest, List<LeaveRequest> approvedListRequest, Resignation resignation, List<Notification> notifications, int senority, String major, String educationalBackground, String academicLevel, String academicTitle, String ethnicity, String taxCode, Department managerOf, Date taxCodeIssueDate, String taxCodeIssuePlace, String nationality, String idNumber, Date idIssueDate, String idIssuePlace, String maritalStatus, boolean status) {
        this.employeeId = employeeId;
        this.name = name;
        this.gender = gender;
        this.image = image;
        this.dateOfBirth = dateOfBirth;
        this.manager = manager;
        this.roleDetail = roleDetail;
        this.user = user;
        this.family = family;
        this.paidLeave = paidLeave;
        this.maternityLeave = maternityLeave;
        this.insurance = insurance;
        this.transportationAllowance = transportationAllowance;
        this.contact = contact;
        this.contracts = contracts;
        this.attendanceInformation = attendanceInformation;
        this.kow = kow;
        this.driverLicense = driverLicense;
        this.creditCard = creditCard;
        this.approvedContracts = approvedContracts;
        this.leaveRequest = leaveRequest;
        this.approvedListRequest = approvedListRequest;
        this.resignation = resignation;
        this.notifications = notifications;
        this.senority = senority;
        this.major = major;
        this.educationalBackground = educationalBackground;
        this.academicLevel = academicLevel;
        this.academicTitle = academicTitle;
        this.ethnicity = ethnicity;
        this.taxCode = taxCode;
        this.managerOf = managerOf;
        this.taxCodeIssueDate = taxCodeIssueDate;
        this.taxCodeIssuePlace = taxCodeIssuePlace;
        this.nationality = nationality;
        this.idNumber = idNumber;
        this.idIssueDate = idIssueDate;
        this.idIssuePlace = idIssuePlace;
        this.maritalStatus = maritalStatus;
        this.status = status;
    }

    public Employee(String name, String employeeId, byte[] img, Date dateOfBirth, boolean gender, int senority, List<Contract> contracts, Contact contact) {
        this.name = name;
        this.employeeId = employeeId;
        this.image = img;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.senority = senority;
        this.contact = contact;
        this.contracts = contracts;
    }

    public Department getManagerOf() {
        return managerOf;
    }

    public void setManagerOf(Department managerOf) {
        this.managerOf = managerOf;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public RoleDetail getRoleDetail() {
        return roleDetail;
    }

    public void setRoleDetail(RoleDetail roleDetail) {
        this.roleDetail = roleDetail;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<EmployeeFamily> getFamily() {
        return family;
    }

    public void setFamily(List<EmployeeFamily> family) {
        this.family = family;
    }

    public PaidLeave getPaidLeave() {
        return paidLeave;
    }

    public void setPaidLeave(PaidLeave paidLeave) {
        this.paidLeave = paidLeave;
    }

    public MaternityLeave getMaternityLeave() {
        return maternityLeave;
    }

    public void setMaternityLeave(MaternityLeave maternityLeave) {
        this.maternityLeave = maternityLeave;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public TransportationAllowance getTransportationAllowance() {
        return transportationAllowance;
    }

    public void setTransportationAllowance(TransportationAllowance transportationAllowance) {
        this.transportationAllowance = transportationAllowance;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public List<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(List<Contract> contracts) {
        this.contracts = contracts;
    }

    public AttendanceInformation getAttendanceInformation() {
        return attendanceInformation;
    }

    public void setAttendanceInformation(AttendanceInformation attendanceInformation) {
        this.attendanceInformation = attendanceInformation;
    }

    public List<KOW> getKow() {
        return kow;
    }

    public void setKow(List<KOW> kow) {
        this.kow = kow;
    }

    public DriverLicense getDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(DriverLicense driverLicense) {
        this.driverLicense = driverLicense;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public List<Contract> getApprovedContracts() {
        return approvedContracts;
    }

    public void setApprovedContracts(List<Contract> approvedContracts) {
        this.approvedContracts = approvedContracts;
    }

    public List<LeaveRequest> getLeaveRequest() {
        return leaveRequest;
    }

    public void setLeaveRequest(List<LeaveRequest> leaveRequest) {
        this.leaveRequest = leaveRequest;
    }

    public List<LeaveRequest> getApprovedListRequest() {
        return approvedListRequest;
    }

    public void setApprovedListRequest(List<LeaveRequest> approvedListRequest) {
        this.approvedListRequest = approvedListRequest;
    }

    public Resignation getResignation() {
        return resignation;
    }

    public void setResignation(Resignation resignation) {
        this.resignation = resignation;
    }

    public List<Notification> getNotifications() {
        return notifications;
    }

    public void setNotifications(List<Notification> notifications) {
        this.notifications = notifications;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getSenority() {
        return senority;
    }

    public void setSenority(int senority) {
        this.senority = senority;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getEducationalBackground() {
        return educationalBackground;
    }

    public void setEducationalBackground(String educationalBackground) {
        this.educationalBackground = educationalBackground;
    }

    public String getAcademicLevel() {
        return academicLevel;
    }

    public void setAcademicLevel(String academicLevel) {
        this.academicLevel = academicLevel;
    }

    public String getAcademicTitle() {
        return academicTitle;
    }

    public void setAcademicTitle(String academicTitle) {
        this.academicTitle = academicTitle;
    }

    public String getEthnicity() {
        return ethnicity;
    }

    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
    }

    public String getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    public Date getTaxCodeIssueDate() {
        return taxCodeIssueDate;
    }

    public void setTaxCodeIssueDate(Date taxCodeIssueDate) {
        this.taxCodeIssueDate = taxCodeIssueDate;
    }

    public String getTaxCodeIssuePlace() {
        return taxCodeIssuePlace;
    }

    public void setTaxCodeIssuePlace(String taxCodeIssuePlace) {
        this.taxCodeIssuePlace = taxCodeIssuePlace;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public Date getIdIssueDate() {
        return idIssueDate;
    }

    public void setIdIssueDate(Date idIssueDate) {
        this.idIssueDate = idIssueDate;
    }

    public String getIdIssuePlace() {
        return idIssuePlace;
    }

    public void setIdIssuePlace(String idIssuePlace) {
        this.idIssuePlace = idIssuePlace;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
