package TestOrm;

public class TestInteger {

    public static void main(String[] args) {
        MyInt id = new MyInt();
        System.out.println(id.getId());
        mysum(id);
        System.out.println(id.getId());
    }

    public static void mysum(MyInt id) {
        id.add(1);
    }

}

class MyInt {
    public int id;

    public int getId() {
        return id;
    }

    public MyInt() {
        id = 1;
    }

    public void add(int i) {
        id += i;
    }
}
