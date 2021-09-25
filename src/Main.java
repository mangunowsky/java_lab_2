public class Main {

    public static void main(String[] args) {

        /* cw.1 pętle while */

        /* zad 1 - Napisać za pomocą pętli do-while kod który będzie iterował od liczby 1000 w dół do 0.
          Jeśli liczba będzie podzielna przez 2 ostatnie cyfry waszego indexu (podać nr indexu)
          to dać komunikat "liczba XX podzielna przez YY" (XX-liczba podzielna YY-podzielnik)
        */

        /* Mój numer indexu 56571 */

        int i = 1000;
        int d = 71;

        do{
            if(i % d == 0){
                System.out.printf("Liczba %d podzielna przez %d. \n", i, d);
                i--;
            }
            else {
//                System.out.println(i);
                i--;
            }
        }
        while (i >0);

        /* zad 2
        a) stworzyć tablicę typu int wielkosci 5, przypisac jej dowolne wartości,
          przeiterować tablicę po elementach i wyswietlić, użyć pętli while
        b) jak wyżej tylko dla tablicy typu double[],
        c) jak wyżej dla tablicy String[], przeiterować i wyświetlić od ostatniego elementu
        */

        int y = 0;
        int[] tabInt = {43, 123, 53, 454, 98};
        double[] tabDouble = {123d, 7894127d, 87328d, 78617d, 1d};
        String[] tabString = {"Wyższa", "Szkoła", "Bankowa", "w", "Gdańsku"};

        while (y < tabInt.length){
            System.out.println(tabInt[y]);
            y++;
        }

        y = 0;
        while (y < tabDouble.length){
            System.out.println(tabDouble[y]);
            y++;
        }

        y = 0;
        while (y < tabString.length){
            System.out.println(tabString[y]);
            y++;
        }

        /* zad.3
        a) sprawdzić jak zachowuje się pętla while gdy w jej warunku damy true --> while(true)
        b) a jak gdy damy false --> while(false)
        */
        while(true){    //pętla będzie działać w nieskończoność
            System.out.println("WHILE TRUE");
        }
        while(false){     //pętla nie wykona się ani razi, program się nie skompiluje
            System.out.println("WHILE FALSE");
        }
    }
}
