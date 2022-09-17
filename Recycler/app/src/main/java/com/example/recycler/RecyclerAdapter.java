package com.example.recycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter {
    private static final String TAG = "RecyclerAdapter";
    List<GIT> git;


    public RecyclerAdapter(List<GIT> git) {
        this.git = git;
    }

    @Override
    public int getItemViewType(int position) {
        if(position%3==0){
            return 0;
        }
        else {
            return 1;
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view;
        if (viewType == 0) {
            view = layoutInflater.inflate(R.layout.cell_a, parent, false);
            return new ViewHolderOne(view);
        }

        view = layoutInflater.inflate(R.layout.cell_b, parent, false);
        return new ViewHolderTwo(view);
    }


    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        final GIT g = git.get(position);
         if (position % 3 == 0) {
            ViewHolderOne viewHolderOne = (ViewHolderOne) holder;
            viewHolderOne.A_name.setText(g.getName());
             viewHolderOne.A_Contributions.setText(g.getContri());
             viewHolderOne.A_Followers.setText(g.getFoll());
             String data_name = g.getName().toString();
             String data_Contri = g.getContri().toString();
             String data_Foll = g.getFoll().toString();
             holder.itemView.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View view) {
                    Toast.makeText(view.getContext(),"Name - " + data_name + " | Contributions - " + data_Contri + " | Followers - " + data_Foll,Toast.LENGTH_SHORT).show();
                 }
             });
        } else {
            ViewHolderTwo viewHolderTwo = (ViewHolderTwo) holder;
             viewHolderTwo.A_name2.setText(g.getName());
             viewHolderTwo.A_Contributions2.setText(g.getContri());
             viewHolderTwo.A_Followers2.setText(g.getFoll());
             String data_name = g.getName().toString();
             String data_Contri = g.getContri().toString();
             String data_Foll = g.getFoll().toString();
             holder.itemView.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View view) {
                     Toast.makeText(view.getContext(),"Name - " + data_name + " | Contributions - " + data_Contri + " | Followers - " + data_Foll,Toast.LENGTH_SHORT).show();
                 }
             });
        }
    }

    @Override
    public int getItemCount() {
        return git.size();
    }

    class ViewHolderOne extends RecyclerView.ViewHolder {

        TextView A_name;
        TextView A_Followers;
        TextView A_Contributions;
        public ViewHolderOne(@NonNull View itemView) {
            super(itemView);
            A_name = (TextView) itemView.findViewById(R.id.Name);
            A_Followers = (TextView) itemView.findViewById(R.id.Followera);
            A_Contributions = (TextView) itemView.findViewById(R.id.Contributions);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(view.getContext(),"this is rada",Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
    class ViewHolderTwo extends RecyclerView.ViewHolder {

        TextView A_name2, A_Followers2, A_Contributions2;
        public ViewHolderTwo(@NonNull View itemView) {
            super(itemView);
            A_name2 = (TextView) itemView.findViewById(R.id.Name2);
            A_Followers2 = (TextView) itemView.findViewById(R.id.Followers2);
            A_Contributions2 = (TextView) itemView.findViewById(R.id.Contributions2);


        }


        }
    }

