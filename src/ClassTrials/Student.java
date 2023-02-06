package ClassTrials;

public class Student {
    /*
            Ogrenci isimli sınıf oluşturun. Bu sınıfta ogrencinin idsi ve not değeri
            tutulmalı. 100 elemanlı bir dizide id ve not değerlerini rastgele olusturarak
            bu ogrencileri saklayın ve bu ogrencileri aldıkları notlara göre azalan sırada
            yazdıran metotu yazın.
     */
    private int id;
    private String firstName;
    private String lastName;
    private int note;

    public Student(int id, String firstName, String lastName)
    {
        this(id,firstName,lastName,0);
    }
    public Student(int id, String firstName, String lastName, int note)
    {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.note = note;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }
    public static void sortNote(Student[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            for(int j = i+1; j < arr.length; j++)
            {
                if(arr[i].getNote() > arr[j].getNote())
                {
                    Student temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
