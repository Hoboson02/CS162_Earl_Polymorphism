import java.util.*;
public class EmployeeList {
    ArrayList<Employee> employees;
    Employee employee;
    public ArrayList<Employee> EmployeeList(){
        employees = new ArrayList<Employee>();
        Employee Mark = new Employee("Mark", 50000, 4, 2);
        Employee Natashia = new Employee("Natashia", 50000, 7, 2);
        Employee Carlos = new Employee("Carlos", 50000, 8, 5);
        TechnicalWriter technicalWriter = new TechnicalWriter("Mark", 50000, 4, 2);
        System.out.println(technicalWriter.toString());
        System.out.println();
        Engineer engineer = new Engineer("Natashia", 50000, 7, 2);
        System.out.println(engineer.toString());
        System.out.println();
        ProductManager productManager = new ProductManager("Carlos", 50000, 8, 5);
        System.out.println(productManager.toString());
//        System.out.println(Mark);
//        System.out.println(Natashia);
//        System.out.println(Carlos);
        return employees;
    }
    void add() {

    }


}
