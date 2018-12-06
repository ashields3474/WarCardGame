public class InterfaceClass {
    Game game;

    public static void main(String[] args) {
        //call the constructor (actually creates an instance of InterfaceClass)
        //but we don’t need a reference to it because we are in the class
        new InterfaceClass();
    }

    InterfaceClass() {
        game = new Game();
        game.setUp();

    }
}
