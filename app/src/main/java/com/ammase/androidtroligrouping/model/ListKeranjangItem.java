package com.ammase.androidtroligrouping.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class ListKeranjangItem{

	@SerializedName("data")
	private List<DataItem> data;

	@SerializedName("kd_toko")
	private String kdToko;

	@SerializedName("nama_toko")
	private String namaToko;

	public static final int VIEW_HEADER = 0;
	public static final int VIEW_BODY = 1;
	public int type;

	public ListKeranjangItem(int type) {
		this.type = type;
	}

	public void setData(List<DataItem> data){
		this.data = data;
	}

	public List<DataItem> getData(){
		return data;
	}

	public void setKdToko(String kdToko){
		this.kdToko = kdToko;
	}

	public String getKdToko(){
		return kdToko;
	}

	public void setNamaToko(String namaToko){
		this.namaToko = namaToko;
	}

	public String getNamaToko(){
		return namaToko;
	}


	@Override
 	public String toString(){
		return 
			"ListKeranjangItem{" + 
			"data = '" + data + '\'' + 
			",kd_toko = '" + kdToko + '\'' + 
			",nama_toko = '" + namaToko + '\'' + 
			"}";
		}
}