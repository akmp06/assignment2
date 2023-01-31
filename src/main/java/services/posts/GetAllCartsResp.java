package services.posts;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

import java.util.List;

@Getter
public class GetAllCartsResp {
    private List<Posts> posts;

    @Getter
    public class Posts{

        @SerializedName("id")
        private int id;

        @SerializedName("userId")
        private String userId;

        @SerializedName("date")
        private String date;

    }
}
