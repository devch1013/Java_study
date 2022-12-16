package org.example;

public interface InterfaceExample {
// interface는 interface만 상속받을 수 있다.

}

// A simple interface
interface In1 {

    // public, static and final
    final int a = 9;

    // public and abstract
    void display();
}

interface In2 {

    // public, static and final
    final int a = 10;

    // public and abstract
    void display();
}

interface In3 extends In1, In2 {

    // public, static and final
    final int a = 11;

    // public and abstract
    void display2();
}

// A class that implements the interface.
class TestClass implements In3 {

    // Implementing the capabilities of
    // interface.
    public void display2() {
        System.out.println("GeeksforGeek2s");
    }

    public void display() {
        System.out.println("GeeksforGeeks1");
    }

    // Driver Code
    public static void main(String[] args) {
        TestClass t = new TestClass();
        t.display();
        System.out.println(a);
        RecordTest recordTest = new RecordTest(12, "sas");
        System.out.println(recordTest.age());
        System.out.println(t.hashCode());
        System.out.println(recordTest.hashCode());
        System.out.println(recordTest);

        Integer a = 12;
        Integer b = 13;
        System.out.println(a.byteValue());
        System.out.println(b.hashCode());

    }
}