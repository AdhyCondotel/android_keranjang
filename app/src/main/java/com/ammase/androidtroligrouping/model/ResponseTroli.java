package com.ammase.androidtroligrouping.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class ResponseTroli{

	@SerializedName("list_keranjang")
	private List<ListKeranjangItem> listKeranjang;

	public void setListKeranjang(List<ListKeranjangItem> listKeranjang){
		this.listKeranjang = listKeranjang;
	}

	public List<ListKeranjangItem> getListKeranjang(){
		return listKeranjang;
	}

	@Override
 	public String toString(){
		return 
			"ResponseTroli{" + 
			"list_keranjang = '" + listKeranjang + '\'' + 
			"}";
		}
}