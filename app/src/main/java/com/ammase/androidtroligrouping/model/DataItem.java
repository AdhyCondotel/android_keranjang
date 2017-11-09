package com.ammase.androidtroligrouping.model;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class DataItem{

	@SerializedName("keterangan")
	private String keterangan;

	@SerializedName("totalharga")
	private String totalharga;

	@SerializedName("kd_produk")
	private String kdProduk;

	@SerializedName("gambar_produk")
	private String gambarProduk;

	@SerializedName("nama_toko")
	private String namaToko;

	@SerializedName("nama_produk")
	private String namaProduk;

	@SerializedName("harga_satuan")
	private String hargaSatuan;

	@SerializedName("updated_at")
	private String updatedAt;

	@SerializedName("kd_toko")
	private String kdToko;

	@SerializedName("jenis_produk")
	private String jenisProduk;

	@SerializedName("qty")
	private String qty;

	@SerializedName("kd_keranjang")
	private int kdKeranjang;

	@SerializedName("email")
	private String email;

	@SerializedName("diskon")
	private String diskon;

	public void setKeterangan(String keterangan){
		this.keterangan = keterangan;
	}

	public String getKeterangan(){
		return keterangan;
	}

	public void setTotalharga(String totalharga){
		this.totalharga = totalharga;
	}

	public String getTotalharga(){
		return totalharga;
	}

	public void setKdProduk(String kdProduk){
		this.kdProduk = kdProduk;
	}

	public String getKdProduk(){
		return kdProduk;
	}

	public void setGambarProduk(String gambarProduk){
		this.gambarProduk = gambarProduk;
	}

	public String getGambarProduk(){
		return gambarProduk;
	}

	public void setNamaToko(String namaToko){
		this.namaToko = namaToko;
	}

	public String getNamaToko(){
		return namaToko;
	}

	public void setNamaProduk(String namaProduk){
		this.namaProduk = namaProduk;
	}

	public String getNamaProduk(){
		return namaProduk;
	}

	public void setHargaSatuan(String hargaSatuan){
		this.hargaSatuan = hargaSatuan;
	}

	public String getHargaSatuan(){
		return hargaSatuan;
	}

	public void setUpdatedAt(String updatedAt){
		this.updatedAt = updatedAt;
	}

	public String getUpdatedAt(){
		return updatedAt;
	}

	public void setKdToko(String kdToko){
		this.kdToko = kdToko;
	}

	public String getKdToko(){
		return kdToko;
	}

	public void setJenisProduk(String jenisProduk){
		this.jenisProduk = jenisProduk;
	}

	public String getJenisProduk(){
		return jenisProduk;
	}

	public void setQty(String qty){
		this.qty = qty;
	}

	public String getQty(){
		return qty;
	}

	public void setKdKeranjang(int kdKeranjang){
		this.kdKeranjang = kdKeranjang;
	}

	public int getKdKeranjang(){
		return kdKeranjang;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return email;
	}

	public void setDiskon(String diskon){
		this.diskon = diskon;
	}

	public String getDiskon(){
		return diskon;
	}

	@Override
 	public String toString(){
		return 
			"DataItem{" + 
			"keterangan = '" + keterangan + '\'' + 
			",totalharga = '" + totalharga + '\'' + 
			",kd_produk = '" + kdProduk + '\'' + 
			",gambar_produk = '" + gambarProduk + '\'' + 
			",nama_toko = '" + namaToko + '\'' + 
			",nama_produk = '" + namaProduk + '\'' + 
			",harga_satuan = '" + hargaSatuan + '\'' + 
			",updated_at = '" + updatedAt + '\'' + 
			",kd_toko = '" + kdToko + '\'' + 
			",jenis_produk = '" + jenisProduk + '\'' + 
			",qty = '" + qty + '\'' + 
			",kd_keranjang = '" + kdKeranjang + '\'' + 
			",email = '" + email + '\'' + 
			",diskon = '" + diskon + '\'' + 
			"}";
		}
}