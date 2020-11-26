import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Fabrica fabrica = Fabrica.getFabrica();

        Scanner sc = new Scanner(System.in);
        String comanda = sc.nextLine();

        while(comanda.equals("START") == false) {
            System.out.println("Trebuie sa introduci comanda START");
            comanda = sc.nextLine();
        }

        afisareComenzi();
        ThreadPeriodic threadPeriodic = new ThreadPeriodic();
        threadPeriodic.start();

        while (comanda.equals("Exit") == false ){
            comanda = sc.nextLine();
            if(comanda.equals("AFISARE_MASINI")){
                fabrica.afiseazaMasini();
            }else if (comanda.equals("AFISARE_ELECTRICE")){
                fabrica.afiseazaMasiniMotorElectric();
            }else if(comanda.equals("AFISARE_MOTORTERMIC")){
                fabrica.afiseazaMasiniMotorTermin();
            }else if(comanda.equals("ADAUGA_MASINA")){
                String culoare = sc.next();
                String tip = sc.next();
                int pret = Integer.parseInt(sc.next());
                fabrica.adaugaMasina(culoare, tip, pret );
            } else if(comanda.equals("VINDE_MASINA")){
                int idMasina = Integer.parseInt(sc.next());
                try {
                    fabrica.vindeMasina(idMasina);
                    System.out.println("Fabrica a vandut o masina!");
                } catch (CarNotFoundException e) {
                    System.out.println("Masina nu exista!");
                    e.printStackTrace();
                }
            }
        }
    }

    public static void afisareComenzi(){
        System.out.println("Poti introduce urmatoarele comenzi:");
        System.out.println("EXIT");
        System.out.println("ADAUGA_MASINA <culoare> <tip> <pret>");
        System.out.println("<tip> poate fi electric sau termic!");
        System.out.println("AFISARE_MASINI");
        System.out.println("AFISARE_ELECTRICE");
        System.out.println("AFISARE_MOTORTERMIC");
        System.out.println("VINDE_MASINA <id_masina>");
    }
}
