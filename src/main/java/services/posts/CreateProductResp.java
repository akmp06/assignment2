package services.posts;

import lombok.Getter;

@Getter
public class CreateProductResp {
    private String title;
    private String price;
    private String description;
    private String image;
    private String category;
    private int id;
}
