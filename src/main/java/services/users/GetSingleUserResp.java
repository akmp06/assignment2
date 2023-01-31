package services.users;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

import java.util.List;

@Getter
public class GetSingleUserResp {
    @SerializedName("id")
    private int id;

    @SerializedName("email")
    private String email;

    @SerializedName("username")
    private String username;

    @SerializedName("password")
    private String password;

    @SerializedName("name")
    private Name name;

    @SerializedName("address")
    private Address address;

    @SerializedName("phone")
    private String phone;


    @Getter
    public class Name{

        @SerializedName("firstname")
        private String firstname;

        @SerializedName("lastname")
        private String lastname;

    }

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
        private Geo geolocation;
    }

    @Getter
    public class Geo{

        @SerializedName("lat")
        private String lat;

        @SerializedName("lng")
        private String lng;
    }

}
