public class GamePlayer {
    int number = 0;
    public void guess() {
        number = (int) (Math.random() * 10);
        System.out.println("number " + number);
    }
}
