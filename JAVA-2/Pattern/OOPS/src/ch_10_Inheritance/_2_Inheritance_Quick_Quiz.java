package ch_10_Inheritance;
class Animal{
    String name;
    String color;

    //getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    //methods
    public void speak(){
        System.out.println("Speaking...");
    }
}
class Dog extends Animal{
    String food;

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }
    //methods
    public void bark(){
        System.out.println("Barking...");
    }
}

public class _2_Inheritance_Quick_Quiz {
    public static void main(String[] args) {
        Animal ani = new Animal();
        Dog dg = new Dog();
        ani.setName("Lav");
        dg.setColor("shawla");
        dg.setFood("Butki");
        System.out.println(ani.getName());
        System.out.println(dg.getColor());
        System.out.println(dg.getFood());
        ani.speak();
        dg.bark();
    }
}
