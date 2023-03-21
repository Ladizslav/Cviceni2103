
public class Cukr implements IDort{
	private IDort dort;

	public Cukr(IDort dort) {
		this.dort = dort;
	}
	public String pripravaDortu() {
		return dort.pripravaDortu() + " - s cukrem";
	}
	
	
	

	

}
