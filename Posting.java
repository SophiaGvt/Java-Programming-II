
@SuppressWarnings("hiding")
public class Posting<String, Integer> {
	private String url;
	private Integer i;
	
	public Posting () {
		
	}

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
	public java.lang.String toString() {
		return "(" + url.toString() + ", " + i.toString() + ")";
	}
	

}
