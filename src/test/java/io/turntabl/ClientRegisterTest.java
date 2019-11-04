package io.turntabl;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ClientRegisterTest {


    @Test
    void getClientName() {
    }
        List<Client> Clients = Arrays.asList(
                new Private("Harrison", 6475390, ServiceLevel.Gold),
                new Private("Jamie", 2354789, ServiceLevel.Platinum),
                new Private("Robert", 32485966, ServiceLevel.Premium),
                new Private("Grace", 3648595, ServiceLevel.Gold),
                new Corporate("Debby",6475390,ServiceLevel.Gold),
                new Corporate("Nikki",2354789,ServiceLevel.Platinum),
                new Corporate("Dawson",32485966,ServiceLevel.Premium),
                new Corporate("Richard",3648595,ServiceLevel.Gold)

        );
        ClientRegister clientRegister = new ClientRegister();

    @Test
    void getGoldClients() {
    }
}


