public class Alumne {
    private String nom;
    private String cicle;
    private int curs;



    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCicle() {
        return cicle;
    }

    public void setCicle(String cicle) {
        this.cicle = cicle;
    }

    public int getCurs() {
        return curs;
    }

    public void setCurs(int curs) {
        this.curs = curs;
    }

    @Override
    public String toString() {
        return nom + "," + cicle + "," + curs;
    }
}
