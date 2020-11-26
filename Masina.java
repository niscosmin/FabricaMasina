public class Masina{

    private int id;
    private String culoare;
    private int pret;

    public Masina(){
    }

    public Masina(int id, String culoare, int pret) {
        this.id = id;
        this.culoare = culoare;
        this.pret = pret;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public int getPret() {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    @Override
    public String toString() {
        return "Masina{" +
                "id=" + id +
                ", culoare='" + culoare + '\'' +
                ", pret=" + pret +
                '}';
    }
}
