public enum RoomType {

    SINGLE(1),
    DOUBLE(2),
    FAMILY(4);

    private final int capacity;

    RoomType(int capacity) {
        this.capacity = capacity;
    }
}
