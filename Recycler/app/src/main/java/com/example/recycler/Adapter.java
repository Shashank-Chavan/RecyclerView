package com.example.recycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
import java.util.jar.Attributes;

public class Adapter extends RecyclerView.Adapter<Adapter.MyAdapter> {
    private List<String> name;
    private List<String> followers;
    private List<String> contributions;
    public Adapter(List<String> name,List<String> followers,List<String> contributions){
        this.name = name;
        this.followers = followers;
        this.contributions = contributions;
    }
    @NonNull
    @Override
    public MyAdapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view;
        if(viewType==0){
        view = inflater.inflate(R.layout.cell_a,parent,false);
            return new MyAdapter(view);
        }
        else {
            view = inflater.inflate(R.layout.cell_b,parent,false);
            return new MyAdapter(view);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter holder, int position) {

        if(position%3==0) {
            MyAdapter myAdapter = (MyAdapter) holder;
            myAdapter.A_name.setText(name.get(position));
            myAdapter.A_Followers.setText(followers.get(position));
            myAdapter.A_Contributions.setText(contributions.get(position));

        }
        else {
           // MyAdapter2 myAdapter2 = (MyAdapter2) holder;

        }
    }

    @Override
    public int getItemCount() {
        return name.size();
    }
    class MyAdapter extends RecyclerView.ViewHolder {

        TextView A_name;
        TextView A_Followers;
        TextView A_Contributions;
        public MyAdapter(@NonNull View itemView) {
            super(itemView);
            A_name = (TextView) itemView.findViewById(R.id.Name);
            A_Followers = (TextView) itemView.findViewById(R.id.Followera);
            A_Contributions = (TextView) itemView.findViewById(R.id.Contributions);

        }
    }
    public  class MyAdapter2 extends RecyclerView.ViewHolder {

        TextView A_name2, A_Followers2, A_Contributions2;
        public MyAdapter2(@NonNull View itemView) {
            super(itemView);
            A_name2 = (TextView) itemView.findViewById(R.id.Name2);
            A_Followers2 = (TextView) itemView.findViewById(R.id.Followers2);
            A_Contributions2 = (TextView) itemView.findViewById(R.id.Contributions2);

        }


    }
}
