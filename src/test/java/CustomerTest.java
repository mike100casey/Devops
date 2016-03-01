/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.easymock.EasyMock;
import org.junit.Test;

import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author t00025364
 */
public class CustomerTest {
    private Loan mockloan;
    
    public CustomerTest() {
    }
    /**
     * Test of takeoutloan method, of class Customer.
     */
    @Test
    public void testTakeoutloan() {
        System.out.println("takeoutloan");
        Customer instance = new Customer("Jake Black",0.0);
       
         /*call the createMock to create a mock for the Loan class */
        mockloan = EasyMock.createMock(Loan.class);
     
        /* set up the expected values and return values */
        expect(mockloan.getMonthlyPayment()).andReturn(106.23);
        
        /*activate the mock */
        replay(mockloan);
       
        double expResult = 106.23;
       System.out.println("takeoutloan");
        
        instance.takeoutloan();
        double result = instance.getMonthlypayments();
        assertEquals("The monthly payments must be equal", expResult, result, 0.5) ; 


    }
    
}
