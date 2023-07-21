package unils;

import org.assertj.core.api.SoftAssertions;

public class SoftAssertUtil {

    private static SoftAssertions softAssertions = new SoftAssertions();

    public static void assertNotEquals(Object actual, Object expected, String description) {
        softAssertions.assertThat(actual).as(description).isNotEqualTo(expected);
    }

    public static void asserAll() {
        softAssertions.assertAll();
    }

}
