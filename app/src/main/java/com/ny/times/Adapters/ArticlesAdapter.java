package com.ny.times.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.ny.times.Interface.ArticleItemClickListener;
import com.ny.times.Models.Result;
import com.ny.times.R;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class ArticlesAdapter extends RecyclerView.Adapter<ArticlesAdapter.ViewHolder> {

    private List<Result> articlesList;
    private Context context;
    private ArticleItemClickListener listener;

    public ArticlesAdapter(List<Result> articlesList, Context context, ArticleItemClickListener listener) {
        this.articlesList = articlesList;
        this.context = context;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.
                from(parent.getContext()).
                inflate(R.layout.article_item, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
//        Glide.with(context)
//                .load(articlesList.get(position).getUrl())
//                .placeholder(R.drawable.ic_launcher_background)
//                .into(holder.image);

        holder.name.setText(articlesList.get(position).getTitle());
        holder.author_2.setText(articlesList.get(position).getSection());
        holder.author.setText(articlesList.get(position).getTitle());
        holder.date.setText(articlesList.get(position).getPublishedDate());


        holder.item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.selectedItem(articlesList.get(position));
            }
        });
    }

    @Override
    public int getItemCount() {
        return articlesList.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView name;
        private TextView author;
        private TextView author_2;
        private TextView date;
        private CircleImageView image;
        private RelativeLayout item;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            image = itemView.findViewById(R.id.image);
            date = itemView.findViewById(R.id.date);
            author_2 = itemView.findViewById(R.id.author_2);
            author = itemView.findViewById(R.id.author);
            item = itemView.findViewById(R.id.item);
        }
    }
}
