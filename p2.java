public class p2 {
    public static void main(String[] args) {
        int invalid = 0; // number of invalid arrgumnet

        int number, count = 0; 
        for(int i = 0; i < args.length; i++){
            try{
                number = Integer.parseInt(args[i]);
            }
            catch(NumberFormatException e){
                invalid = invalid + 1;
                System.out.println("Invalid Number: "+args[i]);
                continue;
            }
            count = count + 1;
        }
        System.out.println("Valid Number: "+count);
        System.out.println("Invalid Number: "+invalid);

    }
}
