package base;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.request.HttpRequest;
import controllers.PostsService;
import controllers.UserService;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import services.delete.DeleteReq;
import services.posts.CategoryReq;
import services.posts.GetSingleProductReq;
import services.posts.GetSingleProductResp;
import services.users.GetSingleUserReq;
import services.users.GetSingleUserResp;

public class GatewayRequest {

    @Getter(AccessLevel.PUBLIC)
    private HttpHeader headers = new HttpHeader();
    @Setter
    @Getter(AccessLevel.PROTECTED)
    private AbstractHttpSpecification body;
    @Getter
    @Setter(AccessLevel.PROTECTED)
    private HttpRequest httpRequest;
    @Getter
    @Setter(AccessLevel.PROTECTED)
    private HttpResponse httpResponse;
    @Getter
    @Setter(AccessLevel.PROTECTED)
    private Object serializedResponse;
    @Setter
    @Getter(AccessLevel.PROTECTED)
    private Class responseObjectType;


    public GatewayRequest forService() {
        return this;
    }

    public GatewayRequest usingHeaders(final HttpHeader httpHeader) {
        this.headers = httpHeader;
        return this;
    }

    public GatewayRequest getSingleProduct(final GetSingleProductReq singleProductReq) {
        body = singleProductReq;
        responseObjectType = GetSingleProductResp.class;
        return this;
    }

    public GatewayRequest getSingleUser(final GetSingleUserReq singleUserReq) {
        body = singleUserReq;
        responseObjectType = GetSingleUserResp.class;
        return this;
    }
    public GatewayRequest getDelete(final DeleteReq deleteReq) {
        body = deleteReq;
        responseObjectType = DeleteReq.class;
        return this;
    }

    public GatewayRequest category(final CategoryReq cate) {
        body= cate;
        responseObjectType = CategoryReq.class;
        return this;
    }

    public PostsService postsService() {
        return new PostsService(this);
    }

    public UserService userService() {
        return new UserService(this);
    }

    public GatewayRequest send() {
        new HttpDispatcher().send(this);
        return this;
    }

}
