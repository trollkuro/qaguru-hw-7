import java.util.HashMap;
import java.util.Map;

public class PetOwnerHashMapCollection {
    private Map<Owner, Pet> petOwnerInfo = new HashMap<>();

    protected void addPetAndOwner(Owner owner, Pet pet){
        petOwnerInfo.put(owner, pet);
        System.out.println("[ADD] Record owner-pet for the owner " + owner + " is added");
    }

    protected void printPetAndOwners(){
        System.out.println("[PRINT] All pet-owners data: " + "\n" + petOwnerInfo);
    }

    protected void removePetAndOwner(Owner owner){
        petOwnerInfo.remove(owner);
        System.out.println("[REMOVE] Record owner-pet for the owner "+ owner + " is removed");
    }

    protected void searchForPetAndOwner(Owner owner){
        if (petOwnerInfo.containsKey(owner)) {
            System.out.println("[SEARCH] " + petOwnerInfo.get(owner) + " is found");
        } else {
            System.out.println("[SEARCH] Could not find data, recheck your request");
        }
    }

}
