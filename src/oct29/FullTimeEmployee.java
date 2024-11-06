package oct29;

public class FullTimeEmployee extends Employee{
    public FullTimeEmployee(double hourlyRate, double hour) {
        super(hourlyRate, hour);
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hour * 1.20;
    }
}
