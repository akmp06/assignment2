package services.query.users;

import base.BaseTest;
import base.GatewayRequest;
import base.Serializer;
import services.users.CreateUserReq;
import services.users.CreateUserResp;
import helpers.AssertHelper;
import helpers.MandatoryHeaders;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CreateUser extends BaseTest {
    private CreateUserReq createUserReq;

    @Test
    public void test_create_user(){
        GatewayRequest gatewayRequest = new GatewayRequest()
                .usingHeaders(MandatoryHeaders.getHeaders())
                .forService()
                .userService()
                .createUser(createUserReq)
                .send();

        AssertHelper.assertResponseCode(gatewayRequest, 200);
        CreateUserResp resp = (CreateUserResp) gatewayRequest.getSerializedResponse();

        System.out.println(gatewayRequest.getHttpResponse().getRawBody());

    }

    @BeforeClass
    public void setupRequests(){
        createUserReq = (CreateUserReq) Serializer.convertJsonStringToObject("CreateUser.json", CreateUserReq.class);
    }
}
