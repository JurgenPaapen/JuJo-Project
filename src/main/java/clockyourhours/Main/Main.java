package clockyourhours.Main;

import clockyourhours.DomainModelLayer.Client;
import clockyourhours.DomainModelLayer.Project;
import clockyourhours.project;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        // create a ArrayList String type
        // and Initialize an ArrayList with asList()
        Project p2;
        p2 = new Project("Dakkapel", "opbouw");

        Client c1;
        c1 = new Client(p2,1, "Jansen Bouw", "Mary Zeldenrustlaan 165", "5122CH", "Rijen", "Netherlands", "joostoomen@hotmail.com");


//        p2.addTask("Opbouw");
//        p2.addTask("Afwerking");

//        c1.addProject("Dakkapel", "");
        Project p1;
        p1 = new Project("tuin", "harken");
//
//        p1.addTask("harken");
//        p1.addTask("schoffelen");

//        c1.addProject();
//        c1.addProject("keuken");

        Client c2;
        c2 = new Client(p1,2, "fritsen Bouw", "Mary kees 165", "8765GB", "Groningen", "Netherlands", "fritsen@hotmail.com");

        Project p3;
        p3 = new Project("tuin", "harken");
//               p3.addTask("kezen");
//               p3.addTask("poetsen");
//               c2.addProject( "tuin");
//        Client c3
//        c3 = new Client(3, "Paapen Electra Bouw", "Mary truus 165", "4876PL", "Kaatsheuvel", "Netherlands", "Paapen@hotmail.com");


        List<Client> clients = new ArrayList<>(Arrays.asList(c1, c2));

        for (Client client : clients) {
            System.out.println("client " + client.getCompanyName() + " heeft de volgende projecten " + client.getProjects());
        }
        System.out.println(clients);

    }

}