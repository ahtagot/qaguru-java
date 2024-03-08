package collections;


import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    private final LinkedList<String> models = new LinkedList<>();

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

    public boolean containsModel(String model) {
        for (String value : models) {
            if (value.equals(model)) {
                return true;
            }
        }
        return false;
    }

    public List<String> getModels() {
        return models;
    }

    public static void main(String[] args) {

        LinkedListExample linkedListExample = new LinkedListExample();

        linkedListExample.addModel("Model 1");
        linkedListExample.addModel("Model 2");
        linkedListExample.addModel("Model 3");

        linkedListExample.addModelFirst("Model Alpha");
        linkedListExample.addModelLast("Model Omega");

        System.out.println("add - List before deletion: " + linkedListExample.getModels());

        linkedListExample.deleteModel("Model 2");

        System.out.println("delete - List after deletion: " + linkedListExample.getModels());

        String valueToFind = "Model 2";
        boolean containsValue = linkedListExample.containsModel(valueToFind);
        System.out.println("search -  LinkedList contains '" + valueToFind + "': " + containsValue);

        //do-while loop

        String toDelete = ("Model Omega");
        do {
            linkedListExample.deleteModel(toDelete);
            System.out.println("do-while loop - After deleting " + toDelete + ": " + linkedListExample.getModels());
        } while (linkedListExample.getModels().contains(toDelete));
    }
}
