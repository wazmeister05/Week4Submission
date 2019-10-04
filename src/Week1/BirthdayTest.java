package Week1;

public class BirthdayTest {

    public static void main(String[] args){

        Birthday bday = new Birthday();

        bday.run(1);
        bday.run(2);
        bday.run(3);
        bday.run(22);
        bday.run(23);
        bday.run(50);
        bday.run(100);
        bday.run(10000);
        bday.run(0);
    }

}
