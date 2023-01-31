package services.posts;

import base.AbstractHttpSpecification;
import base.Properties;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.mashape.unirest.http.HttpMethod;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Builder
@Accessors(chain = true)
@Getter
@Setter
public class UpdateProductReq extends AbstractHttpSpecification {

    @SerializedName("title")
    @Expose
    public String title;

    @SerializedName("price")
    @Expose
    public String price;

    @SerializedName("description")
    @Expose
    public String description;

    @SerializedName("image")
    @Expose
    public String image;
    @SerializedName("category")
    @Expose
    public String category;

    @Setter
    private transient Integer id;

    @Override
    protected HttpMethod getHttpMethod() {
        return HttpMethod.PUT;
    }

    @Override
    protected String getEndpointUrl() {
        return Properties.JSONPLACEHOLDER_API + "/products/" + id;
    }
}
