// // throwing our own exception...

// class MyException extends Exception
// {
//     MyException(String message){
//         super(message);
//     }
// }
// public class p6 {
//     public static void main(String[] args) {
//         int x = 8, y = 1000;
//         try{
//             float z = (float)x/(float)y;
//             if(z>0.01){
//                 throw new MyException("Number is To Small...");
//             }
//         }
//         catch(MyException e){
//             System.out.println(e);
//             System.out.println("Caught My Exception...");
//         }
//         finally{
//             System.out.println("I am Always Here....");
//         }
//     }
// }


//Throwing our own exception

class MyException extends Exception
{
    MyException(String message){
        super(message);
    }
}

public class p6{
    public static void main(String[] args) {
        int x = 8; 
        int y = 8000;

        try{
            float ans = (float)x/(float)y;
            if(ans < 0.01){
                throw new MyException("Exception: This is an Exception");
            }
        }catch(MyException e){
            System.out.println(e);
            System.out.println("You are Handle this Exception SuccesFully...");
        }
        finally{
            System.out.println("The Program End Here...");
        }
    }
}