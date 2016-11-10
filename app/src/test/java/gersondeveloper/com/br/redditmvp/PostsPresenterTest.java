package gersondeveloper.com.br.redditmvp;

import com.google.common.collect.Lists;

import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import gersondeveloper.com.br.redditmvp.data.Post;
import gersondeveloper.com.br.redditmvp.data.PostsRepository;
import gersondeveloper.com.br.redditmvp.posts.PostsContract;

/**
 * Created by gerso on 05/11/2016.
 */

public class PostsPresenterTest {
    private String teste_array[] = {"teste_1","teste_2"};



    private static List<Post> POSTS = Lists.newArrayList(new Post(
            true,
            "banned_by_test",
            "domain_test",
            "subreddit_test",
            "selftext_html_test",
            "selftext_test",
            "likes_test",
            "suggested_test",
            "secure_media_test",
            true,
            "id_test",
            0,
            true,
            "report_seasos_test",
            "author_test",
            "media_test",
            "name_test",
            0,
            "approved_by_test",
            true,
            "removal_test",
            true), new Post(
            false,
            "banned_by_test_1",
            "domain_test_1",
            "subreddit_test_1",
            "selftext_html_test_1",
            "selftext_test_1",
            "likes_test_1",
            "suggested_test_1",
            "secure_media_test_1",
            false,
            "id_test_1",
            1,
            false,
            "report_seasos_test_1",
            "author_test_1",
            "media_test_1",
            "name_test_1",
            1,
            "approved_by_test_1",
            false,
            "removal_test_1",
            false
        )
    );

    private static List<Post> EMPTY_POST = new ArrayList<>(0);

    @Mock
    private PostsRepository mPostsRepository;

    @Mock
    private PostsContract.View mPostsView;

    @Captor
    private ArgumentCaptor<PostsRepository.LoadPostsCallback> mLoadPostsCallbackCaptor;

    private Posts

    @Before
    public void setupPostsPresenter()
    {
        //Mockitgo tem uma maneira muito conveniente de injetar mocks usando a anotação @Mock. Para injetar os mocks no teste, é preciso chamar o método initMocks()
        MockitoAnnotations.initMocks(this);

        //Pega uma referência para a classe sob teste

    }

    @Test
    public void loadPostsFromRepositoryandLoadIntoView(){
        mPostsRepository
    }

}
