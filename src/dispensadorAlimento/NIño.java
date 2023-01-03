package dispensadorAlimento;

public class NIño extends Usuario{
    private int cantDulces;

    public NIño(String nom, String cant, int ed, int cantDulces) {
        super(nom, cant, ed);
        this.setCantDulces(cantDulces);
    }

    public int getCantDulces() {
        return cantDulces;
    }

    public void setCantDulces(int cantDulces) {
        this.cantDulces = cantDulces;
    }
}
