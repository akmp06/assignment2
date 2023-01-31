package services.jsonplaceholder.posts;

import base.BaseTest;
import base.GatewayRequest;
import helpers.AssertHelper;
import helpers.MandatoryHeaders;
import org.testng.annotations.Test;
import services.posts.GetAllCartsReq;

public class GetAllCarts extends BaseTest {
    @Test
    public void test_get_all_carts() {
        GatewayRequest gatewayRequest = new GatewayRequest()
                .usingHeaders(MandatoryHeaders.getHeaders())
                .forService()
                .postsService()
                .getAllCarts(GetAllCartsReq.builder().build())
                .send();

        AssertHelper.assertResponseCode(gatewayRequest, 200);

        System.out.println(gatewayRequest.getHttpResponse().getBody());
    }
}
//get for all carts