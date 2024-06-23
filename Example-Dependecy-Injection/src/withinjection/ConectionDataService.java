package withinjection;

public class ConectionDataService {
    
    DataService dataService;

    public ConectionDataService(DataService dataService) {
        super();
        this.dataService =  dataService;
    }

    public String getDataBaseName(){
        return dataService.getDataBaseName();
    }

}
