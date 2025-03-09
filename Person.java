public class Person {
    public String name;
    public int age;
    public String gender;
    public String city;
    public String province;
    public String country;
    public String status = "good";
    public float totalUserDepositAmount = 10000;
    public int numUserDeposits = 20;
    public int totalEmployees = 100;

    public Person(String name, int age, String gender, String city, String province, String country) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.city = city;
        this.province = province;
        this.country = country;
    }
}