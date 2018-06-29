package Control;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import model.Hospede;
import model.dao.HospedeDAO;
@Named(value = "controlHospede")
@SessionScoped
public class ControlHospede implements Serializable {
	
	@EJB
	private HospedeDAO dao;
	private Hospede hospede = new Hospede();
	
	public void insert() {
		dao.inserir(hospede);
	}
	
	public void delete() {
		dao.delete(hospede.getId());
	}
	
	public void update() {
		dao.update(hospede);
	}
	
	public Hospede buscaPorId() {
		return dao.buscaPorId(hospede.getId());
	}

	public List<Hospede> listar() {
		return dao.listAll();
	}

	public HospedeDAO getDao() {
		return dao;
	}

	public void setDao(HospedeDAO dao) {
		this.dao = dao;
	}

	public Hospede getHospede() {
		return hospede;
	}

	public void setHospede(Hospede hospede) {
		this.hospede = hospede;
	}
	
	
	

}