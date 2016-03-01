/**
 *
 * Created by Michael on 02/26/2016..
 */
public class VW_Engine implements Engine {

    private EngineType engineType;

    public VW_Engine(EngineType engineType) {
        this.engineType = engineType;
    }

    @Override
    public EngineType getEngineType() {
        return engineType;
    }

    @Override
    public String toString(){
        return "VW " + engineType + " Engine requested";
    }
}
