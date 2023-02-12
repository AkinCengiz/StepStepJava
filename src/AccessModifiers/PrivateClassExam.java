package AccessModifiers;

/*private*/ class PrivateClassExam {
    //Private sınıf tanımlamalarında kullanılamaz.

    /**
     * Private değişken ve methodlar sadece sınıf içerisinden erişilebilir. Bu değişkenler sadece tanımlandığı sınıfa özeldir.
     *
     * Private yapılan kurucu method o sınıftan nesne üretilmesini engeller... Ayrıca o sınıftan kalıtım yoluyla yeni sınıf oluşturulamaz...
     *
     * Private ile inner sınıf tanımlanabilir....
     */
    private int a;
    private void method(){

    }
    private PrivateClassExam()
    {

    }
    private class InnerClass{

    }
}
