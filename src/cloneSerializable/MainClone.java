package cloneSerializable;

public class MainClone implements Cloneable{
    public static void main(String[] args) {
        Image image = new Image("hhh", 31);
        CloneClass clone = new CloneClass("Ira", 20, image, new Image[]{new Image("Vog", 13), new Image("lila", 56), new Image("dasha", 12)});
        System.out.println(clone);
        CloneClass cloneClass = null;
        try {
            cloneClass = (CloneClass) clone.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(cloneClass);
        System.out.println(clone.equals(cloneClass));
        System.out.println(clone == cloneClass);
    }
}
