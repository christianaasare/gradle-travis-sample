package io.turntabl;

public class Corporate extends Client {
    private String accountManager;
    public Corporate(String accountManager, int id, ServiceLevel serviceLevel) {
        super(accountManager, id, serviceLevel);
    }

}
