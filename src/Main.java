public class Main {

    public static void main(String[] args) {

        /* cw.4  */

        /* zad.1 napisać 3 pętle for i użyc:
        a) w pierwszej pętli break
        b) w drugiej pętli continue
        c) w trzeciej pętli return
        */

        for(int x = 0; x < 10; x++){
            if(x == 3){
                break;
            }
            else{
                System.out.println(x);
            }
        }
        for(int i = 0; i < 10; i++){
            if(i % 3 == 2){
                continue;
            }
            else{
                System.out.println(i);
            }
        }
        for(int i = 0; i < 10; i++){
            if(i == 9){
                return;
            }
            else{
                System.out.println(i);
            }
        }

    }
}
