import java.net.URL;



@SuppressWarnings("hiding")
public class Posting<URL, Integer> {
	private URL url;
	private Integer i;

	public Posting (URL url, Integer i) {
		
		this.url = url;
		this.i = i;
	}
	
	public URL getUrl() {
		
		return this.url;
	}
	
	public Integer getI() {
		
		return this.i;
	}
	public void setI(Integer i) {
		
		this.i = i;
	}
}
