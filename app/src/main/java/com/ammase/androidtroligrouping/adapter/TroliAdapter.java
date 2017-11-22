package com.ammase.androidtroligrouping.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.ammase.androidtroligrouping.R;
import com.ammase.androidtroligrouping.model.ListKeranjangItem;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
/**
 * Created by Lincoln on 31/03/16.
 */

public class TroliAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>  {
    private List<ListKeranjangItem> resultsList;
    private Context mContext;
    int total_types;

    public TroliAdapter(Context context, List<ListKeranjangItem> resultsList) {
        this.mContext = context;
        this.resultsList = resultsList;
        total_types = resultsList.size();
    }

    public void setListItem(List<ListKeranjangItem> listItemAllProduk) {
        this.resultsList = listItemAllProduk;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;
        switch (viewType) {
            case ListKeranjangItem.VIEW_HEADER:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_header, parent, false);
                return new MyViewHeader(view);
            case ListKeranjangItem.VIEW_BODY:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_body, parent, false);
                return new MyViewBody(view);
        }
        return null;
    }

    @Override
    public int getItemViewType(int position) {
        switch (resultsList.get(position).type) {
            case 0:
                return ListKeranjangItem.VIEW_HEADER;
            case 1:
                return ListKeranjangItem.VIEW_BODY;
            default:
                return -1;
        }
    }

    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, final int listPosition) {
        ListKeranjangItem object = resultsList.get(listPosition);
        if (object != null) {
            switch (object.type) {
                case ListKeranjangItem.VIEW_HEADER:
                    ((MyViewHeader) holder).textViewHeader.setText(object.getNamaToko());
                    break;
                case ListKeranjangItem.VIEW_BODY:
                    ((MyViewBody) holder).textViewNama.setText(object.getData().get(listPosition).getNamaProduk());
                    ((MyViewBody) holder).textViewAlamat.setText(object.getData().get(listPosition).getHargaSatuan());
                    break;
            }
        }
    }

    @Override
    public int getItemCount() {
        return resultsList.size();
    }

    public class MyViewHeader extends RecyclerView.ViewHolder {
        @BindView(R.id.textViewHeader) TextView textViewHeader;
        public MyViewHeader(View view) {
            super(view);
            ButterKnife.bind(this, view);

        }
    }

    public class MyViewBody extends RecyclerView.ViewHolder {
        @BindView(R.id.textViewNama) TextView textViewNama;
        @BindView(R.id.textViewAlamat) TextView textViewAlamat;

        public MyViewBody(View view) {
            super(view);
            ButterKnife.bind(this, view);

        }
    }
}