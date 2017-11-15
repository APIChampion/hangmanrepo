import java.util.Scanner;

class Prompter {
  private Game game;

  public Prompter(Game game){
    this.game = game;
  }

  public boolean promptForGuess(){
    boolean isHit = false;
    Scanner scanner = new Scanner(System.in);
    boolean isAcceptable = false;
    do{
        System.out.print("Enter a letter: ");
        String guessInput = scanner.nextLine();

        try{
          isHit = game.applyGuess(guessInput);
          isAcceptable = true;
        }catch(IllegalArgumentException iae){
          System.out.printf("%s. Please try again. %n", iae.getMessage());
        }
  } while(! isAcceptable);
    return isHit;


  }
  public void displayProgress(){
    System.out.printf("you have %d left to solve: %s %n", game.getRemainingTries(),game.getCurrentProgress());
  }

  public void displayOutcome(){
    if (game.isWon()){
      System.out.printf("Congratulations you won   %n");
    } else {
      System.out.printf("Bummer you lost. the word was %s. :( %n ",game.getAnswer());
    }
  }
    }
