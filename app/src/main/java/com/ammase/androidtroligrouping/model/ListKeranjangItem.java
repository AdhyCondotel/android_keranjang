package com.ammase.androidtroligrouping.model;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class ListKeranjangItem{

	@SerializedName("data")
	private List<DataItem> data;

	@SerializedName("kd_toko")
	private String kdToko;

	@SerializedName("nama_toko")
	private String namaToko;

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