public class Admin extends Employee {
    int totalDepositAmount;

    Admin(Person user) {
        super(user);
    }

    @Override
    public void getTotalEmployees() {
        System.out.println(person.totalEmployees);
    }
}