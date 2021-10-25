package interfaces;

public class CustomerManager {

	// loosly -tightly coupled

	private Logger[] loggers;

	public CustomerManager(Logger[] loggers) {

		this.loggers = loggers;
		
	}

	public void add(Customer customer) {
		System.out.println("M��teri eklendi :  " + customer.getFirstName());
		
		Utils.runLogger(loggers, customer.getFirstName());

		
	}

	public void delete(Customer customer) {
		System.out.println("M��teri Silindi :  " + customer.getFirstName());
		
		Utils.runLogger(loggers, customer.getLastName());

	}

}
