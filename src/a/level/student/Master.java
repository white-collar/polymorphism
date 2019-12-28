package a.level.student;

public class Master extends Bachelor implements Person {

    private static double IS_GOOD_THRESHOLD = 9.0;

    @Override
    public boolean isGoodStudent() {
        return getRating() > IS_GOOD_THRESHOLD;
    }
}
