public class Break4 {
    public static void main(String[] args){
        int i;

        for(i = 1; i < 4; i++){
            one:  {
            two:  {
            three:{
                    System.out.println("\n i is " + i);
                    if(i == 1)
                        break one;
                    if(i == 2)
                        break two;
                    if(i ==3)
                        break three;
            }    
            System.out.println("after block three.");
            }    
            System.out.println("after block two.");
            }
            System.out.println("after block one.");
        }
        System.out.println("after for.");
    }
}
