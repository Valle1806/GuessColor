/**
 * 
 */
package Clases;
import java.util.Random;
/**
 * @author CristianV
 *
 */
public class Colores {
	private int rojo,verde,azul,auxRojo,auxVerde,auxAzul;
	private boolean flag;
	
	public Colores(){
		auxRojo=0;
		auxVerde=0;
		auxAzul=0;
		Random aleatorio= new Random();
		rojo = aleatorio.nextInt(255);
		verde= aleatorio.nextInt(255);
		azul= aleatorio.nextInt(255);
		flag=false;
	}

	public int getRojo() {
		return rojo;
	}

	public int getVerde() {
		return verde;
	}

	public int getAzul() {
		return azul;
	}
	public boolean comparar(){
		if(rojo==auxRojo && verde==auxVerde && azul==auxAzul){
			flag=true;
		}
		return flag;
	}
	public void setAuxRojoMas(){
		if(auxRojo!=255){
			auxRojo+=1;}
	}
	public void setAuxRojoMenos(){
		if(auxRojo!=0){
			auxRojo-=1;}
	}
	public void setAuxVerdeMas(){
		if(auxVerde!=255){
			auxVerde+=1;}
	}
	public void setAuxVerdeMenos(){
		if(auxVerde!=0){
		auxVerde-=1;}
	}
	public void setAuxAzulMas(){
		if(auxAzul!=255){
			auxAzul+=1;}
	}
	public void setAuxAzulMenos(){
		if(auxAzul!=0){
			auxAzul-=1;}
	}

	public int getAuxRojo() {
		return auxRojo;
	}

	public int getAuxVerde() {
		return auxVerde;
	}

	public int getAuxAzul() {
		return auxAzul;
	}
    
}
