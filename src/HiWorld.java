public class HiWorld {
    public static void main(String args[]){
        System.out.println("Hi World !!!!");
        System.out.println(aaa());
    }

    public static int aaa(){
        try{
            return 1;
        }catch(Exception e){
            return 2;
        }finally {
            return 3;
        }
    }
}
