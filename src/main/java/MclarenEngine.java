/**
 *
 * Created by Michael on 02/26/2016..
 */
public class MclarenEngine implements Engine {

    private EngineType engineType;

    public MclarenEngine(EngineType engineType) {
        this.engineType = engineType;
    }

    @Override
    public EngineType getEngineType() {
        return engineType;
    }

    @Override
    public String toString(){
        switch (engineType){
            case BIKE_ENGINE:
                return "McLaren do not make bike engines";
            case STOCK_ENGINE:
                return "McLaren do not make small engines";
            case RACING_ENGINE:
                return "McLaren " + engineType + " Engine requested";
        }
        return "";
    }
}
