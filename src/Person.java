public abstract class Person {
    private String name;
    private int age;
    private String address;
    private String contactNumber;

    public Person(String name, int age, String address, String contactNumber) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.contactNumber = contactNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws IllegalArgumentException {
        if (age <= 0 || age > 150) {
            throw new IllegalArgumentException("Invalid age. Must be between 1 and 150.");
        }
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) throws IllegalArgumentException {
        if (!validateContact(contactNumber)) {
            throw new IllegalArgumentException("Invalid contact number format.");
        }
        this.contactNumber = contactNumber;
    }

    protected boolean validateContact(String contact) {
        return contact != null && contact.matches("\\d{10,15}");
    }

    public abstract void displayInfo();
}