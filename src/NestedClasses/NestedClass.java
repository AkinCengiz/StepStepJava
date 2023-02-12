package NestedClasses;

public class NestedClass {
    private int privateInt = 1;
    int defaultInt = 2;
    protected int protectedInt = 3;
    public int publicInt = 4;

    public void getPrivateMthod()
    {
        this.privateMethod();
    }
    private void privateMethod(){
        StringArrayPrint stringArray = new StringArrayPrint();
        System.out.println(stringArray.defaultIntIn);
        System.out.println(stringArray.privateIntIn);
        System.out.println(stringArray.protectedIntIn);
        System.out.println(stringArray.publicIntIn);
    };
    void defaultMethod(){};
    protected void protectedMethod(){};
    public void publicMethod(){};



    public class StringArrayPrint{
        private int privateIntIn = 1;
        int defaultIntIn = 2;
        protected int protectedIntIn = 3;
        public int publicIntIn = 4;
        private void stringArrayPrints(String[] arr)
        {
            System.out.println(privateInt);
            System.out.println(defaultInt);
            System.out.println(protectedInt);
            System.out.println(publicInt);

 //           static int number = 25;  inner class içerisinde statik değişken tanımlanamaz ve statik başlatma blokları oluşturulamaz...

            privateMethod();
            defaultMethod();
            protectedMethod();
            publicMethod();
            for(String st : arr)
            {
                System.out.println(st);
            }
        }
        public void getStringArrayPrints(String[] arr)
        {
            this.stringArrayPrints(arr);
        }
    }
}
