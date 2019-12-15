package lessons.week3.deposit;

class Box {
    private int length;
    private int height;
    private int depth;
    private String color;

    private static int nrBox = 0;

    Box() {
        this.length = 1;
        this.height = 2;
        this.depth = 3;
        this.color = "black";
        nrBox ++;
    }

    Box(int length, int height, int depth) {
        this();
        this.length = length;
        this.height = height;
        this.depth = depth;
    }

    Box(int length, int height, int depth, String color) {
        this(length, height, depth);
        this.color = color;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public static int getNrBox(){
        return nrBox;
    }

    @Override
    public String toString() {
        return "Box{" +
                "length=" + length +
                ", height=" + height +
                ", depth=" + depth +
                ", color='" + color + '\'' +
                '}';
    }

    public void test() {
        System.out.println("da");
    }

    public void test(int a) {
        System.out.println("da " + a);
    }


}
