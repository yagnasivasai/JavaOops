// 1st Step in Oops (Encapsulation)

public class EmployeePrivateConstructor {
    private int baseSalary;
    private int hourlyRate;
    private int extraHours;

    public EmployeePrivateConstructor(int baseSalary,int hourlyRate, int extraHours){
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        setExtraHours(extraHours);
    }

    //Use static only when we have to call from the main method.
    public int calculateWage(){
        return baseSalary + (hourlyRate * extraHours);
    }

    public int calculatePerformance(int bonus){
        return baseSalary + (hourlyRate * extraHours) + bonus;
    }

    //Using getters and setters
    private void setBaseSalary(int baseSalary){
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Salary cannot be less than 0");
        this.baseSalary = baseSalary;
    }

    private int getBaseSalary(){
        return baseSalary;
    }

    private void setHourlyRate(int hourlyRate){
        if (hourlyRate <= 0)
            throw new IllegalArgumentException("HourlyRate cannot be less than 0");
        this.hourlyRate = hourlyRate;
    }
    private int getHourlyRate(){
        return hourlyRate;
    }


    private int getExtraHours() {
        return extraHours;
    }

    private void setExtraHours(int extraHours) {
        if (extraHours <= 0)
            throw new IllegalArgumentException("ExtraHours cannot be less than 0");
        this.extraHours = extraHours;
    }

}
