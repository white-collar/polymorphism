package a.level.objects;

public class NewClass {
    // data
    String name;

    // constructor
    NewClass() {
        name = "My first constructor";
    }

    NewClass(String name) {
        this.name = name;
    }

    // methods

    // getter
    public String getName() {
        return name;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }
}
