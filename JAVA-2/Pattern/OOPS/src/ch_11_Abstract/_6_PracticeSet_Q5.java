//Q3. Create a class Monkey with jump() and bite() methods.Create a class Human which inherits this monkey class and
// implements BasicAnimal interface with eat() and sleep methods.
//implements polymorphism.
package ch_11_Abstract;

class Monkey1{
    public void jump(){
        System.out.println("Jump...");
    }
    public void bite(){
        System.out.println("bite...");
    }
}
interface BasicAnimal1{
    void eat();
    void sleep();
}
class Human1 extends Monkey implements BasicAnimal1{
    public void eat(){
        System.out.println("Eat...");
    };
    public void sleep(){
        System.out.println("Sleep...");
    };
}
public class _6_PracticeSet_Q5 {
    public static void main(String[] args) {
        BasicAnimal1 as = new Human1();
        as.eat();


    }
}
