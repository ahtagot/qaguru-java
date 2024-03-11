package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {

    private final Deque<String> models = new ArrayDeque<>();

    public void addModel(String model) {
        models.add(model);
    }

    public void addModelFirst(String model) {
        models.addFirst(model);
    }

    public void addModelLast(String model) {
        models.addLast(model);
    }


    public void deleteModel(String model) {
        models.remove(model);

    }

    public Deque<String> getModels() {
        return models;
    }

    public boolean containsModel(String model) {
        for (String value : models) {
            if (value.equals(model)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        DequeExample dequeExample = new DequeExample();

        dequeExample.addModel("Model 1");
        dequeExample.addModel("Model 2");
        dequeExample.addModel("Model 3");

        dequeExample.addModelFirst("Model Alpha");
        dequeExample.addModelLast("Model Omega");

        System.out.println("add - List before deletion: " + dequeExample.getModels());

        dequeExample.deleteModel("Model 2");

        System.out.println("delete - List after deletion: " + dequeExample.getModels());

        String toFind = "Model 2";
        boolean containsValue = dequeExample.containsModel(toFind);
        System.out.println("search -  dequeExample contains '" + toFind + "': " + containsValue);

        //for-each loop

        for (String deqeueList : dequeExample.getModels()) {
            System.out.println("for loop - list of dequeExample: " + deqeueList);

        }
    }
}