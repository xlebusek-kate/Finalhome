import java.util.Arrays;

public class EmployeeBook {
    static final Employee[] employees = new Employee[10];

    public void getEmployee() {
        int i = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.toString());
                i++;
            } else continue;
        }
    }

    public int averageSalary() {
        int sum = 0;
        int count = 0;
        for (int o = 0; o < employees.length - 1; o++) {
            if (employees[o] != null) {
                sum += employees[o].getSalary();
            } else break;
            count++;
        }
        int averageSalaryEmployee = sum / count;
        return averageSalaryEmployee;
    }

    public void salaryIndexation(String type) {
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            int salary = employee.getSalary();
            int taxed = 0;

            switch (type) {
                case "PROPORTIONAL": {
                    taxed = (int) (salary * 0.13);
                    break;
                }
                case "PROGRESSIVE": {
                    if (salary <= 150) {
                        taxed = (int) (salary * 0.13);
                        break;
                    } else if (salary <= 350) {
                        taxed = (int) (salary * 0.17);
                        break;
                    } else {
                        taxed = (int) (salary * 0.21);
                        break;
                    }
                }
                default:
                    System.out.println("Error");
            }
            System.out.println("Информация об работнике: " + employee.getInformationAboutEmployee() + ", индексация: " + taxed);
            return;
        }
    }

    int i = 0;

    public void creatBook(Employee obj) {
        for (Employee employee : employees) {
            if (i == 10) break;
            if (obj == null) break;
            employees[i] = obj;
            i++;
            break;
        }
    }

    public void printAllEmployees() {
        System.out.println(Arrays.toString(employees));
    }


    public void indexSalary(int department, double taxed) {
        for (Employee employee : employees) {
            if (employee == null) continue;
            if (employee.getDepartment() != department) continue;
            int salary = (int) (employee.getSalary() * (1 + taxed / 100));
            employee.setSalary(salary);
            System.out.println(employee.getInformationAboutEmployee() + " итог: " + employee.getSalary());
        }
    }

    public void findFirstEmployeeWithSalaryGreater(int department, int salary) {
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employee == null) continue;
            if (employee.getSalary() > salary && employee.getDepartment() == department) {

                System.out.println("Место: " + (i + 1) + " -> " + employee.printShortInfo());
            }
        }
    }

    public void findFirstEmployeeWithSalaryLess(int wage, int id) {
        int i = 0;
        int j = 0;
        while (i < employees.length && j < id) {
            Employee employee = employees[i];
            if (employee != null && employee.getSalary() < wage) {
                employee.printShortInfo();
                j++;
            }
            i++;
            if (j == id) break;
        }
    }


    public boolean employeeBySalary(Employee employee) {
        for (Employee employee1 : employees) {
            if (employee != null && employee1.equals(employee)) {
                return true;
            }
        }
        return false;
    }

    public void fillingArrBook(Employee newEmployees) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = newEmployees;
                break;
            }
        }
    }

    public String toString(Employee obj) {
        return "Id: " + obj.getId() + ", ФИО: " + obj.getInformationAboutEmployee() +
                ", Отдел: " + obj.getDepartment() + ", Зарплата: " + obj.getSalary();
    }
}
