package gersondeveloper.com.br.redditmvp.posts;

/**
 * Created by gerso on 10/11/2016.
 */


import gersondeveloper.com.br.redditmvp.data.PostsRepository;

/** Monitora as ações dos usuários na UI ((@Link PostsFragment)), recupera a informação e atualiza a UI como requerido*/

public class PostsPresenter implements PostsContract.Presenter {

    private final PostsRepository mPostsRepository;
    private final PostsContract.View mPostsView;

    @Override
    public void start() {

    }

    @Override
    public void loadPosts(boolean forceUpdate) {

    }


}
