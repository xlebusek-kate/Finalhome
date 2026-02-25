import java.util.Objects;

public class Employee {
    private String informationAboutEmployee;
    private int department;
    private int salary;
    private int id;


    public Employee( String informationAboutEmployee, int department, int salary) {

        this.informationAboutEmployee = informationAboutEmployee;
        this.department = department;
        this.salary = salary;
    }
    public int setId(){
       int idEmployee = 0;
        idEmployee++;
        return  idEmployee = id;
    }

    public int getDepartment() {
        return this.department;
    }

    public String getInformationAboutEmployee() {
        return this.informationAboutEmployee;
    }

    public int getId(){
        return this.id;
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

    public String printShortInfo() {
         return "Имя: " + informationAboutEmployee + "Зарплата: " + salary;
    }

    @Override

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return Objects.equals(salary, employee.salary);
    }

    public String toString() {
        return "ФИО: " + informationAboutEmployee + "Отдел: " + department + "Зарплата: " + salary;
    }


}

