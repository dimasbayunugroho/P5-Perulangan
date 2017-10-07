public class ExContinueLabel {

    public static void main(String[] args) {
        outerloop:
        for( int i=0; i<5; i++) {
            for( int j=0; j<5; j++ ) {
                //massage1
                System.out.println("Inside for(j) loop");
                if( j==2 ) continue outerloop;
            }
            //massage
            System.out.println("Inside for(i) loop");
        }
    }
}