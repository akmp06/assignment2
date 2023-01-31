package services.jsonplaceholder.posts;

import base.BaseTest;
import base.GatewayRequest;
import helpers.AssertHelper;
import helpers.MandatoryHeaders;
import org.testng.annotations.Test;
import services.posts.GetSingleProductReq;


public class GetSingleProduct extends BaseTest {

    @Test
    public void test_get_single_product(){
        GatewayRequest gatewayRequest = new GatewayRequest()
                .usingHeaders(MandatoryHeaders.getHeaders())
                .forService()
                .getSingleProduct(GetSingleProductReq
                        .builder()
                        .id(3)
                        .build())
                .send();

        AssertHelper.assertResponseCode(gatewayRequest, 200);
        System.out.println(gatewayRequest.getHttpResponse().getBody());
    }
}
