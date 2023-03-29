package Extra;

public class Family {

    public void setRegistrationAddress(String registrationAddress) {
        this.registrationAddress = registrationAddress;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public void setFamilyComposition(int familyComposition) {
        this.familyComposition = familyComposition;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAbilityToWork(boolean abilityToWork) {
        this.abilityToWork = abilityToWork;
    }

    private String registrationAddress;
    private String religion;
    private int familyComposition;
    private int age;
    private String sex;
    private boolean abilityToWork;

    public Family(String registrationAddress, String religion, int familyComposition, int age,
                  String sex, boolean abilityToWork) {
        this.registrationAddress = registrationAddress;
        this.religion = religion;
        this.familyComposition = familyComposition;
        this.age = age;
        this.sex = sex;
        this.abilityToWork = abilityToWork;
    }
    public void print() {
        System.out.println("Registration address - " + registrationAddress + "; religion - " + religion +
                "; family composition - " + familyComposition + "; age - " + age + "; sex - " + sex +
                "; ability to work - " + abilityToWork +".");
    }
    public void sleep() {
        System.out.println("Person is sleeping");
    }
    public void eat() {
        System.out.println("Person is eating");
    }
}
