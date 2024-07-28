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
	}
}
