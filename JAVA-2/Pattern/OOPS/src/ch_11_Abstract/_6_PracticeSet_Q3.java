//Q3. Create a class Monkey with jump() and bite() methods.Create a class Human which inherits this monkey class and
// implements BasicAnimal interface with eat() and sleep methods.
package ch_11_Abstract;
class Monkey{
    public void jump(){
        System.out.println("Jump...");
    }
    public void bite(){
        System.out.println("bite...");
    }
}
interface BasicAnimal{
     void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{
    public void eat(){
        System.out.println("Eat...");
    };
    public void sleep(){
        System.out.println("Sleep...");
    };
}

public class _6_PracticeSet_Q3 {
    public static void main(String[] args) {
//        BasicAnimal as = new Human();
//        as.eat();
        Human hm = new Human();
        hm.eat();
    }
}
