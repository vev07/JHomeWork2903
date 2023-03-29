package Extra;
//           2)* Показать работу модификаторов доступа
public class Test {
    public static void main(String[] args) {
        Adult father = new Adult("Berlin", "atheist",3,
                35,"man", true);
        Adult mather = new Adult("Berlin", "cristian",3,
                34,"woman", false);
        Child baby = new Child("Berlin", "cristian",3,
                11,"woman", false);

        father.print();
        father.setRegistrationAddress("Kharkiw");
        father.setReligion("Buddhist");
        father.print();
        baby.print();
        father.eat();
        mather.sleep();
        baby.play();
        baby.sleep();
        baby.studyAtSchool();

    }
}
