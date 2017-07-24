public class Obj {

    public int age;
    public String name;

    public Obj(int age, String name){
        this.age = age;
        this.name = name;
    }

    public void changeName(String otherName){
        this.name = otherName;
    }

    @Override
    public String toString() {
        return "Obj{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
