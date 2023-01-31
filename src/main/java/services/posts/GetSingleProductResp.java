package services.posts;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class GetSingleProductResp {

    @SerializedName("id")
    private int id;

    @SerializedName("title")
    private String title;

    @SerializedName("price")
    private String price;

    @SerializedName("category")
    private int category;

    @SerializedName("description")
    private int description;

    @SerializedName("image")
    private int image;
}
