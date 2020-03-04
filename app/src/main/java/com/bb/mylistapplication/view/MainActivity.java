package com.bb.mylistapplication.view;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bb.mylistapplication.R;
import com.bb.mylistapplication.adapter.UserAdapter;
import com.bb.mylistapplication.model.User;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements UserAdapter.UserClickListener {


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
        userRecyclerView.setAdapter(new UserAdapter(userList, this));
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

    }

    @Override
    public void displayUser(User user) {


        String date = new SimpleDateFormat("mm/dd/yyyy HH:mm", Locale.US).format(new Date());

        Log.d("TAG_X", "user click item received "+ user.getName() + " ON DATE :" +date);


        Intent displayIntent = new Intent(this, DisplayUserActivity.class);
        displayIntent.putExtra(DisplayUserActivity.USER_KEY, user);
        startActivity(displayIntent);

    }

}