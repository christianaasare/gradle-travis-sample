
package io.turntabl;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ClientRegisterTest {

    @Test
    public void getClientName() {

        List<Client> clients = Arrays.asList(
                new Private("Harrison", 6475390, ServiceLevel.Gold),
                new Private("Jamie", 2354789, ServiceLevel.Platinum),
                new Private("Robert", 32485966, ServiceLevel.Premium),
                new Private("Grace", 3648595, ServiceLevel.Gold),
                new Corporate("Debby", 6475390, ServiceLevel.Gold),
                new Corporate("Nikki", 2354789, ServiceLevel.Platinum),
                new Corporate("Dawson", 32485966, ServiceLevel.Premium),
                new Corporate("Richard", 3648595, ServiceLevel.Gold)

        );
//        ClientRegister clientRegister = new ClientRegister(clients);
//        List<String> expectedClientNames = Arrays.asList("Harrison", "Jamie", "Robert");
//        assertEquals(expectedClientNames,clientRegister.getClientName());
        ClientRegister clientRegister = new ClientRegister(clients);
//        assertEquals(Arrays.asList("Harrison","Grace"),clientRegister.getClientName());
    }

    @Test
        public void getGoldClients() {
        List<Client> clients = Arrays.asList(
                new Private("Harrison", 6475390, ServiceLevel.Gold),
                new Private("Jamie", 2354789, ServiceLevel.Platinum),
                new Private("Robert", 32485966, ServiceLevel.Premium),
                new Private("Grace", 3648595, ServiceLevel.Gold),
                new Corporate("Debby",6475390,ServiceLevel.Gold),
                new Corporate("Nikki",2354789,ServiceLevel.Platinum),
                new Corporate("Dawson",32485966,ServiceLevel.Premium),
                new Corporate("Richard",3648595,ServiceLevel.Gold)

        );
        ClientRegister clientRegister = new ClientRegister(clients);
        List<String> expectedGoldClients= Arrays.asList("Harrison","Grace", "Debby","Richard");
        assertEquals(expectedGoldClients, clientRegister.getGoldClients(ServiceLevel.Gold));
    }

}