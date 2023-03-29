package Extra;

public class Child extends Family{
    public Child(String registrationAddress, String religion, int familyComposition, int age, String sex, boolean abilityToWork) {
        super(registrationAddress, religion, familyComposition, age, sex, abilityToWork);
    }
    public void play() {
        System.out.println("Child is playing");
    }
    public void studyAtSchool() {
        System.out.println("Child is study at school now");
    }

    @Override
    public void sleep() {
        System.out.println("Baby isn't sleeping");
    }
}
