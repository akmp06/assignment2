package services.posts;

import base.AbstractHttpSpecification;
import base.Properties;
import com.mashape.unirest.http.HttpMethod;
import lombok.Builder;
import lombok.Setter;
import lombok.experimental.Accessors;

@Builder
@Accessors(chain = true)
public class DeleteReq extends AbstractHttpSpecification {

    @Setter
    private transient Integer id;


    @Override
    protected HttpMethod getHttpMethod() {
        return HttpMethod.DELETE;
    }

    @Override
    protected String getEndpointUrl() {
        return Properties.JSONPLACEHOLDER_API + "/products/" + id;
    }
}
