public class ThreadPeriodic extends java.lang.Thread {

    @Override
    public void run (){

        while (true){
            System.out.println("Masini curente in fabrica : " + Fabrica.nrMasiniFabrica);
        try{
            Thread.sleep(20000);
        }catch (Exception e) {
            e.printStackTrace();
            }
         }
    }
}
