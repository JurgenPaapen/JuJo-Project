package clockyourhours.Main;

import clockyourhours.DomainModelLayer.Client;
import clockyourhours.DomainModelLayer.Project;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        Client c1;
          ArrayList<String> p1 =  new ArrayList<>();
          p1.add("tuin");
          p1.add("zolder");
          p1.add("Keuken");
        ArrayList<String> p2 =  new ArrayList<>();
        p2.add("kelder");
        p2.add("Tuinhuis");
        p2.add("Schuur");



        c1 = new Client(p1,1, "Jansen Bouw", "Mary Zeldenrustlaan 165", "5122CH", "Rijen", "Netherlands", "joostoomen@hotmail.com");
        Client c2;
        c2 = new Client(p2,2, "fritsen Bouw", "Mary kees 165", "8765GB", "Groningen", "Netherlands", "fritsen@hotmail.com");
//        Client c3;
//        c3 = new Client(3, "Paapen Electra Bouw", "Mary truus 165", "4876PL", "Kaatsheuvel", "Netherlands", "Paapen@hotmail.com");


        List<Client> clients = new ArrayList<>(Arrays.asList(c1, c2));

        for (Client client : clients) {
            System.out.println(client.getProject().getClass());
        }
    }

}