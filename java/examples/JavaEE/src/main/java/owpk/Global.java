package owpk;

public class Global {
    public static final String LOG_PATTERN = "[OWPK] :: %";

    public static void printLog(String msg) {
        System.out.printf(LOG_PATTERN, msg);
    }
}
