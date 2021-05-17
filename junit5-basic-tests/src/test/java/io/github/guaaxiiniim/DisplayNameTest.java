
package io.github.guaaxiiniim;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("A special test case")
class DisplayNameTest {

    @Test
    @DisplayName("Custom test name containing spaces")
    void testWithDisplayNameContainingSpaces() {
        // TODO
    }

    @Test
    @DisplayName("╯°□°）╯")
    void testWithDisplayNameContainingSpecialCharacters() {
        // TODO
    }

    @Test
    @DisplayName("😱")
    void testWithDisplayNameContainingEmoji() {
        // TODO
    }

}
