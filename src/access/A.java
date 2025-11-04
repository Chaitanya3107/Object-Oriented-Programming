package access;

public class A {
    private int num;
    String name;
    int [] arr;
    protected int x;

    public A(int num, String name, int x) {
        this.num = num;
        this.name = name;
        this.x = x;
        this.arr = new int[num];
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
