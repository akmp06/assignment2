package services.query.users;

import base.BaseTest;
import base.GatewayRequest;
import services.users.GetSingleUserReq;
import services.users.GetSingleUserResp;
import helpers.AssertHelper;
import helpers.MandatoryHeaders;
import org.testng.annotations.Test;

public class GetUsers extends BaseTest {

    @Test
    public void test_get_single_user(){
        GatewayRequest gatewayRequest = new GatewayRequest()
                .usingHeaders(MandatoryHeaders.getHeaders())
                .forService()
                .getSingleUser(GetSingleUserReq.builder()
                        .id(1)
                        .build())
                .send();

        AssertHelper.assertResponseCode(gatewayRequest, 200);

        GetSingleUserResp resp = (GetSingleUserResp) gatewayRequest.getSerializedResponse();
        AssertHelper.assertResponseBodyContains("email", resp.getEmail(), "john@gmail.com");
        System.out.println(gatewayRequest.getHttpResponse().getBody());

    }
}
