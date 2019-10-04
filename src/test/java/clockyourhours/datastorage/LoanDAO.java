/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clockyourhours.datastorage;

import clockyourhours.domain.Loan;
import clockyourhours.domain.Member;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * This is a stub for LoanDAO. Purpose of this stub is to make the unit test
 * independent of the database.
 *
 * @author Erco
 */
public class LoanDAO {

    public List<Loan> findLoans(Member member) {
        System.out.println("LoanDAO.findLoans() stub");
        return new ArrayList<>();
    }

}
