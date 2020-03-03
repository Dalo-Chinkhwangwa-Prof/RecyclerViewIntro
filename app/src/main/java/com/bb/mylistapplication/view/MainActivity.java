package com.bb.mylistapplication.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.bb.mylistapplication.R;
import com.bb.mylistapplication.adapter.UserAdapter;
import com.bb.mylistapplication.adapter.UserBaseAdapter;
import com.bb.mylistapplication.model.User;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


    private List userList = new ArrayList<User>();

    //For ListView
//    @BindView(R.id.user_listview)
//    ListView userListView;

    @BindView(R.id.user_recycler_view)
    RecyclerView userRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        createMock();

        DividerItemDecoration itemDecoration = new DividerItemDecoration(this, RecyclerView.VERTICAL);
        userRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        userRecyclerView.setAdapter(new UserAdapter(userList));
        userRecyclerView.addItemDecoration(itemDecoration);

//        userListView = findViewById(R.id.user_listview);
//
//        userListView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });
//
//        userListView.setOnClickListener(v -> {
//
//        });


//          For ListView
//        UserBaseAdapter base = new UserBaseAdapter(userList);
//        userListView.setAdapter(base);
    }

//    @OnClick(R.id.user_listview)
//    public void onListClick(View view){
//
//    }

    private void createMock(){

        userList.add(new User("Mario", "https://pngimg.com/uploads/mario/mario_PNG57.png", "Mario is a game character. Nintendo's very own mascot."));
        userList.add(new User("Mushroom", "https://pngimage.net/wp-content/uploads/2018/06/immagine-png-13.png", "Mushroom is a game character in the Mario franchise. Mushroom is an enemy."));
        userList.add(new User("Bruno", "https://www.remove.bg/assets/home-samples/animals_removed-04243daa39198d3ae9cd6e74cac77c58a3009f686bdd877925869cd55d65b8ef.png", "Found randomly on google images."));
        userList.add(new User("ComputerMan", "https://www.websiteplanet.com/wp-content/themes/websiteplanet/img/compressor/image1.png", "Found randomly on google search"));
        userList.add(new User("Emoji...", "https://www.pngfind.com/pngs/m/81-815205_question-face-blinking-emoji-emoji-angry-png-transparent.png", "Thinking emoji.."));
        userList.add(new User("Mario", "https://pngimg.com/uploads/mario/mario_PNG57.png", "Mario is a game character. Nintendo's very own mascot."));
        userList.add(new User("Mushroom", "https://pngimage.net/wp-content/uploads/2018/06/immagine-png-13.png", "Mushroom is a game character in the Mario franchise. Mushroom is an enemy."));
        userList.add(new User("Bruno", "https://www.remove.bg/assets/home-samples/animals_removed-04243daa39198d3ae9cd6e74cac77c58a3009f686bdd877925869cd55d65b8ef.png", "Found randomly on google images."));
        userList.add(new User("ComputerMan", "https://www.websiteplanet.com/wp-content/themes/websiteplanet/img/compressor/image1.png", "Found randomly on google search"));
        userList.add(new User("Emoji...", "https://www.pngfind.com/pngs/m/81-815205_question-face-blinking-emoji-emoji-angry-png-transparent.png", "Thinking emoji.."));
        userList.add(new User("Mario", "https://pngimg.com/uploads/mario/mario_PNG57.png", "Mario is a game character. Nintendo's very own mascot."));
        userList.add(new User("Mushroom", "https://pngimage.net/wp-content/uploads/2018/06/immagine-png-13.png", "Mushroom is a game character in the Mario franchise. Mushroom is an enemy."));
        userList.add(new User("Bruno", "https://www.remove.bg/assets/home-samples/animals_removed-04243daa39198d3ae9cd6e74cac77c58a3009f686bdd877925869cd55d65b8ef.png", "Found randomly on google images."));
        userList.add(new User("ComputerMan", "https://www.websiteplanet.com/wp-content/themes/websiteplanet/img/compressor/image1.png", "Found randomly on google search"));
        userList.add(new User("Emoji...", "https://www.pngfind.com/pngs/m/81-815205_question-face-blinking-emoji-emoji-angry-png-transparent.png", "Thinking emoji.."));
        userList.add(new User("Mario", "https://pngimg.com/uploads/mario/mario_PNG57.png", "Mario is a game character. Nintendo's very own mascot."));
        userList.add(new User("Mushroom", "https://pngimage.net/wp-content/uploads/2018/06/immagine-png-13.png", "Mushroom is a game character in the Mario franchise. Mushroom is an enemy."));
        userList.add(new User("Bruno", "https://www.remove.bg/assets/home-samples/animals_removed-04243daa39198d3ae9cd6e74cac77c58a3009f686bdd877925869cd55d65b8ef.png", "Found randomly on google images."));
        userList.add(new User("ComputerMan", "https://www.websiteplanet.com/wp-content/themes/websiteplanet/img/compressor/image1.png", "Found randomly on google search"));
        userList.add(new User("Emoji...", "https://www.pngfind.com/pngs/m/81-815205_question-face-blinking-emoji-emoji-angry-png-transparent.png", "Thinking emoji.."));
        userList.add(new User("Mario", "https://pngimg.com/uploads/mario/mario_PNG57.png", "Mario is a game character. Nintendo's very own mascot."));
        userList.add(new User("Mushroom", "https://pngimage.net/wp-content/uploads/2018/06/immagine-png-13.png", "Mushroom is a game character in the Mario franchise. Mushroom is an enemy."));
        userList.add(new User("Bruno", "https://www.remove.bg/assets/home-samples/animals_removed-04243daa39198d3ae9cd6e74cac77c58a3009f686bdd877925869cd55d65b8ef.png", "Found randomly on google images."));
        userList.add(new User("ComputerMan", "https://www.websiteplanet.com/wp-content/themes/websiteplanet/img/compressor/image1.png", "Found randomly on google search"));
        userList.add(new User("Emoji...", "https://www.pngfind.com/pngs/m/81-815205_question-face-blinking-emoji-emoji-angry-png-transparent.png", "Thinking emoji.."));
        userList.add(new User("Mario", "https://pngimg.com/uploads/mario/mario_PNG57.png", "Mario is a game character. Nintendo's very own mascot."));
        userList.add(new User("Mushroom", "https://pngimage.net/wp-content/uploads/2018/06/immagine-png-13.png", "Mushroom is a game character in the Mario franchise. Mushroom is an enemy."));
        userList.add(new User("Bruno", "https://www.remove.bg/assets/home-samples/animals_removed-04243daa39198d3ae9cd6e74cac77c58a3009f686bdd877925869cd55d65b8ef.png", "Found randomly on google images."));
        userList.add(new User("ComputerMan", "https://www.websiteplanet.com/wp-content/themes/websiteplanet/img/compressor/image1.png", "Found randomly on google search"));
        userList.add(new User("Emoji...", "https://www.pngfind.com/pngs/m/81-815205_question-face-blinking-emoji-emoji-angry-png-transparent.png", "Thinking emoji.."));

    }
}