package services.users;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class CreateUserResp {
    @SerializedName("email")
    private String email;

    @SerializedName("username")
    private String username;

    @SerializedName("password")
    private String password;

    @SerializedName("name")
    private GetSingleUserResp.Name name;

    @SerializedName("address")
    private GetSingleUserResp.Address address;

    @SerializedName("phone")
    private String phone;

    @SerializedName("id")
    private int id;

    @Getter
    public class Address{

        @SerializedName("city")
        private String city;

        @SerializedName("street")
        private String street;

        @SerializedName("number")
        private String number;

        @SerializedName("zipcode")
        private String zipcode;

        @SerializedName("geolocation")
        private GetSingleUserResp.Geo geolocation;
    }


    @Getter
    public class Geo{

        @SerializedName("lat")
        private String lat;

        @SerializedName("lng")
        private String lng;
    }
}
