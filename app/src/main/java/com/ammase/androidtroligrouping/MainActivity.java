package com.ammase.androidtroligrouping;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.ammase.androidtroligrouping.adapter.TroliAdapter;
import com.ammase.androidtroligrouping.model.ListKeranjangItem;
import com.ammase.androidtroligrouping.model.ResponseTroli;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements TroliView {

    private TroliPresenter presenter;
    private List<ListKeranjangItem> listItem;
    private TroliAdapter mAdapter;

    @BindView(R.id.recyclerView) RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        InitComponent();
        presenter = new  TroliPresenter(this);
        presenter.LoadData(getResources().getString(R.string.Auth), getResources().getString(R.string.token_device));

    }

    private void InitComponent() {
        LinearLayoutManager horizontalLayoutManagaer = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(horizontalLayoutManagaer);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        mAdapter = new TroliAdapter (this, new ArrayList<>());
        recyclerView.setAdapter(mAdapter);
    }

    @Override
    public void handleLoadError(Throwable throwable) {
        Log.v("DATAERROR :", throwable.getMessage());
    }

    @Override
    public void handleLoadSuccess(ResponseTroli responseAuth) {
        this.listItem = new ArrayList<>(responseAuth.getListKeranjang());
        mAdapter.setListItem(listItem);
        mAdapter.notifyDataSetChanged();
    }
}
