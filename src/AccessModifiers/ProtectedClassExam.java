package AccessModifiers;

public class ProtectedClassExam {
    protected int number;
    protected void protectedMethod()
    {

    }
    protected class InnerProtected{

    }
}
class Protected2Exam extends ProtectedClassExam{
    @Override
    protected void protectedMethod() {
        super.protectedMethod();
        System.out.println(number);
    }
}
