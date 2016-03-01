/***
 * Created by Michael on 02/26/2016..
 */
public enum EngineType {

    STOCK_ENGINE("standard 1.4l"), BIKE_ENGINE("bike"), RACING_ENGINE("turbo charged");

    private final String title;

    EngineType(String title) {
        this.title = title;
    }

    public String getTitle(){
        return title;
    }


}
