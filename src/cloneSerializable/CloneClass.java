package cloneSerializable;

import java.util.Arrays;
import java.util.Objects;

public class CloneClass implements Cloneable {
    String name;
    int age;
    Image image;
    Image[] im = new Image[3];

    public CloneClass(String name, int age, Image image, Image[] im) {
        this.name = name;
        this.age = age;
        this.image = image;
        this.im = im;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CloneClass that = (CloneClass) o;
        return age == that.age && name.equals(that.name) && Objects.equals(image, that.image) && Arrays.equals(im, that.im);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, age, image);
        result = 31 * result + Arrays.hashCode(im);
        return result;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
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

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public Image[] getIm() {
        return im;
    }

    public void setIm(Image[] im) {
        this.im = im;
    }
}
