package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapExample {
    private final HashMap<String, Integer> models = new HashMap<>();

    public void addModelPair(String key, int value) {
        models.put(key, value);
    }

    public void removeModelByKey(String key) {
        models.remove(key);
    }

    public Integer getKeys(String key) {
        return models.get(key);
    }

    public List<Integer> getValues() {
        return new ArrayList<>(models.values());
    }

    // for loop
    public void printHashMap() {
        for (Map.Entry<String, Integer> entry : models.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println("for loop - Key: " + key + ", Value: " + value);
        }
    }

    public static void main(String[] args) {
        HashMapExample hashMapExample = new HashMapExample();

        hashMapExample.addModelPair("Model 1", 101);
        hashMapExample.addModelPair("Model 2", 102);
        hashMapExample.addModelPair("Model 3", 103);

        System.out.println("add - List before deletion: " + hashMapExample.getValues());

        hashMapExample.removeModelByKey("Model 3");

        System.out.println("delete - List after deletion: " + hashMapExample.getValues());

        String keyToFind = "Model 1";
        Integer value = hashMapExample.getKeys(keyToFind);

        System.out.println("search - Value for key '" + keyToFind + " is " + value);

        hashMapExample.printHashMap();
    }
}

