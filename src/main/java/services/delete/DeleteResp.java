package services.delete;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

import java.util.List;

@Getter
public class DeleteResp {
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
        private String category;

        @SerializedName("description")
        private String description;

        @SerializedName("image")
        private String image;
    }
}
