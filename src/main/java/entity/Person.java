package entity;

import org.springframework.beans.factory.annotation.Value;

public class Person {

    public Person(String name,int age) {
        this.age = age;
        this.name = name;
    }

    public Person() {
    }

    public int age;
    public String name;
    @Value("${person.nickName}")
    private String nikeName;

    public String getNikeName() {
        return nikeName;
    }

    public void setNikeName(String nikeName) {
        this.nikeName = nikeName;
    }

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
    public void print(){
        System.out.println("Nick name:"+nikeName);
    }
}
