package pe.com.cotic.test.modelo;

// Generated 23/10/2017 02:29:43 PM by Hibernate Tools 3.4.0.CR1

/**
 * Rolmenu generated by hbm2java
 */
public class Rolmenu implements java.io.Serializable {

	private Integer codigoRolMenu;
	private Rol rol;
	private Menu menu;

	public Rolmenu() {
	}

	public Rolmenu(Rol rol, Menu menu) {
		this.rol = rol;
		this.menu = menu;
	}

	public Integer getCodigoRolMenu() {
		return this.codigoRolMenu;
	}

	public void setCodigoRolMenu(Integer codigoRolMenu) {
		this.codigoRolMenu = codigoRolMenu;
	}

	public Rol getRol() {
		return this.rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

	public Menu getMenu() {
		return this.menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

}
