/**
 * 
 */

/**
 * @author YSS
 *
 */


public interface Animall {
    void makeSound();
}

class Dogs implements Animall {
    public void makeSound() {
        System.out.println("Wooff");
    }
}
