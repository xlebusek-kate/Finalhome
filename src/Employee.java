import java.util.Objects;

public class Employee {
    private final String informationAboutEmployee;
    private int department;
    private int salary;
    private final int id;

    public static int idEmployee = 0;

    public Employee(String informationAboutEmployee, int department, int salary) {

        this.informationAboutEmployee = informationAboutEmployee;
        this.department = department;
        this.salary = salary;
        this.id = ++idEmployee;

    }

    public int getId() {
        return this.id;
    }

    public String getInformationAboutEmployee() {
        return this.informationAboutEmployee;
    }

    public int getDepartment() {
        return this.department;
    }

    public int getSalary() {
        return this.salary;
    }

    public int setDepartment(int department) {
        return this.department = department;
    }

    public int setSalary(int salary) {
        return this.salary = salary;
    }

    public String printShortInfo() {
        return "Информация о работнике: " + informationAboutEmployee + ", Зарплата работника: " + salary;
    }

    @Override

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return Objects.equals(salary, employee.salary);

    }

    public String toString() {
        return "Id: " + id + ", ФИО: " + informationAboutEmployee + ", Отдел: " + department + ", Зарплата: " + salary;
    }
}

