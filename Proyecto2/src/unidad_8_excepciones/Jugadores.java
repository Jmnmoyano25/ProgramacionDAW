package unidad_8_excepciones;

public class Jugadores  implements Comparable {
	String sNombre;
	String sPoder;
	
	@Override
	public int compareTo(Object arg0) {
		Jugadores miJug = (Jugadores) arg0;
		int iValRet = 0;
		
		if(this.sNombre.equals(miJug.sNombre))
		{
			iValRet = this.sPoder.compareTo(miJug.sPoder);
		}
		else
		{
			iValRet = this.sNombre.compareTo(miJug.sNombre);
		}
		
		
		return iValRet;
	}
	
	
}
