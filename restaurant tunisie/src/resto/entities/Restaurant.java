package resto.entities;

public class Restaurant  {
    private int id_resto_pk;
    private String nom;
    private String adresse;
    private String theme;
    private String specialite;
    private int tel;
    private int budget;
    private String alcool;
    private int id_menu_fk;

    public int getId_resto_pk() {
        return id_resto_pk;
    }

    public void setId_resto_pk(int id_resto_pk) {
        this.id_resto_pk = id_resto_pk;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public String getAlcool() {
        return alcool;
    }

    public void setAlcool(String alcool) {
        this.alcool = alcool;
    }

    public int getId_menu_fk() {
        return id_menu_fk;
    }

    public void setId_menu_fk(int id_menu_fk) {
        this.id_menu_fk = id_menu_fk;
    }
    public Restaurant(){
        
    }
    public Restaurant(String nom,String adresse, String theme, String specialite, int tel, int budget, String alcool,int id_menu_fk)
    {
    this.nom=nom;
    this.adresse=adresse;
    this.theme=theme;
    this.specialite=specialite;
    this.tel= tel;
    this.budget=budget;
    this.alcool=alcool;
    this.id_menu_fk=id_menu_fk;
    }
    @Override
    public String toString(){
        return this.nom+" "+this.adresse+" "+this.theme+" "+this.specialite+" "+this.tel+" "+this.budget+" "+this.alcool+" "+this.id_menu_fk;
        
    }
}
