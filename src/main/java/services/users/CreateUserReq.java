package services.users;

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
public class CreateUserReq extends AbstractHttpSpecification {

    @SerializedName("email")
    @Expose
    public String email;

    @SerializedName("username")
    @Expose
    public String username;

    @SerializedName("password")
    @Expose
    public String password;

    @SerializedName("name")
    @Expose
    public GetSingleUserResp.Name name;

    @SerializedName("address")
    @Expose
    public GetSingleUserResp.Address address;

    @SerializedName("phone")
    @Expose
    public String phone;

    @Setter
    public class Name{
        @SerializedName("firstname")
        @Expose
        public String firstname;

        @SerializedName("lastname")
        @Expose
        public String lastname;
    }
    @Setter
    public class Address{

        @SerializedName("street")
        @Expose
        public String street;

        @SerializedName("number")
        @Expose
        public String number;

        @SerializedName("zipcode")
        @Expose
        public String zipcode;

        @SerializedName("geolocation")
        @Expose
        public GetSingleUserResp.Geo geolocation;
    }

    @Setter
    public class Geo{

        @SerializedName("lat")
        @Expose
        public String lat;

        @SerializedName("lng")
        @Expose
        public String lng;
    }

    @Override
    protected HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    protected String getEndpointUrl() {
        return Properties.JSONPLACEHOLDER_API + "/users";
    }
}
