package gersondeveloper.com.br.redditmvp.posts;

import java.util.List;

import gersondeveloper.com.br.redditmvp.BasePresenter;
import gersondeveloper.com.br.redditmvp.BaseView;
import gersondeveloper.com.br.redditmvp.data.Post;

/**
 * Created by gerso on 03/11/2016.
 */

public interface PostsContract {

    interface View extends BaseView<Presenter> {
        void showPosts(List<Post> posts);
    }

    interface Presenter extends BasePresenter
    {
        void loadPosts(boolean forceUpdate);
    }
}
