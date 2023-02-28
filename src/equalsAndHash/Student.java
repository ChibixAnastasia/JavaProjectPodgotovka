package equalsAndHash;

import java.util.Objects;

public class Student {
    Integer id;
    String name;
    int age;
    int count;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student that = (Student) o;
        return age == that.age && count == that.count && id.equals(that.id) && Objects.equals(name, that.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, count);
    }

    public Student(Integer id, String name, int age, int count) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.count = count;
    }

    @Override
    public String toString() {
        return "ArrayIterator{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", count=" + count +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
