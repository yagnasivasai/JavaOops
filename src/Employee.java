// 1st Step in Oops (Encapsulation)

public class Employee {
    public int baseSalary;
    public int hourlyRate;
    public int extraHours;

    //Use static only when we have to call from the main method.
    public int calculateWage(){
        return baseSalary + (hourlyRate * extraHours);
    }

    public int calculatePerformance(int bonus){
        return baseSalary + (hourlyRate * extraHours) + bonus;
    }
}
