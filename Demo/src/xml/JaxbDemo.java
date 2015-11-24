package xml;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class JaxbDemo {
	public static void main(String[] args) {
		// Customer customer = new Customer();
		// customer.setId(100);
		// customer.setName("suo");
		// customer.setAge(29);
		//
		// Book book = new Book();
		// book.setId("1");
		// book.setName("哈里波特");
		// book.setPrice(100);
		//
		// Book book2 = new Book();
		// book2.setId("2");
		// book2.setName("苹果");
		// book2.setPrice(50);
		//
		// Set<Book> bookSet = new HashSet<Book>();
		// bookSet.add(book);
		// bookSet.add(book2);
		//
		// customer.setBook(bookSet);
		// marshal
		// try {
		// File file = new File("D:\\customer.xml");
		// JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
		// Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
		// jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		// jaxbMarshaller.marshal(customer, file);
		// jaxbMarshaller.marshal(customer, System.out);
		// } catch (JAXBException e) {
		// e.printStackTrace();
		// }
		// unmarshal
		try {
			File file = new File("D:\\customer.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Customer customer = (Customer) jaxbUnmarshaller.unmarshal(file);
			System.out.println(customer);
		} catch (JAXBException e) {
			e.printStackTrace();
		}

	}
}
