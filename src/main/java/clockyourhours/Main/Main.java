package clockyourhours.Main;

import clockyourhours.DomainModelLayer.Client;
import clockyourhours.DomainModelLayer.Project;
import clockyourhours.DomainModelLayer.Task;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        // create a ArrayList String type
        // and Initialize an ArrayList with asList()
        Task t1;
        t1 = new Task("Opbouw");
//        Task t11;
//        t11 = new Task("afwerking");
//        Task t12;
//        t12 = new Task("isolatie");

        Project p1;
        p1 = new Project("Dakkapel", t1);

        Client c1;
        c1 = new Client(p1,1, "Jansen Bouw", "Mary Zeldenrustlaan 165", "5122CH", "Rijen", "Netherlands", "joostoomen@hotmail.com");


//        p2.addTask("Opbouw");
//        p2.addTask("Afwerking");
//
//        p1.addTask("harken");
//        p1.addTask("schoffelen");

//        c1.addProject();
//        c1.addProject("keuken");

        Task t2;
        t2 = new Task("afwerking");

        Project p2;
        p2 = new Project("Tuinhuis", t2);

        Client c2;
        c2 = new Client(p2,2, "fritsen Bouw", "Mary kees 165", "8765GB", "Groningen", "Netherlands", "fritsen@hotmail.com");

//               p3.addTask("kezen");
//               p3.addTask("poetsen");
//               c2.addProject( "tuin");

        Task t3;
        t3 = new Task("aanleg");

        Project p3;
        p3 = new Project("Domotica", t3);

        Client c3;
        c3 = new Client(p3,3, "Paapen Electra Bouw", "Mary truus 165", "4876PL", "Kaatsheuvel", "Netherlands", "Paapen@hotmail.com");


        List<Client> clients = new ArrayList<>(Arrays.asList(c1, c2, c3));

        for (Client client : clients) {
            System.out.println("client " + client.getCompanyName() + " heeft de volgende projecten " + client.getProjects());
        }


    }

}