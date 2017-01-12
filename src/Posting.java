/**
 * Παραμετρικός τύπος Posting χρησιμοποιείται για να δίνονται τιμές στις λέξεις
 * του map
 * @author amitsa
 *
 * @param <String> το url που παίρνουμε από τον crawler
 * @param <Integer> πόσες φορές εμφανίζεται η λέξη μέσα στο αρχείο που δείχνει 
 * το συγκεκριμένο url
 */
@SuppressWarnings("hiding")
public class Posting<String, Integer> {
	private String url;
	private Integer i;

	public Posting (String url, Integer i) {
		
		this.url = url;
		this.i = i;
	}
	
	public void setUrl(String url) {
		
		this.url = url;
	}
	
	public String getUrl() {
		
		return this.url;
	}
	
	public Integer getI() {
		
		return this.i;
	}
	public void setI(Integer i) {
		
		this.i = i;
	}
	
	public Posting () {}
	public java.lang.String toString() {
		return "(" + url.toString() + ", " + i.toString() + ")";
	}
	

}
