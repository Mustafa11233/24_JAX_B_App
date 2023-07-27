package in.ashokit.binding;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class MarshalDemo {
	public static void main(String[] args) throws Exception {

		Customer c = new Customer();
		c.setId(1);
		c.setName("Raju");
		c.setPhno(12345l);
		c.setEmail("raju@gmail.com");

		JAXBContext context = JAXBContext.newInstance(Customer.class);

		Marshaller marshaller = context.createMarshaller();

		marshaller.marshal(c, new File("customer.xml"));
		
		System.out.println("xml created...");

	}

}
