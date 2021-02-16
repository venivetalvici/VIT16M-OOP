public class SleepIn {
    public static void main(String[] args) {
        /*The parameter weekday is true if it is a weekday,
        and the parameter vacation is true if we are on vacation.
        We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
         */
        System.out.println(sleepIn(false, false));//true
        System.out.println(sleepIn(true, false));// → false
        System.out.println(sleepIn(false, true));// → true
        System.out.println(sleepIn(true, true));// → true
    }
    private static boolean sleepIn(boolean weekday, boolean vacation) {
        if (weekday != true || vacation == true){
            return true;
        }
        return false;
    }
    private static boolean sleepInThree(boolean weekday, boolean vacation) {
        if (weekday == false || vacation == true){
            return true;
        }
        return false;
    }
    private static boolean sleepInTwo(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        }
        return false;
    }
    private static boolean sleepInOne(boolean weekday, boolean vacation) {
        return !weekday || vacation ;
    }
}