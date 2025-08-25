class Aviary {
    public void release(Flyer f) {
        f.fly();
        System.out.println("Released");
    }

    public void releaseOnLand(Penguin p) {
        p.waddle();
        System.out.println("Released on land");
    }
}