public class GuessGame {
  //instance variables, three "p"'s for three players
  Player p1;
  Player p2;
  Player p3;

  public void startGame() {
    //creating Player objects and assigning them to variables
    p1 = new Player();
    p2 = new Player();
    p3 = new Player();

    //initializing variables for players' guesses
    int guessp1 = 0;
    int guessp2 = 0;
    int guessp3 = 0;

    //initializing boolean variables to hold true/false based on players' answers
    boolean p1isright = false;
    boolean p2isright = false;
    boolean p3isright = false;

    //making "target" number for players to guess
    int targetNumber = (int) (Math.random() * 10);
    System.out.println("I'm thinking of a number between 0 and 9...");

    //initiating guess loop
    while (true) {
      System.out.println("Number to guess is " + targetNumber);

      //calling each player's guess() methods;
      p1.guess();
      p2.guess();
      p3.guess();

      //put players' guesses into variables for checking;
      guessp1 = p1.number;
      System.out.println("Player one guessed " + guessp1);
      guessp2 = p2.number;
      System.out.println("Player two guessed " + guessp2);
      guessp3 = p3.number;
      System.out.println("Player three guessed " + guessp3);

      //checking variables to see if anyone guessed right; if this happens, set the corresponding player's variable to be true
      if (guessp1 == targetNumber) {
        p1isright = true;
      }
      if (guessp2 == targetNumber) {
        p2isright = true;
      }
      if (guessp3 == targetNumber) {
        p3isright = true;
      }

      //finishing statement, if nobody is right - staying in the loop
      if (p1isright || p2isright || p3isright) {
        System.out.println("We have a winner!");
        System.out.println("Player one got it right? " + p1isright);
        System.out.println("Player two got it right? " + p2isright);
        System.out.println("Player three got it right? " + p3isright);
        System.out.println("Game is over.");
        break;
      } else {
        System.out.println("Players will have to try again.");
      }
    }
  }
}
