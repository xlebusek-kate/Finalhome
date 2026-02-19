import java.util.Objects;

public class Employee {
    private String informationAboutEmployee;
    private int department;
    private int salary;
    private static int id;


    public Employee(int id, String informationAboutEmployee, int department, int salary) {

        this.informationAboutEmployee = informationAboutEmployee;
        this.department = department;
        this.salary = salary;
    }

    public int getDepartment() {
        return this.department;
    }

    public String getInformationAboutEmployee() {
        return this.informationAboutEmployee;
    }

    public int getSalary() {
        return this.salary;
    }

    public int setSalary(int salary) {
        return this.salary = salary;
    }

    public int setDepartment(int department) {
        return this.department = department;
    }

    public void printShortInfo() {
        System.out.println("Имя: " + informationAboutEmployee + "Зарплата: " + salary);
    }

    @Override

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return salary == employee.salary && Objects.equals(salary, employee.salary);
    }

    public String toString() {
        return "ФИО: " + informationAboutEmployee + "Отдел: " + department + "Зарплата: " + salary;
    }


}

