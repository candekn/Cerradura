package ar.edu.unlam.pb2;
//Rosario Delgado, Programacion 2 UNLaM.

public class Cerradura {
	//Atributos
	private Integer contrasenia;
	private Integer limiteDeIntentos;
	private Boolean estado;
	private Integer intentos;
	//Metodos
	public Cerradura(Integer contrasenia, Integer limiteDeIntentos){
		this.contrasenia=contrasenia;
		if(limiteDeIntentos>0) //esto lo puse para que el numero de limiteDeIntentos ingresado no sea  negativo
			{
				this.limiteDeIntentos=limiteDeIntentos;
				this.intentos=limiteDeIntentos;
			}
			else
				{
					this.limiteDeIntentos=0;
				}
		this.estado=false;
	}
	public Boolean abrirCerradura(Integer clave){
		if(this.limiteDeIntentos>0)
		{
			if(clave.equals(this.contrasenia)) //Puse equals porque si ponía ==, no me comparaba correctamente más de 2 cifras
			{
				this.estado=true;
				this.limiteDeIntentos=this.intentos;
				return this.estado;
			}
			else
			{
				this.limiteDeIntentos=this.limiteDeIntentos-1;
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
	public Integer getlimiteDeIntentos(){
		return this.limiteDeIntentos;
	}
	public void setlimiteDeIntentos(Integer limiteDeIntentos){
		this.limiteDeIntentos=limiteDeIntentos;
	}												//No sabia si poner los setters de limiteDeIntentos
	public Boolean getEstado(){						//y Estado, porque seria facil abrir una
		return this.estado;							//cerradura bloqueada desde estos metodos,
	}												//pero los puse igual. 
	public void setEstado(Boolean estado){
		this.estado=estado;
	}
	public Integer getIntentos() {
		return this.intentos;
	}
	public void setIntentos(Integer intentos) {
		this.intentos=intentos;;
	}
	
}
