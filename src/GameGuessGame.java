public class GameGuessGame {
    GamePlayer p1;
    GamePlayer p2;
    GamePlayer p3;

    public void startGame() {
        p1 = new GamePlayer();
        p2 = new GamePlayer();
        p3 = new GamePlayer();

        int attemptsCounter = 1;

        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;

        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        int targetNumber = (int) (Math.random() * 10);

        while (true) {
            System.out.println("Attempt number: " + attemptsCounter);
            System.out.println("Give me " + targetNumber);

            p1.guess();
            p2.guess();
            p3.guess();
            
            guessp1 = p1.number;
            System.out.println("Player 1 gives " + p1.number);
            guessp2 = p2.number;
            System.out.println("Player 2 gives " + p2.number);
            guessp3 = p3.number;
            System.out.println("Player 3 gives " + p3.number);

            if (guessp1 == targetNumber) {
                p1isRight = true;
            }
            if (guessp2 == targetNumber) {
                p2isRight = true;
            }
            if (guessp3 == targetNumber) {
                p3isRight = true;
            }
            if (p1isRight || p2isRight || p3isRight) {
                System.out.println("We have the winner!");
                System.out.println("Player 1 is " + p1isRight);
                System.out.println("Player 2 is " + p2isRight);
                System.out.println("Player 3 is " + p3isRight);
                System.out.println("We are finished! We had to make " + attemptsCounter + " atempts.");
                break;                
            }
            else {
                System.out.println("We need to try again!!!");
                attemptsCounter++;
            }                
                                
        }

    }

}
