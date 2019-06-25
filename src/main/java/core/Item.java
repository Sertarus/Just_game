package core;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class Item {
    private String name;

    private Set suitableBodyPart;

    private Map<String,Integer> stats = new HashMap<>();

    private static Map<String,Set> bodyPartsForItems = Map.ofEntries(
            new AbstractMap.SimpleEntry<String,Set>("Dagger",Set.of("Right hand","Left hand")),
            new AbstractMap.SimpleEntry<String,Set>("Sword",Set.of("Right hand","Left hand")),
            new AbstractMap.SimpleEntry<String,Set>("Leather chest",Set.of("Chest"))
    );

    private static Map<String,Map<String, Map.Entry>> itemsStatsRanges = Map.ofEntries(
            Map.entry("Dagger", Map.ofEntries(
                    Map.entry("Attack",Map.entry(1,5))
            )),
            Map.entry("Sword", Map.ofEntries(
                    Map.entry("Attack",Map.entry(3,8))
            )),
            Map.entry("Leather chest", Map.ofEntries(
                    Map.entry("Health",Map.entry(3,10))
            ))
    );

    public Item(String name, String weapon) {
        this.name = name;
        this.suitableBodyPart = bodyPartsForItems.get(weapon);
        Map itemStatsRanges = itemsStatsRanges.get(weapon);
        for (Object statName:itemStatsRanges.keySet()) {
            String statNameString = String.valueOf(statName);
            Map.Entry range = (Map.Entry) itemStatsRanges.get(statNameString);
            int min =(int) range.getKey();
            int max =(int) range.getValue();
            int stat = ThreadLocalRandom.current().nextInt(min,max + 1);
            this.stats.put(statNameString,stat);
        }
    }

    public Item(String name, Map<String,Integer> stats, String weapon) {
        this.name = name;
        this.suitableBodyPart = bodyPartsForItems.get(weapon);
        this.stats = stats;
    }

    public Item(String name, Set suitableBodyPart, Map<String,Integer> stats) {
        this.name = name;
        this.suitableBodyPart = suitableBodyPart;
        this.stats = stats;
    }

    public String getName() {
        return name;
    }

    public Set getSuitableBodyPart() {
        return suitableBodyPart;
    }

    public Map getStats() {
        return stats;
    }

    public void setSuitableBodyPart(Set suitableBodyPart) {
        this.suitableBodyPart = suitableBodyPart;
    }

    public void setStats(Map<String,Integer> stats) {
        this.stats = stats;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println(this.name);
        System.out.println(this.suitableBodyPart.toString());
        System.out.println(this.stats.toString());
    }
}
