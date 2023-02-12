package AbstractAndInterface.Comparable;

public class Student implements Comparable<Student> {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Ad\t: " + this.name + "\t\t-\t\t Id\t: " + this.id;
    }

    @Override
    public int compareTo(Student o) {
        /*if(this.id < o.id){
            return -1;
        }else if(this.id > o.id)
        {
            return 1;
        }else {
            return 0;
        }*/
        if(this.name.compareTo(o.name) < 0)
        {
            return -1;
        }else if(this.name.compareTo(o.name) > 0)
        {
            return 1;
        }else{
            return 0;
        }
    }
}
