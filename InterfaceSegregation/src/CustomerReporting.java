
public class CustomerReporting {
	private Reporting transactionObject;

	public CustomerReporting(Reporting transactionObject) {
		super();
		this.transactionObject = transactionObject;
	}
	public void generateReport(){
		System.out.println(transactionObject.getName()+" "+transactionObject.productBreakdown()+" "+transactionObject.getDate());
	}
	
}
