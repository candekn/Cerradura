package ar.edu.unlam.pb2;
//Rosario Delgado, Programacion 2 UNLaM.

public class Cerradura {
	//Atributos
	private Integer contrasenia;
	private Integer intentos;
	private Boolean estado;
	//Metodos
	public Cerradura(Integer contrasenia, Integer intentos){
		this.contrasenia=contrasenia;
		if(intentos>0) //esto lo puse para que el numero de intentos ingresado no sea  negativo
			{
				this.intentos=intentos;
			}
			else
				{
					this.intentos=0;
				}
		this.estado=false;
	}
	public Boolean abrirCerradura(Integer clave){
		if(this.intentos>0)
		{
			if(clave.equals(this.contrasenia)) //Puse equals porque si ponía ==, no me comparaba correctamente más de 2 cifras
			{
				this.estado=true;
				return this.estado;
			}
			else
			{
				this.intentos=this.intentos-1;
				return this.estado;
			}
		}
		else
		{
			return this.estado;
		}
	}
	public Boolean cerrarCerradura(){
		this.estado=false;
		return this.estado;
	}
	public Integer getContrasenia(){
		return this.contrasenia;
	}
	public void setContrasenia(Integer contrasenia){
		this.contrasenia=contrasenia;
	}
	public Integer getIntentos(){
		return this.intentos;
	}
	public void setIntentos(Integer intentos){
		this.intentos=intentos;
	}												//No sabia si poner los setters de Intentos
	public Boolean getEstado(){						//y Estado, porque seria facil abrir una
		return this.estado;							//cerradura bloqueada desde estos metodos,
	}												//pero los puse igual. 
	public void setEstado(Boolean estado){
		this.estado=estado;
	}
	
	
}
