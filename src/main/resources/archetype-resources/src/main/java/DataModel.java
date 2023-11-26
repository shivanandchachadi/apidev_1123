package restfulservice;

public class DataModel {
    private String name;
    private int id;

    DataModel(int id, String name){
        this.id=id;
        this.name=name;
    }

    public void setname(String n)
    {
        name=n;
    }

    public String getname()
    {
        return name;
    }

    public void setid(int i)
    {
        id=i;
    }
    public int getid() {
        return id;
    }
}


