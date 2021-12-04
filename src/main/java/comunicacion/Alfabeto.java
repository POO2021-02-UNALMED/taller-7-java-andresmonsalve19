package comunicacion;

public class Alfabeto extends Pictograma{
    private String[] letras;
    private String interpretacion;

    // Constructor
    public Alfabeto(String origen, String[] letras, String interpretacion) {
        super(origen);
        this.letras = letras;
        this.interpretacion = interpretacion;
    }

    // Métodos

    public String interpretacion() {
        return this.interpretacion;
    }

    public String toString() {
        String cadena = new String();
        for(String letra : this.letras) {
            if(letra.equals("Z")) {
                cadena += letra;
            }
            else {
                cadena += letra + ", ";
            }
        }
        return cadena;
    }

    public int cantidadLetras() {
        return letras.length;
    }

    // Métodos Getters & Setters

    public String[] getLetras() {
        return letras;
    }

    public void setLetras(String[] letras) {
        this.letras = letras;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }

}
