public class Demo02 {
    public static void main(String[] args) {
        IFrame frame = new Frame(new byte[]{1,2,3,4});
        IPlayer player = new Player1(frame);
        player.play();
    }
}
