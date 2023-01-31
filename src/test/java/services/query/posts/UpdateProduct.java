package services.query.posts;

import base.BaseTest;
import base.GatewayRequest;
import services.posts.UpdateProductReq;
import services.posts.UpdateProductResp;
import helpers.AssertHelper;
import helpers.MandatoryHeaders;
import org.testng.annotations.Test;

public class UpdateProduct extends BaseTest {
    @Test
    public void test_update_product(){
        GatewayRequest gatewayRequest = new GatewayRequest()
                .usingHeaders(MandatoryHeaders.getHeaders())
                .forService()
                .postsService()
                .updateProduct(UpdateProductReq.builder()
                        .id(1)
                        .title("test")
                        .price("2027.0205")
                        .description("new")
                        .image("https://i.pravatar.cc")
                        .category("electronic")
                        .build())
                .send();

        AssertHelper.assertResponseCode(gatewayRequest, 200);

        UpdateProductResp resp = (UpdateProductResp) gatewayRequest.getSerializedResponse();

        AssertHelper.assertResponseBodyContains("title", resp.getTitle(), "test");
        System.out.println(gatewayRequest.getHttpResponse().getBody());

    }
}
//put and patch for product