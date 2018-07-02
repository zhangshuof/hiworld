package exception;

/**
 * RuntimeException：运行时异常，不需要被显示捕捉的异常（但也可以被显示的捕捉）
 * CheckedException：非运行时异常即可查异常，必须进行显示的捕捉，或抛出
 *      try catch 或者 throws
 * Error：错误；错误也可以被捕捉
 */

public class TestException {
    public static void main(String args[]){
        String str = null;
        try{
            str.length();
        }catch(NullPointerException e){
            System.out.println("捕捉到NullPointException...");
        }

        StringBuffer sb = new StringBuffer("0123456789");
        try{
            for(int i=0;i<100;i++){
                sb.append(sb.toString());
            }
        }catch(OutOfMemoryError e){
            System.out.println("捕捉到内存用光错误：OutOfMemoryError");
        }
        try {
            throw new AbcException("abc");
        }catch(AbcException e){
            //e.printStackTrace();
            System.out.println("捕捉到abc错误：abc");
        }
    }
}
