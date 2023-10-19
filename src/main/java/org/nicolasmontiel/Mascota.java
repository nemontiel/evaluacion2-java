package org.nicolasmontiel;

public abstract class Mascota implements Costo {
    private String codigo;
    private String nombre;
    private String edad;
    private float peso;
    private int diasAlojamiento;
    private boolean supervision;

    public Mascota() {
    }

    public Mascota(String codigo, String nombre, String edad, float peso, int diasAlojamiento, boolean supervision) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.diasAlojamiento = diasAlojamiento;
        this.supervision = supervision;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getDiasAlojamiento() {
        return diasAlojamiento;
    }

    public void setDiasAlojamiento(int diasAlojamiento) {
        this.diasAlojamiento = diasAlojamiento;
    }

    public boolean getSupervision() {
        return supervision;
    }

    public void setSupervision(boolean supervision) {
        this.supervision = supervision;
    }

    public abstract void mostrarMascota();

    @Override
    public String toString() {
        return "Mascota{" +
            "codigo='" + codigo + '\'' +
            ", nombre='" + nombre + '\'' +
            ", edad='" + edad + '\'' +
            ", peso=" + peso +
            ", diasAlojamiento=" + diasAlojamiento +
            ", supervision=" + supervision +
            '}';
    }
}
