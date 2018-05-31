public class PhraseOMatic {
  public static void main(String[] args) {
    //setting up three sets of words
    String[] wordListOne = {"24/7","multi-tier","30,000 foot","B-to-B","win-win","front-end","web-based","pervasive","smart","six-sigma","critical-path","dynamic"};
    String[] wordListTwo = {"empowered","sticky","value-added","oriented","centric","distributed","clustered","branded","outside-the-box","positioned","networked","focused","leveraged","aligned","targeted","shared","cooperative","accelerated"};
    String[] wordListThree = {"process","tipping-point","solution","architecture","core competency","strategy","mindshare","portal","space","vision","paradigm","mission"};
    //counting words in each set
    int oneLength = wordListOne.length;
    int twoLength = wordListTwo.length;
    int threeLength = wordListThree.length;
    //generating random numbers
    int randomNumber1 = (int) (Math.random() * oneLength);
    int randomNumber2 = (int) (Math.random() * twoLength);
    int randomNumber3 = (int) (Math.random() * threeLength);
    //building phrase
    String phrase = wordListOne[randomNumber1] + " " + wordListTwo[randomNumber2] + " " + wordListThree[randomNumber3];
    //printing phrase
    System.out.println("What we need is a " + phrase);
  }
}
