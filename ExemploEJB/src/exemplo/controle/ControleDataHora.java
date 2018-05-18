package exemplo.controle;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import exemplo.ejb.DataHora;

@Named(value = "controleDataHora")
@RequestScoped
public class ControleDataHora {
	
	@EJB
	private DataHora time;

	public DataHora getTime() {
		return time;
	}

	public void setTime(DataHora time) {
		this.time = time;
	}
	
	
}
