public class Perro {
    private String placa;
    private String nombre;
    private String raza;
    private int edad;
    private String tamanio;
    private boolean estado;

    public Perro() {
    }

    public Perro(String placa, String nombre, String raza, int edad, String tamanio, boolean estado) {
        this.placa = placa;
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamanio = tamanio;
        this.estado = estado;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamaño(String tamanio) {
        this.tamanio = tamanio;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    public String estadoPerro(){
        if(isEstado()==true){
            return "Disponible";
        }else{
            return "Adoptado";
        }
    }

    @Override
    public String toString() {
        return
                "Placa: " + placa +
                "\nNombre: " + nombre +
                "\nRaza: " + raza +
                "\nEdad: " + edad +
                "\nTamaño: " + tamanio+
                "\nEstado: " + estadoPerro();
    }
}
