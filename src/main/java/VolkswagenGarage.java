/***
 * Created by Michael on 3/1/2016.
 */
public class VolkswagenGarage implements EngineManufacturer  {

    public VolkswagenGarage() {
    }

    @Override
    public Engine buildEngine(EngineType engineType) {
        return new VW_Engine(engineType);
    }
}
