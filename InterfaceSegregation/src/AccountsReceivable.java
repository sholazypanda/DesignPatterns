
public class AccountsReceivable {
	private Accounting transactionObject;

	public AccountsReceivable(Accounting transactionObject) {
		super();
		this.transactionObject = transactionObject;
	}
	public void postPayments(){
		transactionObject.chargeCustomer();
	}
	public void sendInvoice(){
		transactionObject.prepareInvoice();
	}
}
