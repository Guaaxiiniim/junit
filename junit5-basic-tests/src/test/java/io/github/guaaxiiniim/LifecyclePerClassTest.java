
package io.github.guaaxiiniim;

import static java.lang.invoke.MethodHandles.lookup;
import static org.slf4j.LoggerFactory.getLogger;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.slf4j.Logger;

@TestInstance(Lifecycle.PER_CLASS)
class LifecyclePerClassTest {

    static final Logger log = getLogger(lookup().lookupClass());

    @BeforeAll
    void setupAll() {
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
    void teardownAll() {
        log.debug("@AfterAll");
    }

}
