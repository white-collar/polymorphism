package a.level.student;

public class Printer {
    public void printHowPersonIsGood(Person person) {
        System.out.println(">>>>>> " + person.getClass() + " " + person.isGoodStudent());
    }
}
