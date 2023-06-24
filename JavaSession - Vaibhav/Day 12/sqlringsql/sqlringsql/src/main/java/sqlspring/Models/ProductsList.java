package sqlspring.Models;

public class ProductsList {

	private int pId;
	private String pName;
	private String pCategory;
	private int pPrice;
	private Boolean pIsInStock;
	
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getpCategory() {
		return pCategory;
	}
	public void setpCategory(String pCategory) {
		this.pCategory = pCategory;
	}
	public int getpPrice() {
		return pPrice;
	}
	public void setpPrice(int pPrice) {
		this.pPrice = pPrice;
	}
	public Boolean getpIsInStock() {
		return pIsInStock;
	}
	public void setpIsInStock(Boolean pIsInStock) {
		this.pIsInStock = pIsInStock;
	}
	@Override
	public String toString() {
		return "ProductsList [pId=" + pId + ", pName=" + pName + ", pCategory=" + pCategory + ", pPrice=" + pPrice
				+ ", pIsInStock=" + pIsInStock + "]";
	}
	
	
	
	
	
}



















