package utils;

public class Utlis {

	public static Integer convertTime(String time) {

		String newTime = time.replaceAll("\\s+", "");

		int minute = Integer.parseInt(newTime.substring(0, newTime.indexOf("m")));
		int second = Integer.parseInt(newTime.substring(newTime.indexOf("m") + 1, newTime.indexOf("s")));
		int millisecond = Integer.parseInt(newTime.substring(newTime.indexOf("s") + 1, newTime.length() - 2));

		System.out.println(minute + " " + second + " " + millisecond);

		return minute * 60000 + second * 1000 + millisecond;
	}
}
