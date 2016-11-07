package gersondeveloper.com.br.redditmvp.data;

import java.util.List;

/**
 * Created by gerso on 05/11/2016.
 */

public interface PostsServiceApi {

    interface PostsServiceCallback<T>{
        void onLoaded(T posts);
    }

    void getAllPosts(PostsServiceCallback<List<Post>> callback);

}
