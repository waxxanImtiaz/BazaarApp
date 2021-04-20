package bazaar.beans;

public class Student {
    private String id;
    private String name;
    private String batch;

    public Student() {
    }

    public Student(String id, String name, String batch) {
        this.id = id;
        this.name = name;
        this.batch = batch;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }
}
