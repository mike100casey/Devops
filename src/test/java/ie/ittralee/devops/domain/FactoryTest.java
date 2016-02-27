package ie.ittralee.devops.domain;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

/**
 *
 * Created by Michael on 02/26/2016.
 */
public class FactoryTest {

    /**
     * Testing {@link VolkswagenGarage} to produce a Stock-Engine asserting that the Engine is an instance
     * of {@link EngineType}.
     */
    @Test
    public void vwGarageWithStockEngine() {
        EngineManufacturer manufacturer = new VolkswagenGarage();
        Engine engine = manufacturer.buildEngine(EngineType.STOCK_ENGINE);
        assertEquals(EngineType.STOCK_ENGINE, engine.getEngineType());
    }

    /**
     * Testing {@link VolkswagenGarage} to produce a Racing-Engine asserting that the Engine is an instance
     * of {@link EngineType}.
     */
    @Test
    public void vwGarageWithRacingEngine() {
        EngineManufacturer manufacturer = new VolkswagenGarage();
        Engine engine = manufacturer.buildEngine(EngineType.RACING_ENGINE);
        assertEquals(EngineType.RACING_ENGINE, engine.getEngineType());
    }

    /**
     * Testing {@link MclarenGarage} to produce a Racing-Engine asserting that the Engine is an instance
     * of {@link EngineType}.
     */
    @Test
    public void mclarenGarageWithRacingEngine() {
        EngineManufacturer manufacturer = new MclarenGarage();
        Engine engine = manufacturer.buildEngine(EngineType.RACING_ENGINE);
        assertEquals(EngineType.RACING_ENGINE, engine.getEngineType());
    }

    /**
     * Testing {@link MclarenGarage} to produce a Stock-Engine asserting that the Engine is an instance
     * of {@link EngineType}.
     */
    @Test
    public void mclarenWithStockEngine() {
        EngineManufacturer manufacturer = new MclarenGarage();
        Engine engine = manufacturer.buildEngine(EngineType.STOCK_ENGINE);
        assertEquals(EngineType.STOCK_ENGINE, engine.getEngineType());
    }

    /**
     * Testing {@link MclarenGarage} to produce a Bike-Engine asserting that the Engine is an instance
     * of {@link EngineType}.
     */
    @Test
    public void mclarenWithBikeEngine() {
        EngineManufacturer manufacturer = new MclarenGarage();
        Engine engine = manufacturer.buildEngine(EngineType.BIKE_ENGINE);
        assertEquals(EngineType.BIKE_ENGINE, engine.getEngineType());
    }

    /**
     * Testing {@link EngineType} an Engine type has a correct title
     *
     */
    @Test
    public void enumTitle() {
        assertThat(EngineType.RACING_ENGINE.getTitle(),is("turbo charged"));
        assertThat(EngineType.STOCK_ENGINE.getTitle(),is("standard 1.4l"));
    }

}