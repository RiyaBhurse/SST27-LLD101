public class Frame implements IFrame {
    private final byte[] data;

    public Frame(byte[] d) {
        if (d == null) throw new IllegalArgumentException("data cannot be null");
        this.data = d.clone();
    }

    @Override
    public int size() {
        return data.length;
    }
}
