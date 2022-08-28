package Upr_8;

import java.io.Serial;

public class NoMoreProductsException extends Exception {

    @Serial
    private static final long serialVersionUID = 1L;

    public String getMessage() {
        return "No more products!";
    }


}
