package services.posts;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

import java.util.List;

@Getter
public class GetAllProductResp {
    private List<Posts> posts;

    @Getter
    public class Posts{

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
}
