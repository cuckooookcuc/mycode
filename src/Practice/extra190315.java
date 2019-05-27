package Practice;

class person {
    private String name;

    public person(String name) {
        this.name = name;
    }

    public void say() {
        System.out.println("说话");
    }
}

class work extends person {
    private String company;

    public work(String name, String company) {
        super(name);
        this.company = company;
    }

    public void say() {
        System.out.println("工人说话");

    }

    public void startWork() {
        System.out.println("开始工作");
    }
}

public class extra190315 {
    public static void main(String[] args)
    {
        person pe=new work("ss","ssd");
        pe.say();
        ((work) pe).startWork();
        //pe.startWork();

    }
}
