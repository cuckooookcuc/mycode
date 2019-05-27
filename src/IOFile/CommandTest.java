package IOFile;

public class CommandTest
{
    public static void main(String[] args)
    {

        ProcessArry pa=new ProcessArry();
        int[] commandArray=new int[]{1,2,3};
        pa.processArry(commandArray,new AddComamand());
        System.out.println("********");
        pa.processArry(commandArray,new PrintCommand());
//        pa.processArry(commandArray, new Command() {
////            @Override
////            public void Process(int[] target) {
////                for (int tg :
////                        target) {
////                    System.out.println(tg+1);
////                }
////            }
////        });
        pa.processArry(commandArray,(int[] targer)->{
            for (int gt :
                    targer)
            {
                  System.out.println(gt*gt);
            }
        });
//        new PrintCommand().Process(commandArray);

    }


}
