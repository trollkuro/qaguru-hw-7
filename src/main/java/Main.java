
public class Main {

    public static void main(String[] args) {
        Owner dogOwner = new Owner("Vasilisa", 123123);
        Owner catOwner = new Owner("Misha", 676768);
        Owner humsterOwner = new Owner("Olya", 999544);

        Pet dog = new Pet("dog", "Labracadabrador", 3, dogOwner);
        Pet cat = new Pet("cat", "Fluffy", 5, catOwner);
        Pet humster = new Pet("humster", "Rocky", 1, humsterOwner);

        HashSetCollection petCollection = new HashSetCollection();
        HashMapCollection petOwnerCollection = new HashMapCollection();
        ArrayListCollection goodBoyCollection = new ArrayListCollection();
        LinkedListCollection waitingList = new LinkedListCollection();

        // ArrayList example
        goodBoyCollection.addToGoodBoyList(dog);
        goodBoyCollection.addToGoodBoyList(cat);
        goodBoyCollection.printGoodBoyList();
        goodBoyCollection.searchForGoodBoy(dog.getName());
        goodBoyCollection.removeToGoodBoyList(cat);
        goodBoyCollection.printGoodBoyList();
        System.out.println("\n");

        // HashSet example
        petCollection.addPetInfo(dog);
        petCollection.addPetInfo(cat);
        petCollection.addPetInfo(humster);
        petCollection.printPets();
        petCollection.searchPet(cat);
        petCollection.removePetInfo(humster);
        petCollection.printPets();
        System.out.println("\n");

        // HashMap example
        petOwnerCollection.addPetAndOwner(dogOwner, dog);
        petOwnerCollection.addPetAndOwner(catOwner, cat);
        petOwnerCollection.printPetAndOwners();
        petOwnerCollection.searchForPetAndOwner(catOwner);
        petOwnerCollection.removePetAndOwner(dogOwner);
        petOwnerCollection.printPetAndOwners();
        System.out.println("\n");

        //LinkedList example
        waitingList.addOwnerToWaitingList(catOwner);
        waitingList.addOwnerToWaitingList(dogOwner);
        waitingList.addOwnerToWaitingList(humsterOwner);
        waitingList.printWaitingList();
        waitingList.searchInWaitingList(humsterOwner);
        waitingList.removeFromWaitingList(humsterOwner);
        waitingList.printWaitingList();
        waitingList.searchInWaitingList(humsterOwner);

        }

    }
