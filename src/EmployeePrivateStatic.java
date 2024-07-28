// 1st Step in Oops (Encapsulation)

public class EmployeePrivateStatic {
    private int baseSalary;
    private int hourlyRate;
    private int extraHours;

    //This static method does not belong to any particular employee
    //So if we want directly through class then we should declare them as static without creating object
    //Static methods can only see other Static methods
    //If we want see other methods then we have to create an object
    public static int numberOfEmployees;

    public static void printNoOfEmployees(){
        System.out.println("No of Employees from Static Method: " + numberOfEmployees);
    }

    public EmployeePrivateStatic(int baseSalary,int hourlyRate,int extraHours){
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        setExtraHours(extraHours);
        numberOfEmployees++;
    }

    //Use static only when we have to call from the main method.
    public int calculateWage(){
        return baseSalary + (hourlyRate * extraHours);
    }
    public int calculatePerformance(int bonus){
        return baseSalary + (hourlyRate * extraHours) + bonus;
    }

    //Using getters and setters
    private int getBaseSalary(){
        return baseSalary;
    }
    private void setBaseSalary(int baseSalary){
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Salary cannot be less than 0");
        this.baseSalary = baseSalary;
    }

    private int getHourlyRate(){
        return hourlyRate;}
    private void setHourlyRate(int hourlyRate){
        if (hourlyRate <= 0)
            throw new IllegalArgumentException("HourlyRate cannot be less than 0");
        this.hourlyRate = hourlyRate;
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
