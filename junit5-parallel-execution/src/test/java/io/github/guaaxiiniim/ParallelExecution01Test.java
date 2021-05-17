
package io.github.guaaxiiniim;

import static java.lang.invoke.MethodHandles.lookup;
import static org.slf4j.LoggerFactory.getLogger;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;

class ParallelExecution01Test {

    static final Logger log = getLogger(lookup().lookupClass());

    @Test
    void test01() {
        log.debug("01.test01");
    }

    @Test
    void test02() {
        log.debug("01.test02");
    }

}
