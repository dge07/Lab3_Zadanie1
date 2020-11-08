import java.util.concurrent.Semaphore ;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Wybierz sposób przedstawienia rozwiązania: \n\n" + "1) Żaden widelec nie jest nigdy trzymany jednocześnie\n" +
                "przez dwóch filozofów.\n\n"  + "2) Czterech spośród pięciu filozofów, najpierw sięga po widelec z lewej strony, a potem\n" +
                "te z prawej, natomiast jeden filozof czynność te wykonuje odwrotnie. \n\n" + "3) O tym, który widelec podniesie jako pierwsza, zdecyduje rzutem monety,\n" +
                " Podniesie wylosowany widelec (jeśli nie jest wolny to zaczeka na niego),\n" +
                " Następnie sprawdzi czy drugi widelec jest wolny.\n" +
                "- jeśli tak, to może jeść,\n" +
                "- jeśli natomiast drugi widelec nie jest wolny to odkłada widelec, który już trzyma\n" +
                "i podejmuje kolejna próbę jedzenia, ponownie rzucając monetą. ");
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        System.out.println("A teraz wybierz liczbę filozofów przy stole ( od 2 do 100): ");




                if(liczba == 1) {
                    while (Filozof.MAX < 2 || Filozof.MAX > 100)
                    {
                        System.out.println("Podales liczbe spoza przedziału");
                        return;
                    }
                    for (int i = 0; i < Filozof.MAX; i++) {
                        Filozof.widelec[i] = new Semaphore(1);
                    }
                    for (int i = 0; i < Filozof.MAX; i++) {
                        new Filozof(i).start();
                    }
                }
                if(liczba == 2) {
                    while (Filozof2.MAX < 2 || Filozof2.MAX > 100)
                    {
                        System.out.println("Podales liczbe spoza przedziału");
                        return;
                    }
                    for (int i = 0; i < Filozof2.MAX; i++) {
                        Filozof2.widelec[i] = new Semaphore(1);
                    }
                    for (int i = 0; i < Filozof2.MAX; i++) {
                        new Filozof2(i).start();
                    }
                }

                if(liczba == 3) {
                    while (Filozof3.MAX < 2 || Filozof3.MAX > 100)
                    {
                        System.out.println("Podales liczbe spoza przedziału");
                        return;

                    }
                    for (int i = 0; i < Filozof3.MAX; i++) {
                        Filozof3.widelec[i] = new Semaphore(1);
                    }
                    for (int i = 0; i < Filozof3.MAX; i++) {
                        new Filozof3(i).start();
                    }
                }


        }


    }



