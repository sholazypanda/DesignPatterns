
import java.util.Date;
import java.util.List;

public class CustomerTransaction implements Accounting, Reporting {
	
	
	private List<Product> products;
	private Customer customer;
	public CustomerTransaction(List<Product> products, Customer customer) {
		
		this.products = products;
		this.customer = customer;
	}
	/* (non-Javadoc)
	 * @see Reporting#getName()
	 */
	@Override
	public String getName(){
		return customer.getName();
	}
	/* (non-Javadoc)
	 * @see Reporting#getDate()
	 */
	@Override
	public Date getDate(){
		return new Date();
	}
	/* (non-Javadoc)
	 * @see Reporting#productBreakdown()
	 */
	@Override
	public String productBreakdown(){
		String reportListing="";
		for(Product p:products){
			reportListing+=p.getProductId()+" "+p.getProductName();
		}
		return reportListing;
	}
	/* (non-Javadoc)
	 * @see Accounting#prepareInvoice()
	 */
	@Override
	public void prepareInvoice(){
		System.out.println("prepare invoice");
	}
	/* (non-Javadoc)
	 * @see Accounting#chargeCustomer()
	 */
	@Override
	public void chargeCustomer(){
		System.out.println("charge customer");
	}
}
