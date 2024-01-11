import java.util.ArrayList;
import java.util.List;

public class ArrayListCollection {
    private List<Pet> goodBoyList = new ArrayList<>();

    protected void addToGoodBoyList(Pet pet){
        goodBoyList.add(pet);
        System.out.println("[ADD] Pet " + pet.getName() + " is added as a good boy !");
    }

    protected void printGoodBoyList(){
        System.out.println("[PRINT] All good boys are: " + "\n" + goodBoyList);
    }

    protected void removeToGoodBoyList(Pet pet){
        goodBoyList.remove(pet);
        System.out.println("[REMOVE] Pet " + pet.getName() + " is no more a good boy :(");
    }

    protected void searchForGoodBoy(String name){
        for (Pet pet : goodBoyList){
            if (pet.getName().contains(name)){
                System.out.println("[SEARCH] " + pet + " is found is the good boy list !");
                break;
            }
                System.out.println("[SEARCH] Could not find pet in the good boy list :(");
        }
    }

}
