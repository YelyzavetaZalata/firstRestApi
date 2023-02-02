package pl.edu.vistula.firstRestApi.shared.api.response;

import pl.edu.vistula.firstRestApi.product.api.request.UpdateProductRequest;
import pl.edu.vistula.firstRestApi.product.api.response.ProductResponse;
import pl.edu.vistula.firstRestApi.product.domain.Product;
import pl.edu.vistula.firstRestApi.product.support.ProductExceptionSupplier;

public class ErrorMessageResponse {

    private final String message;

    public ErrorMessageResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }


}