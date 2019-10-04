/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clockyourhours.main;

import clockyourhours.businesslogic.MemberAdminManagerImpl;
import clockyourhours.presentation.MemberAdminUI;

/**
 *
 * @author ppthgast
 */
public class Main {

    
    /**
     * private c'tor to prevent instantiation
     */
    private Main() {
       // deliberately empty
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        MemberAdminUI ui = new MemberAdminUI(new MemberAdminManagerImpl());
        ui.setVisible(true);
    }
}
