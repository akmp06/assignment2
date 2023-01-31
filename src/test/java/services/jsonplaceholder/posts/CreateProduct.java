package services.jsonplaceholder.posts;

import base.BaseTest;
import base.GatewayRequest;
import services.posts.CreateProductReq;
import services.posts.CreateProductResp;
import helpers.AssertHelper;
import helpers.MandatoryHeaders;
import org.testng.annotations.Test;

public class CreateProduct extends BaseTest {

    @Test
    public void test_create_product(){
        GatewayRequest gatewayRequest = new GatewayRequest()
                .usingHeaders(MandatoryHeaders.getHeaders())
                .forService()
                .postsService()
                .createProduct(
                        CreateProductReq
                                .builder()
                                .title("car")
                                .price("acbdkalfs")
                                .image("https://new.pic.cc")
                                .category("electronic")
                                .build())
                .send();

        CreateProductResp resp = (CreateProductResp) gatewayRequest.getSerializedResponse();

        AssertHelper.assertResponseCode(gatewayRequest, 200);
        AssertHelper.assertResponseBodyContains("title", resp.getTitle(), "car");
        System.out.println(gatewayRequest.getHttpResponse().getBody());
    }
}
