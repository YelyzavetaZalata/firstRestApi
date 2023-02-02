package pl.edu.vistula.firstRestApi.product.support.exception;

public class ProductNotFoundException extends RuntimeException {
    public ProductNotFoundException(Long id){
        super(String.format("Product with id: %d not found",id));
        //please try not to use such form: "Product with id: "+ id +" not found")
        //because it's not good pracitce
        //the + operator should only be used for mathematical operations
    }
}
