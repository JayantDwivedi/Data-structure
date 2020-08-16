package Inheritance;

 class Inheritance {
     public static void main(String[] args) {
         C obj = new C();
         obj.a();
         B objb = new B();
         objb.b();
         obj.a();
         obj.c();
     }
}

class A {
    void a() {
        System.out.println("I am from Class A");
    }
}
class B extends A {
    void b() {
        System.out.println("I am from Class B");
    }
}
class C extends A {
    void c() {
        System.out.println("I am from C");
    }
}

