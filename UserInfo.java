public class UserInfo {
    private String nume,varsta,inaltime,greutate;
    public altele altele;
    public UserInfo (String nume, String varsta,String inaltime,String greutate,altele xx) {
        this.nume = nume;
        this.varsta = varsta;
        this.inaltime = inaltime;
        this.greutate = greutate;
        this.altele=xx;
    }

    public String getNume() {
        return this.nume;
    }


    public String getVarsta() {
        return this.varsta;
    }

    public String getInaltime() {
        return this.inaltime;
    }

    public String getGreutate() {
        return this.greutate;
    }
}