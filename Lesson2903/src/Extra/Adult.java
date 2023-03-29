package Extra;

public class Adult extends Family {


    public Adult(String registrationAddress, String religion, int familyComposition, int age, String sex, boolean abilityToWork) {
        super(registrationAddress, religion, familyComposition, age, sex, abilityToWork);
    }

    public void work() {
        System.out.println("Person is working now");
    }
}
