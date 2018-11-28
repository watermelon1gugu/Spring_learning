package entity;

public class Person {

    public Person(String name,int age) {
        this.age = age;
        this.name = name;
    }

    public Person() {
    }

    public int age;
    public String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
