// when two or more classes inheritance a single class it is know hierarchical inheritance 


class Animal{
    void eat(){System.out.println("eating.....");}
}
class Dog extends Animal{
    void bark(){System.out.println("barking");}
}
class Cat extends Animal{
    void meow(){System.out.println("meowing....");}
}
class Hierarchical_inhet{
    public static void main(String[] args){
        Cat c = new Cat();
        c.meow();
        c.eat();
    }
}