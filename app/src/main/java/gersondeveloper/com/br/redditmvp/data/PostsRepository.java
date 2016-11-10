package gersondeveloper.com.br.redditmvp.data;

import android.support.annotation.NonNull;

import java.util.List;

/**
 * Created by gerso on 05/11/2016.
 */

public interface PostsRepository {

    interface LoadPostsCallback
    {
        void onPostsLoaded(List<Post> posts);
    }

    interface GetPostCallback
    {
        void onPostLoaded(Post post);
    }

    void getPosts(@NonNull LoadPostsCallback callback);

    void refreshData();

}
