import java.util.ArrayList;

public class persoane {
    ArrayList<UserInfo> pers=new ArrayList<>();

    public persoane(ArrayList<UserInfo> pers){
        this.pers= pers;
    }

    public persoane(UserInfo l){
        pers.add(l);
    }

    public void addpersoane(UserInfo l){
        pers.add(l);
    }

    public ArrayList<UserInfo> getpersoana(){
        return pers;
    }
}
