package io.turntabl;

public class Corporate extends Client {
    private String accountManager;
    public Corporate(String name, int id, ServiceLevel serviceLevel) {
        super(name, id, serviceLevel);
    }

    @Override
    public String getName() {
        return accountManager;
    }
}
