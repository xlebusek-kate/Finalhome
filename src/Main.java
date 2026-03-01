
public class Main {
    public static void main(String[] args) {


        Employee employee1 = new Employee("Иванов Иван Иванович ", 1 ,100);
        Employee employee2 = new Employee("Алексеев Алексей Алексеевич ", 2 ,150);
        Employee employee3 = new Employee("Андреев Андрей Андреевич ", 3 ,200);

        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.creatBook(employee1);
        employeeBook.creatBook(employee2);
        employeeBook.creatBook(employee3);
        employeeBook.getEmployee();
        System.out.println(employeeBook.averageSalary());












    }
}