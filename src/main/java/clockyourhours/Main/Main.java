package clockyourhours.Main;

import clockyourhours.DomainModelLayer.Client;
import clockyourhours.DomainModelLayer.Project;
import clockyourhours.DomainModelLayer.Task;


import java.lang.reflect.Array;
import java.util.*;

public class Main {


    public static void main(String[] args) {
        // create a ArrayList String type
        // and Initialize an ArrayList with asList()
/**
 * Client 1 met een project en een taak
 */

        ArrayList<String> t1 = new ArrayList<>();
        t1.add("Afwerking");
        t1.add("opbouw");

        ArrayList<String> t2 = new ArrayList<>();
        t2.add("aanleg");
        t2.add("grondwerk");

        System.out.println(t1);

        HashMap<String, ArrayList> p1 = new HashMap<>();

        p1.put("Dakkapel",t1);
        p1.put("tuinhuis",t2);

        Client c1;
        c1 = new Client(p1,1, "Jansen Bouw", "Mary Zeldenrustlaan 165", "5122CH", "Rijen", "Netherlands", "joostoomen@hotmail.com");

        /**
         * Client 2 met een project en een taak
         */
//        Task t2;
//        t2 = new Task("afwerking");
//
//        Project p2;
//        p2 = new Project("Tuinhuis", t2);
//
//        Client c2;
//        c2 = new Client(p2,2, "fritsen Bouw", "Mary kees 165", "8765GB", "Groningen", "Netherlands", "fritsen@hotmail.com");

//               p3.addTask("kezen");
//               p3.addTask("poetsen");
//               c2.addProject( "tuin");

        /**
         * Client 3 met een project en een taak
         */
//        Task t3;
//        t3 = new Task("aanleg");
//
//        Project p3;
//        p3 = new Project("Domotica", t3);
//
//        Client c3;
//        c3 = new Client(p3,3, "Paapen Electra Bouw", "Mary truus 165", "4876PL", "Kaatsheuvel", "Netherlands", "Paapen@hotmail.com");


        List<Client> clients = new ArrayList<>(Arrays.asList(c1));

        for (Client client : clients) {
            System.out.println("client " + client.getCompanyName() + " heeft de volgende projecten " + client.getProjects());
        }


    }

}