/**
 * 
 */

/**
 * @author YSS
 *
 */
public abstract class Animal {
	// Abstract method (does not have a body)
    public abstract void makeSound();

    // Regular method
    public void sleep() {
        System.out.println("Zzz...");
    }

}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("Woof");
    }
}
