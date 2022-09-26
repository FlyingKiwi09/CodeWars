import java.text.DecimalFormat;

public class SecondsToReadableTime {

	public static void main(String[] args) {
		System.out.print(makeReadable(05));
	}
	
	
  public static String makeReadable(int seconds) {
    // Do something
	int returnSeconds = seconds%60;
    int totalMinutes = seconds /60;
    int returnMinutes = totalMinutes%60;
    int returnHours = totalMinutes/60;
    
    String readable = (String.format("%0" + 2 + "d", returnHours) + ":" + String.format("%0" + 2 + "d", returnMinutes) + ":" + String.format("%0" + 2 + "d", returnSeconds));

    return readable;
  }
	

}
