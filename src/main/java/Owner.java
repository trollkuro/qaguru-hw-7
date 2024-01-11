public class Owner {
    private String fullName;
    private int ownerPassport;

    public Owner(String fullName, int ownerPassport) {
        this.fullName = fullName;
        this.ownerPassport = ownerPassport;
    }
    public String getFullName() {
        return fullName;
    }

    @Override
    public String toString() {
        return fullName;
    }

}
