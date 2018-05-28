public class BeerSong {
  public static void main(String[] args) {
    int beerNum = 99;
    String word = "bottles";
    while (beerNum > 0) {
      System.out.println(beerNum + " " + word + " of beer on the wall");
      System.out.println(beerNum + " " + word + " of beer.");
      System.out.println("Take one down.");
      System.out.println("Pass it around.");
      beerNum = beerNum - 1;
      if (beerNum == 1) {
        word = "bottle"; //singular, ONE bottle
      }//changed placement of this "if" statement to eliminate "bottles" in the last cycle (should be "bottle").
      if (beerNum > 0) {
        System.out.println(beerNum + " " + word + " of beer on the wall\n"); //added \n here to split the verses.
      } else {
        System.out.println("No more bottles of beer on the wall");
      } //end else
    } //end while loop
  } //end main method
} //end class
