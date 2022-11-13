
public class MonThi implements Comparable<MonThi>{
    private String id, name, type;
    public MonThi(String id, String name, String type)
    {
        this.id = id;
        this.name = name;
        this.type = type;
    }
    
    @Override
    public int compareTo(MonThi o)
    {
        return this.id.compareTo(o.id);
    }
    @Override
    public String toString(){
        return id + " " + name + " " + type;
    }
}
