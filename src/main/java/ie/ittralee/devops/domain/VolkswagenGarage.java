package main.java.ie.ittralee.devops.domain;

/**
 *
 * Created by Michael on 02/26/2016..
 */
public class VolkswagenGarage implements EngineManufacturer {

    public VolkswagenGarage() {
    }

    @Override
    public Engine buildEngine(EngineType engineType) {
        return new VW_Engine(engineType);
    }
}
