package com.driver;

class A{
    public  String meth() {
        return "Invoking method from class A";
    }
}

class B extends A{
    public  String meth() {
        return "Method is overridden in Extended class B";
    }
}

public class Main {
    public static void main(String[] args) {
        B b = new B();
        A a = new A();
        System.out.println(a.meth());
        System.out.println(b.meth());
    }
}

//Task 1: Create a class A with a method named meth returning a string: "Invoking method from class A"
//
//Task 2: Create a class B which extends class A
//
//Task 3: Create an object of class B and call method meth of class A with it
//
//Task 4: Now override method meth of class A in class B, which returns the following string: "Method is overridden in Extended class B"
//
//Task 5: Call this overridden method from object of class B