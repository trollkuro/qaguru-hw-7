import java.util.LinkedList;

public class LinkedListCollection {
    private LinkedList<Owner> ownersList = new LinkedList<>();

    protected void addOwnerToWaitingList(Owner owner){
        ownersList.add(owner);
        System.out.println("[ADD] " + owner + " is added to Waiting List");
    }

    protected void printWaitingList(){
        System.out.println("[PRINT] Owners in the Waiting List: " + "\n" + ownersList);
    }

    protected void removeFromWaitingList(Owner owner){
        ownersList.remove(owner);
        System.out.println("[REMOVE] " + owner + " is removed from the Waiting List");
    }

    protected void searchInWaitingList(Owner owner){
        if (ownersList.contains(owner)){
            System.out.println("[SEARCH] " + owner + " is found in the Waiting List");
        } else {
            System.out.println("[SEARCH] Could not find data = " + owner + ", recheck your request");
        }
    }
}
