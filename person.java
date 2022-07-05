package Collections;

public class person {
    private int id;
    private String name;


    public person(int id,String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "person{" +
                "id=" + id +
                '}';
    }
}
