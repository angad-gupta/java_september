package oct29;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee fullTime = new FullTimeEmployee(40 ,17);

        System.out.println(fullTime.calculateSalary());
    }
}
