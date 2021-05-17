
package io.github.guaaxiiniim;

import io.github.guaaxiiniim.MySUT;
import static java.lang.invoke.MethodHandles.lookup;
import static org.slf4j.LoggerFactory.getLogger;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.slf4j.Logger;

@TestInstance(Lifecycle.PER_CLASS)
class BasicPerClassTest {

    static final Logger log = getLogger(lookup().lookupClass());

    MySUT mySut;

    @BeforeAll
    void setupAll() {
        mySut = new MySUT("[Complete lifecycle Test]");
    }

    @BeforeEach
    void setup() {
        mySut.initId();
    }

    @Test
    void sumTest() {
        log.debug("Testing sum method in {} SUT", mySut.getName());

        // exercise
        int sum = mySut.sum(1, 2, 3);

        // verify
        Assertions.assertTrue(sum == 6);
    }

    @Test
    void concanateTest() {
        log.debug("Testing sum concatenate in {} SUT", mySut.getName());

        // exercise
        String phrase = mySut.concatenate("hello", "world");

        // verify
        Assertions.assertTrue(phrase.equals("hello world"));
    }

    @AfterEach
    void teardown() {
        mySut.releaseId();
    }

    @AfterAll
    void teardownAll() {
        mySut.close();
    }

}
