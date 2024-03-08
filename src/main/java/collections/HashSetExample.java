package collections;

import java.util.HashSet;

public class HashSetExample {

    private final HashSet<String> models = new HashSet<>();

    public void addModel(String model) {
        models.add(model);
    }

    public void removeModel(String model) {
        models.remove(model);
    }

    public HashSet<String> getHashModels() {
        return models;
    }

    public boolean containsModel(String model) {
        return models.contains(model);
    }

    //While loop
    public boolean containsModelWhile(String model) {
        boolean found = false;
        String value;
        java.util.Iterator<String> iterator = models.iterator();
        while (iterator.hasNext()) {
            value = iterator.next();
            if (value.equals(model)) {
                found = true;
                break;
            }
        }
        return found;
    }

    public static void main(String[] args) {
        HashSetExample hashSetExample = new HashSetExample();

        hashSetExample.addModel("Model 1");
        hashSetExample.addModel("Model 2");
        hashSetExample.addModel("Model 3");

        String valueToFind = "Model 4";
        String valueToFindWhile = "Model 3";

        boolean containsValue = hashSetExample.containsModel(valueToFind);
        boolean containsValueWhile = hashSetExample.containsModelWhile(valueToFindWhile);

        System.out.println("Search - HashSet contains '" + valueToFind + "': " + containsValue);

        System.out.println("While loop - HashSet contains '" + valueToFindWhile + "': " + containsValueWhile);

        System.out.println("add - HashSet before deletion: " + hashSetExample.getHashModels());

        hashSetExample.removeModel("Model 2");

        System.out.println("delete - HashSet after deletion: " + hashSetExample.getHashModels());


    }

}
