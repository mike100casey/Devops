package ie.ittralee.devops.domain;

/**
 *
 * Created by Michael on 02/26/2016.
 */
public class MclarenGarage implements EngineManufacturer {

    @Override
    public Engine buildEngine(EngineType engineType) {
        return new MclarenEngine(engineType);
    }
}
