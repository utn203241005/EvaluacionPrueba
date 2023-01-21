package cdo.Persistencia;

import java.util.ArrayList;
import java.util.List;
import cdo.Datos.Usuarios;

public class GestorCatalogoUsuarios {

	public List<Usuarios> obtieneDatosUsuarios() {
		List<Usuarios> lstUsu =  new ArrayList<>();
		try {
			Usuarios usu = new Usuarios();
				usu.setId(1);
				usu.setNombre("Jose");
				usu.setEmail("jose@prueba");
				usu.setGenero("Masculino");
				usu.setEstatus(200);
			lstUsu.add(usu);
			Usuarios usu2 = new Usuarios();
				usu2.setId(2);
				usu2.setNombre("Martin");
				usu2.setEmail("martin@prueba");
				usu2.setGenero("Masculino");
				usu2.setEstatus(200);
			lstUsu.add(usu2);
			Usuarios usu3 = new Usuarios();
				usu3.setId(3);
				usu3.setNombre("Brenda");
				usu3.setEmail("brenda@prueba");
				usu3.setGenero("Femenino");
				usu3.setEstatus(500);
			lstUsu.add(usu3);
			Usuarios usu4 = new Usuarios();
				usu4.setId(4);
				usu4.setNombre("Jose");
				usu4.setEmail("jose@prueba");
				usu4.setGenero("Masculino");
				usu4.setEstatus(200);
			lstUsu.add(usu4);
			Usuarios usu5 = new Usuarios();
				usu5.setId(5);
				usu5.setNombre("Mario");
				usu5.setEmail("mario@prueba");
				usu5.setGenero("Masculino");
				usu5.setEstatus(200);
			lstUsu.add(usu5);
			Usuarios usu6 = new Usuarios();
				usu6.setId(6);
				usu6.setNombre("Karla");
				usu6.setEmail("karala@prueba");
				usu6.setGenero("Femenino");
				usu6.setEstatus(200);
			lstUsu.add(usu6);
			Usuarios usu7 = new Usuarios();
				usu7.setId(7);
				usu7.setNombre("Enrique");
				usu7.setEmail("enrique@prueba");
				usu7.setGenero("Masculino");
				usu7.setEstatus(500);
			lstUsu.add(usu7);
			Usuarios usu8 = new Usuarios();
				usu8.setId(8);
				usu8.setNombre("Nancy");
				usu8.setEmail("nancy@prueba");
				usu8.setGenero("Femenino");
				usu8.setEstatus(200);
			lstUsu.add(usu8);
			Usuarios usu9 = new Usuarios();
				usu9.setId(9);
				usu9.setNombre("ulices");
				usu9.setEmail("ulices@prueba");
				usu9.setGenero("Masculino");
				usu9.setEstatus(500);
			lstUsu.add(usu9);
			Usuarios usu10 = new Usuarios();
				usu10.setId(10);
				usu10.setNombre("Angelica");
				usu10.setEmail("angelica@prueba");
				usu10.setGenero("Femenino");
				usu10.setEstatus(500);
			lstUsu.add(usu10);
			Usuarios usu11 = new Usuarios();
				usu11.setId(11);
				usu11.setNombre("Luis");
				usu11.setEmail("luis@prueba");
				usu11.setGenero("Masculino");
				usu11.setEstatus(200);
			lstUsu.add(usu11);
			Usuarios usu12 = new Usuarios();
				usu12.setId(12);
				usu12.setNombre("Rosa");
				usu12.setEmail("rosa@prueba");
				usu12.setGenero("Femenino");
				usu12.setEstatus(200);
			lstUsu.add(usu12);
			Usuarios usu13 = new Usuarios();
				usu13.setId(13);
				usu13.setNombre("Pancho");
				usu13.setEmail("pancho@prueba");
				usu13.setGenero("Masculino");
				usu13.setEstatus(500);
			lstUsu.add(usu13);
			Usuarios usu14 = new Usuarios();
				usu14.setId(14);
				usu14.setNombre("Maria");
				usu14.setEmail("maria@prueba");
				usu14.setGenero("Femenino");
				usu14.setEstatus(200);
			lstUsu.add(usu14);
			Usuarios usu15 = new Usuarios();
				usu15.setId(15);
				usu15.setNombre("Pepe");
				usu15.setEmail("pepe@prueba");
				usu15.setGenero("Masculino");
				usu15.setEstatus(200);
			lstUsu.add(usu15);
		
		}catch(Exception e) {
			System.out.println("Ocurrio un error durante la Carga de Informacion. " + e.toString()); 
		}
		return lstUsu;
	}

	public List<Usuarios> actualizaDatosUsuario(int idUsuAct, int estatus, String email, String genero, String nombre) 
	{
		List<Usuarios> lstUsu =  new ArrayList<>();
		try {
			lstUsu = obtieneDatosUsuarios();
			for(int i=0;i<lstUsu.size();i++) {
				if(idUsuAct == lstUsu.get(i).getId()) {
					lstUsu.get(i).setNombre(nombre);
					lstUsu.get(i).setGenero(genero);
					lstUsu.get(i).setEmail(email);
					lstUsu.get(i).setEstatus(estatus);
				}
			}
			
		}catch(Exception e) {
			System.out.println("Error al actualizar Datos Usuario. " + e.toString());
		}
		
		return lstUsu;
	}

	public List<Usuarios> eliminaDatosUsuario(int idUsuAct) {
		List<Usuarios> lstUsu =  new ArrayList<>();
		try {
			lstUsu = obtieneDatosUsuarios();
			for(int i=0;i<lstUsu.size();i++) {
				if(idUsuAct == lstUsu.get(i).getId()) {
					lstUsu.remove(i);
					break;
				}
			}
		}catch(Exception e) {
			System.out.println("Error al actualizar Datos Usuario. " + e.toString());
		}
		return lstUsu;
	}

	public List<Usuarios> agregaDatosUsuario(int estatus, String email, String genero, String nombre) {
		List<Usuarios> lstUsu =  new ArrayList<>();
		try {
			lstUsu = obtieneDatosUsuarios();
			Usuarios usuNuevo = new Usuarios();
				int idNuevo = lstUsu.size();
				usuNuevo.setId(idNuevo+1);
				usuNuevo.setNombre(nombre);
				usuNuevo.setGenero(genero);
				usuNuevo.setEmail(email);
				usuNuevo.setEstatus(estatus);
			lstUsu.add(usuNuevo);
		}catch(Exception e) {
			System.out.println("Error al actualizar Datos Usuario. " + e.toString());
		}
		return lstUsu;
	}
	
}
