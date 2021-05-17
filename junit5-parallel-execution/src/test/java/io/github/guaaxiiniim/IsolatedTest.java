
package io.github.guaaxiiniim;

import static java.lang.invoke.MethodHandles.lookup;
import static org.slf4j.LoggerFactory.getLogger;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Isolated;
import org.slf4j.Logger;

@Disabled
@Isolated
class IsolatedTest {

    static final Logger log = getLogger(lookup().lookupClass());

    @Test
    void test01() {
        log.debug("IsolatedTest 1.1");
        log.debug("IsolatedTest 1.2");
    }

    @Test
    void test02() {
        log.debug("IsolatedTest 2.1");
        log.debug("IsolatedTest 2.2");
    }

    @Test
    void test03() {
        log.debug("IsolatedTest 3.1");
        log.debug("IsolatedTest 3.2");
    }
}
