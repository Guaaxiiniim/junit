
package io.github.guaaxiiniim;

import static java.lang.invoke.MethodHandles.lookup;
import static org.slf4j.LoggerFactory.getLogger;

import java.io.Closeable;
import java.util.UUID;
import java.util.stream.IntStream;

import org.slf4j.Logger;

public class MySUT implements Closeable {

    static final Logger log = getLogger(lookup().lookupClass());

    String name;
    String id;

    public MySUT(String name) {
        this.name = name;
        log.info("{} created", name);
    }

    public void initId() {
        id = UUID.randomUUID().toString();
        log.info("Id created: {}", id);
    }

    public void releaseId() {
        if (id == null) {
            throw new IllegalArgumentException(name + " not initilized");
        }
        log.info("Id released: {}", id);
        id = null;
    }

    public int sum(int... numbers) {
        return IntStream.of(numbers).sum();
    }

    public String concatenate(String... words) {
        return String.join(" ", words);
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void close() {
        log.info("{} closed", name);
    }

}
