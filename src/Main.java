public class Main {

    public static void main(String[] args) {
//        EmployeeList el = new EmployeeList();
//        System.out.println();
//        System.out.println(el.EmployeeList());
//        System.out.println();
        Employee[] employees = new Employee[5];
        employees[0] = new TechnicalWriter("Mark", 50000, 4, 2);
        employees[1] = new Engineer("Natashia", 50000, 7, 2);
        employees[2] = new ProductManager("Carlos", 50000, 8, 5);

        for (int i = 0; i<3; i++) {
            System.out.print(employees[i].toString());
        }
        for (Employee employee: employees) {
            employee.getBaseSalary();
        }
    }

//    employees[3]
//        System.out.println(Mark);
//        System.out.println(Natashia);
//        System.out.println(Carlos);
}