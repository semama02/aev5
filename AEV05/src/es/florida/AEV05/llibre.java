package es.florida.AEV05;

public class llibre {
	private int identificador;
	private String titol;
	private String autor;
	private String any_naixement;
	private String any_publicacio;
	private String editorial;
	private String num_pags;

	
	llibre() {
		
	}
	
	//	M�tode: Llibre
	//	Descripci�: creem els atributs d'un llibre
	//	Parametres d'entrada: titol, autor, any_naixement, any_publicacio, editorial, num_pags
	//	Parametres d'eixida: ning�n
	llibre (String titol, String autor, String any_naixement ,String any_publicacio, String editorial, String num_pags){
		this.titol = titol;
		this.autor = autor;
		this.any_naixement = any_naixement;
		this.any_publicacio = any_publicacio;
		this.editorial = editorial;
		this.num_pags = num_pags;
	}

	//	M�tode: getIdentificador
	//	Descripci�: creem el getter
	//	Parametres d'entrada: ning�n
	//	Parametres d'eixida: identificador
	public int getIdentificador() {
		return identificador;
	}

	//	M�tode: setIdentificador
	//	Descripci�: creem el setter
	//	Parametres d'entrada: identificador
	//	Parametres d'eixida: ning�n
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	//	M�tode: getTitol
	//	Descripci�: creem el getter
	//	Parametres d'entrada: ning�n
	//	Parametres d'eixida: titol
	public String getTitol() {
		return titol;
	}

	//	M�tode: setTitol
	//	Descripci�: creem el setter
	//	Parametres d'entrada: titol
	//	Parametres d'eixida: ning�n
	public void setTitol(String titol) {
		this.titol = titol;
	}

	//	M�tode: getAutor
	//	Descripci�: creem el getter
	//	Parametres d'entrada: ning�n
	//	Parametres d'eixida: autor
	public String getAutor() {
		return autor;
	}

	//	M�tode: setAutor
	//	Descripci�: creem el setter
	//	Parametres d'entrada: autor
	//	Parametres d'eixida: ning�n
	public void setAutor(String autor) {
		this.autor = autor;
	}

	//	M�tode: getAny_publicacio
	//	Descripci�: creem el getter
	//	Parametres d'entrada: ning�n
	//	Parametres d'eixida: any_naixement
	public String getAny_naixement() {
		return any_naixement;
	}

	//	M�tode: setAny_publicacio
	//	Descripci�: creem el setter
	//	Parametres d'entrada: any_naixement
	//	Parametres d'eixida: ning�n
	public void setAny_naixement(String any_naixement) {
		this.any_naixement = any_naixement;
	}

	
	//	M�tode: getAny_publicacio
	//	Descripci�: creem el getter
	//	Parametres d'entrada: ning�n
	//	Parametres d'eixida: any_publicacio
	public String getAny_publicacio() {
		return any_publicacio;
	}

	//	M�tode: setAny_publicacio
	//	Descripci�: creem el setter
	//	Parametres d'entrada: any_publicacio
	//	Parametres d'eixida: ning�n
	public void setAny_publicacio(String any_publicacio) {
		this.any_publicacio = any_publicacio;
	}

	//	M�tode: getEditoral
	//	Descripci�: creem el getter
	//	Parametres d'entrada: ning�n
	//	Parametres d'eixida: editoral
	public String getEditorial() {
		return editorial;
	}

	//	M�tode: setEditoral
	//	Descripci�: creem el setter
	//	Parametres d'entrada: editoral
	//	Parametres d'eixida: ning�n
	public void setEditorial(String editoral) {
		this.editorial = editoral;
	}

	//	M�tode: getPagines
	//	Descripci�: creem el getter
	//	Parametres d'entrada: ning�n
	//	Parametres d'eixida: num_pags
	public String getNum_pags() {
		return num_pags;
	}

	//	M�tode: setPagines
	//	Descripci�: creem el setter
	//	Parametres d'entrada: num_pags
	//	Parametres d'eixida: ning�n
	public void setNum_pags(String num_pags) {
		this.num_pags = num_pags;
	}
}
