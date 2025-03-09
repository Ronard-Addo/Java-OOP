public class User extends Methods {
    
    public User(Person person) {
        super(person);
    }

    // Setters
    @Override
    public void setName(String name) {
        person.name = name;
    }

    @Override
    public void setAge(int age) {
        person.age = age;
    }

    @Override
    public void setGender(String gender) {
        person.gender = gender;
    }

    @Override
    public void setCity(String city) {
        person.city = city;
    }

    @Override
    public void setProvince(String province) {
        person.province = province;
    }

    @Override
    public void setCountry(String country) {
        person.country = country;
    }
}