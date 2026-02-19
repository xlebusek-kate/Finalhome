
import java.util.Objects;

public class EmployeeBook {
    Employee[] employees=new Employee[10];

    public String allEmployee(){
        for(int i = 0;i<10 ;i ++ ){
            if(employees[i] == null) break;
            Objects.toString(employees[i]);// попытка вывести всю информацию, переделать
        }
        return "";
    }
    int allSalary = 0;
    public void averageSalary(){
        for(int o=0;; o++ ){


        }



    }

}
