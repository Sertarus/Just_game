package core;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Characteristic {
    private String name;

    private int value;

    private static Set<String> characteristics = new HashSet<>(Arrays.asList("Attack","Health"));

    public Characteristic(String name, int value){
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public static Set<String> getCharacteristics() {
        return characteristics;
    }
}
