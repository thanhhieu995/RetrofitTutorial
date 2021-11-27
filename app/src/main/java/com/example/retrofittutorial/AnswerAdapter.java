package com.example.retrofittutorial;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.retrofittutorial.data.model.Item;

import java.util.List;

public class AnswerAdapter extends RecyclerView.Adapter<AnswerAdapter.ViewHolder> {
    private List<Item> itemList;
    private Context context;
    private PostItemListener postItemListener;

    public AnswerAdapter(List<Item> itemList, Context context, PostItemListener postItemListener) {
        this.itemList = itemList;
        this.context = context;
        this.postItemListener = postItemListener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View view = inflater.inflate(android.R.layout.simple_list_item_1, parent, false);

        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Item item = itemList.get(position);
        TextView textView = holder.titleTV;
        textView.setText(item.getOwner().getDisplayName());
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView titleTV;
        PostItemListener mItemListener;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            titleTV = itemView.findViewById(android.R.id.text1);
            this.mItemListener = postItemListener;
            itemView.setOnClickListener((View.OnClickListener) this);
        }
    }

    public interface PostItemListener {
         void onPostClick(long id);
    }
}
