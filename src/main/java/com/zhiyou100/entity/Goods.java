package com.zhiyou100.entity;

public class Goods {

	private Integer goods_id;//��Ʒ���
	private String goods_name;//��Ʒ����
	private String goods_type;//��Ʒ����
	private Double goods_price;//��Ʒ�۸�
	private Integer goods_count;//��Ʒ����
	//�޲ι���
	public Goods() {
		super();
	}
	//ȫ�ι���
	public Goods(Integer goods_id, String goods_name, String goods_type, Double goods_price, Integer goods_count) {
		super();
		this.goods_id = goods_id;
		this.goods_name = goods_name;
		this.goods_type = goods_type;
		this.goods_price = goods_price;
		this.goods_count = goods_count;
	}
	public Integer getgoods_id() {
		return goods_id;
	}
	public void setgoods_id(Integer goods_id) {
		this.goods_id = goods_id;
	}
	public String getgoods_name() {
		return goods_name;
	}
	public void setgoods_name(String goods_name) {
		this.goods_name = goods_name;
	}
	public String getgoods_type() {
		return goods_type;
	}
	public void setgoods_type(String goods_type) {
		this.goods_type = goods_type;
	}
	public Double getgoods_price() {
		return goods_price;
	}
	public void setgoods_price(Double goods_price) {
		this.goods_price = goods_price;
	}
	public Integer getgoods_count() {
		return goods_count;
	}
	public void setgoods_count(Integer goods_count) {
		this.goods_count = goods_count;
	}
	@Override
	public String toString() {
		return "goodss [goods_id=" + goods_id + ", goods_name=" + goods_name + ", goods_type=" + goods_type + ", goods_price="
				+ goods_price + ", goods_count=" + goods_count + "]";
	}
	
}
