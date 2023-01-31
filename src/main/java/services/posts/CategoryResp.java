package services.posts;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class CategoryResp {

    @SerializedName("category")
    private int category;
    @SerializedName("id")
    private int id;

    @SerializedName("title")
    private String title;

    @SerializedName("price")
    private String price;

    @SerializedName("description")
    private int description;

    @SerializedName("image")
    private int image;
}
