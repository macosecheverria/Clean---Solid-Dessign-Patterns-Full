package withinjection;

public class MongoDataService implements DataService{
    private String name;

    public MongoDataService(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    @Override
    public String getDataBaseName() {
        
        return getName();
    }
    
}
