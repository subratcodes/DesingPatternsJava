package Behavorial.ChainOfResponsibility;

import Behavorial.ChainOfResponsibility.Servlet.Request;

public class ThrottlingMiddleware extends Middleware {


    private int requestPerMinute;
    private long currentTime;
  
    public ThrottlingMiddleware(int requestPerMinute) {
        this.requestPerMinute = requestPerMinute;
        this.currentTime = System.currentTimeMillis();
    }

    @Override
    public boolean check(Request req) {
        // TODO Auto-generated method stub

        


        return false;
    }



    

  

    /**
     * Please, not that checkNext() call can be inserted both in the beginning
     * of this method and in the end.
     *
     * This gives much more flexibility than a simple loop over all middleware
     * objects. For instance, an element of a chain can change the order of
     * checks by running its check after all other checks.
    //  */
    // @Override
    // public boolean check(String email, String password) {
    //     if (System.currentTimeMillis() > currentTime + 60_000) {
    //         request = 0;
    //         currentTime = System.currentTimeMillis();
    //     }

    //     request++;
        
    //     if (request > requestPerMinute) {
    //         System.out.println("Request limit exceeded!");
    //         Thread.currentThread().stop();
    //     }
    //     return checkNext(email, password);
    // }
}


