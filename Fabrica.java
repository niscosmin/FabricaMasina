import java.util.ArrayList;
import java.util.List;

public class Fabrica {

    private static Fabrica fabrica;
    static int nrMasiniFabrica = 0 ;
    int id = 0;
    List<Masina> masiniMotorElectric = new ArrayList<>();
    List<Masina> masiniMotorTermin = new ArrayList<>();

    public Fabrica(){
    }

    public static Fabrica getFabrica(){
        if( fabrica == null );
            fabrica = new Fabrica();
        return fabrica;
    }

    public void afiseazaMasiniMotorTermin(){
        System.out.println("Masinile cu motor termic sunt:");
        for (int i =0 ; i < masiniMotorTermin.size() ; i++){
            System.out.println(masiniMotorTermin.get(i));
        }
    }

    public void afiseazaMasiniMotorElectric(){
        System.out.println("Masinile cu motor electrice sunt:");
        for ( int i = 0 ; i < masiniMotorElectric.size(); i++){
            System.out.println(masiniMotorElectric.get(i));
        }
    }

    public void afiseazaMasini(){
        afiseazaMasiniMotorTermin();
        afiseazaMasiniMotorElectric();
    }

    public void adaugaMasina(String culoare, String tip, int pret){
        Masina masina = new Masina( id,  culoare,  pret);
        if(tip.equals("electric")){
            masiniMotorElectric.add(masina);
        } else if (tip.equals("termic")){
            masiniMotorTermin.add(masina);
        }
        id++;
        nrMasiniFabrica++;
        System.out.println("Masina a fost adaugata in sistem!");
    }

    public void vindeMasina(int id) throws CarNotFoundException {
        boolean exista  = false;

        int i = 0;
        while(exista == false && i < masiniMotorElectric.size()){
            if (masiniMotorElectric.get(i).getId() == id){
                exista = true;
                masiniMotorElectric.remove(i);
                nrMasiniFabrica --;
                break;
            }else {
                i++;
            }
        }
        i = 0;
        while (exista == false && i< masiniMotorTermin.size()){
            if (masiniMotorTermin.get(i).getId() == id){
                exista = true;
                masiniMotorTermin.remove(i);
                nrMasiniFabrica --;
                break;
            }else {
                i++;
            }
        }
        if (exista == false) {
            throw new CarNotFoundException();
        }
    }
}
