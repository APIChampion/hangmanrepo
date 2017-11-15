public class Hangman {

  public static void main(String[] args) {
    //my awesome code will eventually go here
    Game game = new Game("treehouse");
    Prompter prompter = new Prompter(game);
    while (game.getRemainingTries() > 0 && !game.isWon()){
      prompter.displayProgress();
      prompter.promptForGuess();
    }
    prompter.displayOutcome();
  }
}
