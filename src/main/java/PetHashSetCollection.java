
import java.util.HashSet;
import java.util.Set;

public class PetHashSetCollection {
    private Set<Pet> petInfo = new HashSet<>();

    protected void addPetInfo(Pet pet){
        petInfo.add(pet);
        System.out.println("[ADD] " + pet.getName() + " is added in the Vet");
    }

    protected void printPets(){
        System.out.println("[PRINT] All pet data:" + "\n" + petInfo);
    }

    protected void removePetInfo(Pet pet){
        petInfo.remove(pet);
        System.out.println("[REMOVE] " + pet.getName() + "'s info is deleted from the Vet");
    }

    protected void searchPet(Pet pet){
        if (petInfo.contains(pet)){
            System.out.println("[SEARCH] " + pet + "is found");
        } else {
            System.out.println("Could not find data, recheck your request");
        }
    }
}
