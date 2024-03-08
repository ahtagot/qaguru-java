package collections;

import java.util.ArrayList;
import java.util.List;

public class ListArrayExample {

    private final List<String> models = new ArrayList<>();

    public void addModel(String model) {
        models.add(model);
    }

    public void deleteModel(String model) {
        models.remove(model);

    }
    public List<String> getModels() {
        return models;
    }

    public void printModels(){
        for (String model : models) {
            System.out.println("for-each loop Model: " + model);
        }
    }

    public int findModelIndex(String target) {
        for (int i = 0; i < models.size(); i++) {
            if (models.get(i).equals(target)) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        ListArrayExample listArrayExample = new ListArrayExample();
        listArrayExample.addModel("Model 1");
        listArrayExample.addModel("Model 2");
        listArrayExample.addModel("Model 3");

//for-each loop

        System.out.println("add - List before deletion: " + listArrayExample.getModels());

        listArrayExample.deleteModel("Model 3");

        System.out.println("delete - List after deletion: " + listArrayExample.getModels());

        listArrayExample.printModels();

        String target = "Model 2";
        int index = listArrayExample.findModelIndex(target);
        System.out.println("search - Index for " + target + " is " + index);
    }


}

