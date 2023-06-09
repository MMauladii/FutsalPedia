package com.example.FutsalPedia;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.FutsalPedia.databinding.PostItemBinding;

import java.util.ArrayList;
import java.util.List;

public class PostViewAdapter extends RecyclerView.Adapter<PostViewAdapter.ViewHolder> {

    private List<Post> data = new ArrayList<>();
     private OnItemLongClickListener onItemLongClickListener;

    public void setData(List<Post> data) {
        this.data = data;
        notifyDataSetChanged();
    }

    public void setOnItemLongClickListener(OnItemLongClickListener onItemLongClickListener) { //update post
        this.onItemLongClickListener = onItemLongClickListener;
    }

    @NonNull
    @Override
    public PostViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(PostItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        int pos = holder.getAdapterPosition();
        Post post = data.get(pos);
        holder.postItemBinding.tvFoto.setText(post.getFoto());
        holder.postItemBinding.tvUsername.setText(post.getUsername());
        holder.postItemBinding.tvContent.setText(post.getContent());
        holder.postItemBinding.tvCreatedDate.setText(post.getCreated_date());



        holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                onItemLongClickListener.onItemLongClick(v, pos);
                return false;
            }
        });

    }

    @Override
    public int getItemCount() {
        return data.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        private PostItemBinding postItemBinding;
        public ViewHolder(@NonNull PostItemBinding itemView) {
            super(itemView.getRoot());
            postItemBinding = itemView;
        }
    }

    public interface OnItemLongClickListener {
        void onItemLongClick(View v, int position);
    }
}

