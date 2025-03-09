public class Methods {
    protected Person person;

    public Methods(Person person) {
        this.person = person;
    }

    // Getters
    public String getName() {
        return person.name;
    }

    public int getAge() {
        return person.age;
    }

    public String getGender() {
        return person.gender;
    }

    public String getCity() {
        return person.city;
    }

    public String getProvince() {
        return person.province;
    }

    public String getCountry() {
        return person.country;
    }

    public float getTotalDeposit() {
        return person.totalUserDepositAmount;
    }

    public int getNumDeposits() {
        return person.numUserDeposits;
    }

    public float getAverageDeposit() {
        return person.totalUserDepositAmount / person.numUserDeposits;
    }

    public void errorMessage() {
        System.out.println("Access denied. You do not have permission to use this feature");
    }

    public void getUserStatus() {
        errorMessage();
    }

    public void getTotalEmployees() {
       errorMessage();
    }


    // Setters
    public void setName(String name) {
        errorMessage();
    }

    public void setAge(int age) {
        errorMessage();
    }

    public void setGender(String gender) {
        errorMessage();
    }

    public void setCity(String city) {
        System.out.println("Access denied. You do not have permission to make these changes");
    }

    public void setProvince(String province) {
        System.out.println("Access denied. You do not have permission to make these changes");
    }

    public void setCountry(String country) {
        System.out.println("Access denied. You do not have permission to make these changes");
    }

    public void displayUserInfo() {
        System.out.println(
            "\nName: " + getName() +
            "\nAge: " + getAge() +
            "\nGender: " + getGender() +
            "\nCity: " + getCity() +
            "\nProvince: " + getProvince() +
            "\nCountry: " + getCountry()
        );
    }

    
}