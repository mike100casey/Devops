package main.java.ie.ittralee.devops.domain;

/**
 *
 * Created by Michael on 02/26/2016..
 */
public class Tester {

    public static void main(String[] args) {
        
        EngineManufacturer engineManufacturer;
        Engine engine;

        engineManufacturer = new VolkswagenGarage();
        engine = engineManufacturer.buildEngine(EngineType.STOCK_ENGINE);
        System.out.println(engine);

        engine = engineManufacturer.buildEngine(EngineType.RACING_ENGINE);
        System.out.println(engine);

        engineManufacturer = new MclarenGarage();
        engine = engineManufacturer.buildEngine(EngineType.RACING_ENGINE);
        System.out.println(engine);

        engine = engineManufacturer.buildEngine(EngineType.BIKE_ENGINE);
        System.out.println(engine);

    }
}
