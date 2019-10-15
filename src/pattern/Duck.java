package pattern;

import java.util.Objects;

public class Duck {
    private static Duck instance;
    private String name;
    private Duck(){}
    public static synchronized Duck getInstance() {
        if (instance == null)
            instance = new Duck();
        return instance;
    }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    //@Override
    public boolean equals(Object a) {
        if (this == a) return true;
        if (a == null || getClass() != a.getClass()) return false;
        Duck duck = (Duck) a;
        return Objects.equals(instance, duck.instance) && Objects.equals(name, duck.name);
    }
    //@Override
    public int hashCode() { return Objects.hash(instance, name); }
    //@Override
    public String toString() { return "pattern.Duck{" + ", name = " + name + '\"' + "}"; }
}