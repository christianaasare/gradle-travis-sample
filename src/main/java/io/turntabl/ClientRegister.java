package io.turntabl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ClientRegister implements ContactName{
    private List<Client> clients;


    public ClientRegister(List<Client> clients) {
        this.clients = clients;
    }

    public List<String> getClientName(){
        List<String> clientNames = new ArrayList<>();
        return clients.stream().map(Client::getName).collect(Collectors.toList());
    }

    public List<String> getGoldClients(ServiceLevel serviceLevel){

        return clients.stream().filter(client -> client.getServiceLevel()==serviceLevel.Gold)
                .map(Client::getName)
                .collect(Collectors.toList());


}

    @Override
    public String getName() {
        return getName();
    }
}
