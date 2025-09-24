class Student {
    String name;   // object variable
    int age;

    // Constructor
    Student(String n, int a) {
        name = n;   // object variables initialize
        age = a;
    }

    void showInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}