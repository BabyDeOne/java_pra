public class Guess2 {
    public static void main(String[] args)
        throws java.io.IOException{
            char ch, answer = 'k';

            System.out.println("type in a letter between a and z");
            ch = (char) System.in.read();

            if (ch == answer){
                System.out.println("Right!!!");
            }else{
                System.out.println("Wrong!!!");
            }
        }
}
