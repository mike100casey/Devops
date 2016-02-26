package ie.ittralee.devops.domain;

/**
 *
 * Created by Michael on 02/26/2016..
 */
public class VolkswagenGarage implements EngineManufacturer {

    @Override
    public Engine buildEngine(EngineType engineType) {
        return new VW_Engine(engineType);
    }
}
