package controllers;

import base.GatewayRequest;
import services.posts.*;

public class PostsService {
    private GatewayRequest gatewayRequest;

    public PostsService(GatewayRequest gatewayRequest){
        this.gatewayRequest = gatewayRequest;
    }

    public GatewayRequest getSingleProduct(GetSingleProductReq getSingleProductReq){
        gatewayRequest.setBody(getSingleProductReq);
        gatewayRequest.setResponseObjectType(GetSingleProductResp.class);
        return gatewayRequest;
    }

    public GatewayRequest getAllProduct(GetAllProductReq getAllProductReq){
        gatewayRequest.setBody(getAllProductReq);
        gatewayRequest.setResponseObjectType(GetAllProductResp.class);
        return gatewayRequest;
    }

    public GatewayRequest createProduct(CreateProductReq createProductReq){
        gatewayRequest.setBody(createProductReq);
        gatewayRequest.setResponseObjectType(CreateProductResp.class);
        return gatewayRequest;
    }

    public GatewayRequest updateProduct(UpdateProductReq updateProductReq){
        gatewayRequest.setBody(updateProductReq);
        gatewayRequest.setResponseObjectType(UpdateProductResp.class);
        return gatewayRequest;
    }

    public GatewayRequest getAllCarts(GetAllCartsReq getAllCarts) {
        gatewayRequest.setBody(getAllCarts);
        gatewayRequest.setResponseObjectType(GetAllCartsResp.class);
        return gatewayRequest;
    }
    public GatewayRequest getDelete(DeleteReq delete) {
        gatewayRequest.setBody(delete);
        gatewayRequest.setResponseObjectType(DeleteReq.class);
        return gatewayRequest;
    }

}
