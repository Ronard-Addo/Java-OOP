public class Employee extends Methods{
    
    public Employee(Person person) {
        super(person);
    }

    @Override
    public void getUserStatus() {
        System.out.println(person.status);
    }
}