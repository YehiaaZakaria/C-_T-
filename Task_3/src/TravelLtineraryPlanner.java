import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;

public class TravelLtineraryPlanner {

    private String getMap(String destination) {
        try {

            String encodedDestination = URLEncoder.encode(destination, "UTF-8");

            String mapUrl = "https://www.google.com/maps?q=" + encodedDestination;
            return mapUrl;

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return null;
    }

    private void getWeatherInforamtion(String destination , String date) {
        System.out.println("Weather information for " + destination + " on " + date +": 12°C, Rainy, Partly Cloudy");
    }

    private float getRemainiingBudget(float budget , int numOfDesitinations) {
        return budget- (numOfDesitinations * 1200);
    }

    public void Planner(Map<String,String> Trip , float budget) {
        System.out.println("Your Travel Plan:");
        System.out.println();
        for (Map.Entry<String, String> entry : Trip.entrySet()) {
            String destination = entry.getKey();
            String date = entry.getValue();
            System.out.println("Destination: " + destination);
            System.out.println("Map: " + getMap(destination));
            getWeatherInforamtion(destination, date);
            System.out.println("...............................");
        }
        System.out.println();
        System.out.println("Initial Budget: " + budget);
        System.out.println("Remaining budget: $" + getRemainiingBudget(budget, Trip.size()));
    }

}
