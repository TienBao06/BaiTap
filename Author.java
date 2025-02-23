public class Author {
public String name;
public String email;
public char gender;
public int qty;
public Author author;
public double price;
public int getQty() {
	return qty;
}
public void setQty(int qty) {
	this.qty = qty;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getName() {
	return name;
}
public String getEmail() {
	return email;
}
public char getGender() {
	return gender;
}
public Author getAuthor() {
	return author;
}
@Override
public String toString() {
	return "Book [name=" + name + ", email=" + email + ", gender=" + gender + ", qty=" + qty + ", author=" + author
			+ ", price=" + price + "]";
}
}
