package com.Grupo19OO22021.models;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.Grupo19OO22021.entities.Perfil;

public class UsuarioModel {

	private int idUsuario;
	
	@NotBlank
	@Size(min=3, max=15,message="No se cumplen las reglas del tamano (3-15)")
	private String nombreUsuario;
	
	@NotBlank
	@Size(min=3, max=15,message="No se cumplen las reglas del tamano (3-15)")
	private String nombre;
	
	@NotBlank
	@Size(min=3, max=15,message="No se cumplen las reglas del tamano(3-15)")
	private String apellido;
	
	private int tipoDocumento;
	
	@NotNull
	private int nroDocumento;
	
	@Email
	@NotBlank
	private String email;
	
	@NotBlank
	@Size(min=4, max=10,message="No se cumplen las reglas del tamano (4-10)")
	private String password;
	
	private int tipoUsuario;
	
	private boolean activo;
	
	private Perfil perfil; 
	
	public UsuarioModel() {}
	
	public UsuarioModel(int idUsuario,String nombreUsuario,
			String nombre, String apellido, int tipoDocumento,
			int nroDocumento, String email, String password, int tipoUsuario, boolean activo, Perfil perfil) {
		super();
		this.idUsuario = idUsuario;
		this.nombreUsuario = nombreUsuario;
		this.nombre = nombre;
		this.apellido = apellido;
		this.tipoDocumento = tipoDocumento;
		this.nroDocumento = nroDocumento;
		this.email = email;
		this.password = password;
		this.tipoUsuario = tipoUsuario;
		this.activo = activo;
		this.perfil = perfil;
	}


	public int getTipoUsuario() {
		return tipoUsuario;
	}


	public void setTipoUsuario(int tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}


	public int getIdUsuario() {
		return idUsuario;
	}


	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public int getNroDocumento() {
		return nroDocumento;
	}


	public void setNroDocumento(int nroDocumento) {
		this.nroDocumento = nroDocumento;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public boolean isActivo() {
		return activo;
	}


	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public int getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(int tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}
	
}
