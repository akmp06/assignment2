package services.query.delete;

import base.BaseTest;
import base.GatewayRequest;
import helpers.AssertHelper;
import helpers.MandatoryHeaders;
import org.testng.annotations.Test;
import services.delete.DeleteReq;


public class Delete extends BaseTest {

    @Test
    public void test_delete(){
        GatewayRequest gatewayRequest = new GatewayRequest()
                .usingHeaders(MandatoryHeaders.getHeaders())
                .forService()
                .getDelete(DeleteReq
                        .builder()
                        .id(1)
                        .build())
                .send();

        AssertHelper.assertResponseCode(gatewayRequest, 200);
        System.out.println(gatewayRequest.getHttpResponse().getBody());
    }
}
