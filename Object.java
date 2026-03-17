

public class Object {
    private int num;
    private String name;
    private boolean isActive;

    public Object() {
        this.num = 0;
        this.name = "default";
        this.isActive = false;
    }

    public Object(int num, String name, boolean isActive) {
        this.num = num;
        this.name = name;
        this.isActive = isActive;
    }   

    public int getNum() {
        return num;
    }

    public String getString() {
        return name;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setString(String name) {
        this.name = name;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    @Override
    public String toString() {
        return "Object information: {Name= " + name + ", Number= " + num + ", boolean= " + isActive + "}";
    }
}

