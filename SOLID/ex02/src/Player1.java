public class Player1 implements IPlayer {
    private IFrame frame;

    public Player1(IFrame frame) {
        this.frame = frame;
    }

    @Override
    public void play() {
        System.out.println("\u25B6 Playing " + frame.size() + " bytes");
        System.out.println("Cached last frame? " + (frame != null));
    }
}
