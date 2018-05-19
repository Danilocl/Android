package exemplo.controle;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import exemplo.ejb.Calculadora;

@Named(value = "controleCalculadora")
@RequestScoped
public class Controlecalculadora {

	@EJB
	private Calculadora calculadora;

	public Calculadora getCalculadora() {
		return calculadora;
	}

	public void setCalculadora(Calculadora calculadora) {
		this.calculadora = calculadora;
	}

}
