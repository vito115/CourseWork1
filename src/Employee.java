import java.util.Objects;

public class Employee {

    private String firstName;
    private String lastName;
    private String middleName;
    private int department;
    private int salary;
    private static int nextId = 1;
    private final int id;

    public Employee(String lastName, String firstName, String middleName, int department, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.department = department;
        this.salary = salary;
        this.id = nextId++;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getMiddleName() {
        return middleName;
    }
    public int getDepartment() {
        return department;
    }
    public int getSalary() {
        return salary;
    }
    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return firstName.equals(employee.firstName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName);
    }

    @Override
    public String toString() {
        return "ФИО: " + lastName + " " + firstName + " " + middleName + "; Отдел: " + department + "; Зарплата: " + salary + " руб. ; Id: " + id;
    }
}
