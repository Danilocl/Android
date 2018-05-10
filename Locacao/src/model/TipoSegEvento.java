package model;

public class TipoSegEvento {

	private String idEvento;
	private Segmento idSeg;
	private int quant;

	public String getIdEvento() {
		return idEvento;
	}

	public void setIdEvento(String idEvento) {
		this.idEvento = idEvento;
	}

	public Segmento getIdSeg() {
		return idSeg;
	}

	public void setIdSeg(Segmento idSeg) {
		this.idSeg = idSeg;
	}

	public int getQuant() {
		return quant;
	}

	public void setQuant(int quant) {
		this.quant = quant;
	}

}
