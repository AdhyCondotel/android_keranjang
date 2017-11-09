package com.ammase.androidtroligrouping.model;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class ResponseGetKerajang{

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
			"ResponseGetKerajang{" + 
			"list_keranjang = '" + listKeranjang + '\'' + 
			"}";
		}
}