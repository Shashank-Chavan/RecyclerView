package com.example.recycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;

import java.util.List;

public class ViewAdapter extends RecyclerView.Adapter {
    private List<String> name;
    private List<String> followers;
    private List<String> contributions;
    public ViewAdapter(List<String> name,List<String> followers,List<String> contributions){
        this.name = name;
        this.followers = followers;
        this.contributions = contributions;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view;
        if(viewType==0){
            view = inflater.inflate(R.layout.cell_a,parent,false);
            return new Holder1(view);
        }

            view = inflater.inflate(R.layout.cell_b,parent,false);
            return  new Holder2(view);

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if(position%3==0){
            Holder1 holder1 = (Holder1) holder;
            holder1.A_name.setText(name.get(position));
            holder1.A_followers.setText(followers.get(position));
            holder1.A_contributions.setText(contributions.get(position));
        }
        else{
            Holder2 holder2 = (Holder2) holder;
            holder2.A_name2.setText(name.get(position));
            holder2.A_followers2.setText(followers.get(position));
            holder2.A_contributions2.setText(contributions.get(position));
        }
    }

    @Override
    public int getItemCount() {
        return name.size();
    }
    class Holder1 extends RecyclerView.ViewHolder{
        TextView A_name;
        TextView A_followers;
        TextView A_contributions;
        public Holder1(@NonNull View itemView) {
            super(itemView);
            A_name = itemView.findViewById(R.id.Name);
            A_followers = itemView.findViewById(R.id.Followera);
            A_contributions = itemView.findViewById(R.id.Contributions);
        }
    }
    class Holder2 extends RecyclerView.ViewHolder{
        TextView A_name2;
        TextView A_followers2;
        TextView A_contributions2;
        public Holder2(@NonNull View itemView) {
            super(itemView);
            A_name2 = itemView.findViewById(R.id.Name2);
            A_followers2 = itemView.findViewById(R.id.Followers2);
            A_contributions2 = itemView.findViewById(R.id.Contributions2);
        }
    }
}
