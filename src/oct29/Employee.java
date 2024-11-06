package oct29;

public class Employee {
    public double hourlyRate;
    public final double hour;

    public Employee(double hourlyRate, double hour) {
        this.hourlyRate = hourlyRate;
        this.hour = hour;
    }

    public double calculateSalary(){
        return hourlyRate * hour;
    }
}
