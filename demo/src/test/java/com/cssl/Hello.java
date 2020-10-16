package com.cssl;

public class Hello {
    private String name;
    private int age;

    public Hello(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void sayHi(){
        System.out.println("My name is "+this.name+",I am "+this.age+" years old");
    }

    public static void main(String[] args) {
        Hello h1=new Hello("tom",22);
        h1.sayHi();
        Hello h2 = new Hello("jack",33);
        h2.sayHi();
    }
}
