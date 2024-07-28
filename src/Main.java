/**
 * 
 */

/**
 * @author YSS
 *
 */

public class Main {

	public static void main(String[] args) {
		Dog dd = new Dog();
		dd.makeSound();
		Dogs ddd = new Dogs();
		ddd.makeSound();
		
		Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();

		//implementation of the abstract classes and methods
//		childClass c1 = new child_class_abstract_modifier();
//		Object c1 = null;
//		System.out.println(((child_class_abstract_modifier) null).method1());

//		childClass2 c2 = new child_class_abstract_modifier2();
//		System.out.println(((child_class_abstract_modifier2) c2).method1());

		TextBox textBox1 = new TextBox();
		textBox1.setText("box1");
		System.out.println(textBox1.text);

		var textBox2 = new TextBox();
		textBox2.setText("box2");
		System.out.println(textBox2.text.toUpperCase());

		// memory allocation
		var textBox3 = new TextBox();
		var textBox4 = textBox3;
		textBox4.setText("box3");
		System.out.println(textBox3.text);

		//Encapsulation
		Employee e1 = new Employee();
		e1.baseSalary = 30000;
		e1.hourlyRate = 10;
		e1.extraHours = 10;
		int wage = e1.calculateWage();
		System.out.println("Calculating the wages of Employee " + wage);
		int performance = e1.calculatePerformance(20000);
		System.out.println("Calculating the wages of Employee with Bonus " + performance);

		//Encapsulation Private methods for the Employee class
		EmployeePrivate e2 = new EmployeePrivate();
		e2.setBaseSalary(30000);
//		e2.getBaseSalary();
		e2.setHourlyRate(10);
//		e2.getHourlyRate();
		e2.extraHours = 10;
		System.out.println("Calculating the wages of EmployeePrivate " + e2.calculateWage());

		//Abstraction means Reducing complexity by hiding unnecessary details
		EmployeePrivateAbsraction e3 = new EmployeePrivateAbsraction();
		e3.setBaseSalary(30000);
		e3.setHourlyRate(10);
		e3.extraHours = 10;
		System.out.println("Calculating the wages of EmployeePrivateAbstraction " + e3.calculateWage());
		System.out.println("Calculating the wages of EmployeePrivateAbstraction with Bonus " + e3.calculatePerformance(30000));

		//Abstraction using Custom constructor
		var e4 = new EmployeePrivateConstructor(30000,10,10);
		System.out.println("Calculating the wages of EmployeePrivateConstructor " + e4.calculateWage());
		System.out.println("Calculating the wages of EmployeePrivateConstructor with Bonus " + e4.calculatePerformance(5000));


	}
}

