
package io.github.guaaxiiniim;

import static java.lang.invoke.MethodHandles.lookup;
import static org.junit.jupiter.api.parallel.ExecutionMode.CONCURRENT;
import static org.slf4j.LoggerFactory.getLogger;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.slf4j.Logger;

@Disabled
@Execution(CONCURRENT)
class ParallelExecutionTest {

    static final Logger log = getLogger(lookup().lookupClass());

    @Test
    void test01() {
        log.debug("test01");
    }

    @Test
    void test02() {
        log.debug("test02");
    }

    @Test
    void test03() {
        log.debug("test03");
    }

}
