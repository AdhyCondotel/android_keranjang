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

public class TroliAdapter extends RecyclerView.Adapter<TroliAdapter.MyViewHolder>  {
    private List<ListKeranjangItem> resultsList;
    private Context mContext;

    public TroliAdapter(Context context, List<ListKeranjangItem> resultsList) {
        this.mContext = context;
        this.resultsList = resultsList;
    }

    public void setListItem(List<ListKeranjangItem> listItemAllProduk) {
        this.resultsList = listItemAllProduk;
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_list_keranjang_, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        DecimalFormat formatter = new DecimalFormat("#,###,###");
        Glide.with(mContext).load(Const.BASE_URL+"/m/img/produk/"+resultsList.get(position).getGambarProduk()).into(holder.imgProduk);
        holder.txt_name.setText(resultsList.get(position).getNamaProduk().toString());
        holder.txt_toko.setText("Dijual oleh "+resultsList.get(position).getNamaToko().toString());
        holder.textViewJumlah.setText(String.valueOf("Jumlah : "+ resultsList.get(position).getQty()));
        holder.txt_total.setText("Rp "+formatter.format(Integer.valueOf(resultsList.get(position).getTotalharga())) );
        if ((resultsList.get(position).getDiskon()) > 0 ) {
            holder.txtKeterangan.setText("Harga termasuk potongan  " + (Integer.valueOf(resultsList.get(position).getDiskon()))+"%" );
        } else {
            holder.txtKeterangan.setText("");
        }

        if (resultsList.get(position).getJenisProduk().toString().equals("langganan")) {
            holder.textViewJenis.setText("Paket " + resultsList.get(position).getJenisProduk().toString() +
                    "\n" + resultsList.get(position).getKeterangan().toString());

        }else if (resultsList.get(position).getJenisProduk().toString().equals("ultah")) {
            holder.textViewJenis.setText("Paket " + resultsList.get(position).getJenisProduk().toString() +
                    "\n" + resultsList.get(position).getKeterangan().toString());
        }else {
            holder.textViewJenis.setText("");
        }
        holder.delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SessionManager = PrefUtils.getCurrentUser(mContext);
                presenter = new KeranjangPresenter((KeranjangActivity) mContext);
                presenter.DelDataKeranjang(SessionManager.getToken(), resultsList.get(position).getKdKeranjang());
            }
        });
    }

    @Override
    public int getItemCount() {
        return resultsList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.imageViewProduk) ImageView imgProduk;
        @BindView(R.id.textViewNamaProduk) TextView txt_name;
        @BindView(R.id.textViewNamaToko) TextView txt_toko;
        @BindView(R.id.textViewJumlah) TextView textViewJumlah;
        @BindView(R.id.textViewTotalHarga) TextView txt_total;
        @BindView(R.id.textViewKeterangan) TextView txtKeterangan;
        @BindView(R.id.imageButtonHapus) ImageButton delete;

        @BindView(R.id.textViewJenis) TextView textViewJenis;

        public MyViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);

        }
    }
}