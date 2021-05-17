
package io.github.guaaxiiniim;

import static java.lang.invoke.MethodHandles.lookup;
import static org.slf4j.LoggerFactory.getLogger;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;

class LifecycleTest {

    static final Logger log = getLogger(lookup().lookupClass());

    @BeforeAll
    static void setupAll() {
        log.debug("@BeforeAll");
    }

    @BeforeEach
    void setup() {
        log.debug("@BeforeEach");
    }

    @Test
    void test1() {
        log.debug("@Test [1]");
    }

    @Test
    void test2() {
        log.debug("@Test [2]");
    }

    @AfterEach
    void teardown() {
        log.debug("@AfterEach");
    }

    @AfterAll
    static void teardownAll() {
        log.debug("@AfterAll");
    }

}
