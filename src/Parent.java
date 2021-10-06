import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Parent {
    private String name;
    private Integer age;
    private List<Child> childs = new ArrayList<>();

    public Parent(String name, Integer age, List<Child> childs) {
        this.name = name;
        this.age = age;
        this.childs = childs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<Child> getChilds() {
        return childs;
    }

    public void setChilds(List<Child> childs) {
        this.childs = childs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Parent parent = (Parent) o;
        return Objects.equals(name, parent.name) && Objects.equals(age, parent.age) && Objects.equals(childs, parent.childs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, childs);
    }

    @Override
    public String toString() {
        return "Parent{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", childs=" + childs +
                '}';
    }
}
