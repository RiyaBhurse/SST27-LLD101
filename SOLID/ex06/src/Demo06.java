public class Demo06 {
    public static void main(String[] args) {
        Aviary a = new Aviary();
        a.release(new Bird());
        a.releaseOnLand(new Penguin());
    }
}
