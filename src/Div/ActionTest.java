package Div;

public class ActionTest
{
    private double initPrice=30;
    public void bid(String birdPrice)
            throws AuctionException
    {
        double d=0.0;
        try
        {
            d=Double.parseDouble(birdPrice);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            throw new AuctionException("竞价必须是数值");
        }
        initPrice=d;
    }
    public static void main(String[] args)
    {
        ActionTest actionTest=new ActionTest();
        try {
            actionTest.bid("aa");
        }
        catch (AuctionException ae)
        {
            System.out.println(ae.getMessage());
        }
    }


}
