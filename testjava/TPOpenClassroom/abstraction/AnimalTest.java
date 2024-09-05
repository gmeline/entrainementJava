public class AnimalTest {
    public static void main(String[] args) {
        Animal chien = new Chien();
        Animal chat = new Chat();

        chien.cri(); // Should print "Woof!"
        chat.cri(); // Should print "Meow!"
    }
}