package equalsAndHash;

import java.util.Objects;

public class SimpleArray {
   Integer id;
   String name;
   int age;
   int count;

   @Override
   public boolean equals(Object object) {
      if (this == object) return true;
      if (object == null || getClass() != object.getClass()) return false;

      SimpleArray that = (SimpleArray) object;

      if (!id.equals(that.id)) return false;
      if (age != that.age) return false;
      if (count != that.count) return false;
      return Objects.equals(name, that.name);
   }

   @Override
   public int hashCode() {
      int result = id.hashCode();
      result = 31 * result + (name != null ? name.hashCode() : 0);
      result = 31 * result + age;
      result = 31 * result + count;
      return result;
   }

   @Override
   public String toString() {
      return "SimpleArray{" +
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
