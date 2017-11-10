package com.ammase.androidtroligrouping.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.ammase.androidtroligrouping.Const;
import com.ammase.androidtroligrouping.R;
import com.ammase.androidtroligrouping.model.ListKeranjangItem;
import com.bumptech.glide.Glide;

import java.text.DecimalFormat;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Lincoln on 31/03/16.
 */

public class TroliAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>  {
    private List<ListKeranjangItem> resultsList;
    private Context mContext;

    public static final int WithoutImage=1,WithImage=0;

    public TroliAdapter(Context context, List<ListKeranjangItem> resultsList) {
        this.mContext = context;
        this.resultsList = resultsList;
    }

    public void setListItem(List<ListKeranjangItem> listItemAllProduk) {
        this.resultsList = listItemAllProduk;
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view;
        switch (viewType){
            case WithImage:
                view=LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_header,parent,false);
                MyViewHolderHeader imageViewHolder=new MyViewHolderHeader(view);
                return imageViewHolder;

            case WithoutImage:
                view=LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_keranjang,parent,false);
                MyViewHolder withoutImageViewHolder=new MyViewHolder(view);
                return withoutImageViewHolder;
        }
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {
        //DecimalFormat formatter = new DecimalFormat("#,###,###");
        switch (resultsList.get(position).getData()){
            case WithImage:
                ((ImageViewHolder) holder).imageView.setImageResource(dataList.get(position).photo);
                ((ImageViewHolder) holder).title.setText(dataList.get(position).title);
                ((ImageViewHolder) holder).about.setText(dataList.get(position).about);
                break;
            case WithoutImage:
                ((WithoutImageViewHolder) holder).title.setText(dataList.get(position).title);
                ((WithoutImageViewHolder) holder).about.setText(dataList.get(position).about);
                break;
        }

    }

    @Override
    public int getItemCount() {
        return resultsList.size();
    }


    @Override
    public int getItemViewType(int position) {
        if (resultsList.get(position).getData() == WithImage) {
            return WithImage;}
        return WithoutImage;
    }

    public class MyViewHolderHeader extends RecyclerView.ViewHolder {
        @BindView(R.id.textViewToko) ImageView textViewToko;

        public MyViewHolderHeader(View view) {
            super(view);
            ButterKnife.bind(this, view);

        }
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.textViewNama) TextView textViewNama;
        @BindView(R.id.textViewHarga) TextView textViewHarga;

        public MyViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);

        }
    }



}