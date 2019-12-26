package modelo;

public class Estudiante {
    private int codigo;
    private String nombre;
    private String apellido;
    private Curso curso1;
    private Curso curso2;
    private Curso curso3;
    private Curso curso4;
    private Curso curso5;

    public Estudiante(int codigo, String nombre, String apellido) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public boolean asignarCurso(Curso curso){
        return true;
    }

    public double calcularPromedio(){
        return 0;
    }

    public boolean estudianteEstaPrueba(){
        return true;
    }

    public boolean tieneCursosComppletos(String codigoCurso){
        return true;
    }

    public Curso buscarCurso(String codigoCurso){
        return curso1;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Curso getCurso1() {
        return curso1;
    }

    public Curso getCurso2() {
        return curso2;
    }

    public Curso getCurso3() {
        return curso3;
    }

    public Curso getCurso4() {
        return curso4;
    }

    public Curso getCurso5() {
        return curso5;
    }
}
