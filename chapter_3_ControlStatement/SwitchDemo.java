public class SwitchDemo {
    public static void main(String[] args){
        int i ;

        for (i = 0; i < 10; i++){
            switch(i){
                case 0:
                    System.out.println("zero");
                    break;
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                default:
                    System.out.println("more than two");
            }
        }
    }
}
