public class Pet {

    private String species;
    private String name;
    private int age;
    private Owner owner;

    public Pet(String species, String name, int age, Owner owner) {
        this.species = species;
        this.name = name;
        this.age = age;
        this.owner = owner;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
