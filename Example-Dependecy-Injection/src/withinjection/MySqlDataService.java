package withinjection;

public class MySqlDataService implements DataService {
    private String name;

    public MySqlDataService(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String getDataBaseName() {
        return getName();
    }

}
