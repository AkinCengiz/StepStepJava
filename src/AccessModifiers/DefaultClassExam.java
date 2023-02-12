package AccessModifiers;

public class DefaultClassExam {

    int number = 5;
    void method()
    {
        System.out.println();
    }
}

class Default2Class extends DefaultClassExam{
    @Override
    void method() {
        super.method();
    }
}
