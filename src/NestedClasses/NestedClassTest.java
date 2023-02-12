package NestedClasses;

public class NestedClassTest {
    public static void main(String[] args) {
        String[] cities = {"İstanbul","Ankara","İzmir","Çanakkale"};
        NestedClass nestedClass = new NestedClass();
        nestedClass.getPrivateMthod();
        NestedClass.StringArrayPrint stringArrayPrint = new NestedClass().new StringArrayPrint();
        stringArrayPrint.getStringArrayPrints(cities);

        A.B.C objC = new A().new B().new C();
        A.B objB = new A().new B();
        A objA = new A();

        objC.meyhodC();
        objB.methodB();
        objA.methodA();

    }
}
