package services.query.posts;

import base.GatewayRequest;
import helpers.AssertHelper;
import helpers.MandatoryHeaders;
import org.testng.annotations.Test;
import services.posts.CategoryReq;

public class Category {
   @Test
   public void test_get_category_product() {
       GatewayRequest gatewayRequest = new GatewayRequest()
               .usingHeaders(MandatoryHeaders.getHeaders())
               .forService()
               .category(CategoryReq
                       .builder()
                       .category("men's clothing")
                       .build())
               .send();
       AssertHelper.assertResponseCode(gatewayRequest, 200);
       System.out.println(gatewayRequest.getHttpResponse().getBody());


   }
}
