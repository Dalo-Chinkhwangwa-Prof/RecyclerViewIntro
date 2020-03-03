package com.bb.mylistapplication.adapter;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bb.mylistapplication.R;
import com.bb.mylistapplication.model.User;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder> {

    private List<User> userList;

    public UserAdapter(List<User> userList) {
        this.userList = userList;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.user_item_layout, parent, false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        Animation slide = AnimationUtils.loadAnimation(holder.itemView.getContext(), R.anim.right_to_left);
        holder.itemView.startAnimation(slide);


        holder.descriptionTextView.setText(userList.get(position).getDescription());
        holder.userNameTextView.setText(userList.get(position).getName());

        //Load Image with Glide
        Glide.with(holder.itemView.getContext())
                .applyDefaultRequestOptions(RequestOptions.circleCropTransform())
                .load(userList.get(position).getPicUrl())
                .into(holder.profileImageView);


    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    class UserViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.avatar_imageview)
        ImageView profileImageView;
        @BindView(R.id.name_textview)
        TextView userNameTextView;
        @BindView(R.id.description_textview)
        TextView descriptionTextView;

        public UserViewHolder(@NonNull View itemView) {
            super(itemView);

            ButterKnife.bind(this, itemView);
//            Without butterKnife
//            profileImageView = itemView.findViewById(R.id.avatar_imageview);
//            userNameTextView = itemView.findViewById(R.id.name_textview);
//            descriptionTextView = itemView.findViewById(R.id.description_textview);
        }
    }

}
