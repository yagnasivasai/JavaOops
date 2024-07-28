// 1st Step in Oops (Encapsulation)

public class EmployeePrivateAbsraction {
    private int baseSalary;
    private int hourlyRate;
    public int extraHours;

    //Use static only when we have to call from the main method.
    public int calculateWage(){
        return baseSalary + (hourlyRate * extraHours);
    }

    public int calculatePerformance(int bonus){
        return baseSalary + (hourlyRate * extraHours) + bonus;
    }

    //Using getters and setters
    public void setBaseSalary(int baseSalary){
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Salary cannot be less than 0");
        this.baseSalary = baseSalary;
    }

    private int getBaseSalary(){
        return baseSalary;
    }

    public void setHourlyRate(int hourlyRate){
        if (hourlyRate <= 0)
            throw new IllegalArgumentException("HourlyRate cannot be less than 0");
        this.hourlyRate = hourlyRate;
    }
    private int getHourlyRate(){
        return hourlyRate;
    }
}
