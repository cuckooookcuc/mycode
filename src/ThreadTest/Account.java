package ThreadTest;

public class Account {
    private String accountNo;
    private double balance;

    public Account() {
    }

    public Account(String accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public int hashCode() {
        return accountNo.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == Account.class) {
            Account target = (Account) obj;
            return target.getAccountNo().equals(this.getAccountNo());
        }
        return false;
    }

    public synchronized void draw(double drawAmount) {

        if (getBalance() >= drawAmount) {
            System.out.println("取钱成功" + "==" + drawAmount);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            balance -= drawAmount;
            System.out.println("余额为：" + getBalance());
        } else {
            System.out.println("余额不足");
        }

    }
}
