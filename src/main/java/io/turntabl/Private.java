package io.turntabl;

public class Private extends Client {
    public Private(String name, int id, ServiceLevel serviceLevel) {
        super(name, id, serviceLevel);
    }

    @Override
    public String getName() {
        return null;
    }
}
