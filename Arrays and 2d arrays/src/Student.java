public class Student {
    private int id;
    private String name;


    public void setId(int id){

        this.id = id;
        System.out.println("in setter");

    }

    public void setName(String name) {
        this.name = name;
        System.out.println("in setter");
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
