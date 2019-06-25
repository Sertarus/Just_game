package core;

public class BodyPart {
    private String name;

    private int damageResistance;

    private int missChance;

    public BodyPart(int damageResistance, int missChance, String name){
        this.damageResistance = damageResistance;
        this.missChance = missChance;
        this.name = name;
    }

    public int getDamageResistance() {
        return damageResistance;
    }

    public int getMissChance() {
        return missChance;
    }

    public String getName() {
        return name;
    }

    public void setDamageResistance(int damageResistance) {
        this.damageResistance = damageResistance;
    }

    public void setMissChance(int missChance) {
        this.missChance = missChance;
    }

    public void setName(String name) {
        this.name = name;
    }
}
