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
	}
}
