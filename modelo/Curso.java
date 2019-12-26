package modelo;

public class Curso {
    private String codigoCurso;
    private String nombreCurso;
    private int creditos;
    private double nota;
    private String descripcion;
    public Curso(String codigoCurso, String nombreCurso, int creditos) {
        this.codigoCurso = codigoCurso;
        this.nombreCurso = nombreCurso;
        this.creditos = creditos;
    }

    public Curso(){
        this.codigoCurso = "";
        this.nombreCurso = "";
        this.creditos = 0;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int nuevosCreditos) {
        this.creditos = creditos;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean estaCalificado(){
        return true;
    }


}
