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

        if(curso1 == null) {
           curso1 = new Curso(curso.getCodigoCurso(), curso.getNombreCurso(), curso.getCreditos());
           System.out.println("El curso "+curso1.getNombreCurso()+" fue registrado");
           return true;
       }
       if(curso2 == null){
           curso2 = new Curso(curso.getCodigoCurso(), curso.getNombreCurso(), curso.getCreditos());
           System.out.println("Curso registrado");
           return true;
       }
       if(curso3 == null){
           curso3 = new Curso(curso.getCodigoCurso(), curso.getNombreCurso(), curso.getCreditos());
           System.out.println("Curso registrado");
           return true;
       }
       if(curso4 == null){
           curso4 = new Curso(curso.getCodigoCurso(), curso.getNombreCurso(), curso.getCreditos());
           System.out.println("Curso registrado");
           return true;
       }
       if(curso5 == null){
           curso5 = new Curso(curso.getCodigoCurso(), curso.getNombreCurso(), curso.getCreditos());
           System.out.println("Curso registrado");
           return true;
       }
        System.out.println("Ya tiene todos los cursos registrados");
        return false;
    }

    public boolean pensumIncluyeCurso(String codigoCurso){
        if(buscarCurso(codigoCurso) != null){
            return true;
        }
        return false;
    }

    public Curso buscarCurso(String codigoCurso){
        if(curso1.getCodigoCurso() == codigoCurso) {
            return curso1;
        }
        if(curso2.getCodigoCurso() == codigoCurso){
            return curso2;
        }
        if(curso3.getCodigoCurso() == codigoCurso){
            return curso3;
        }
        if(curso4.getCodigoCurso() == codigoCurso){
            return curso4;
        }
        if(curso5.getCodigoCurso() == codigoCurso){
            return curso5;
        }

        return null;
    }

    public void asignarNota(String codigoCurso, double notaCurso){
        Curso curso = buscarCurso(codigoCurso);
        curso.setNota(notaCurso);
    }


    public double calcularPromedio(){
        double suma = 0;
        int divisor = 0;

        if(curso5 != null){
            suma += curso5.getNota()*curso5.getCreditos();
            divisor += curso5.getCreditos();
        }
        if(curso4 != null){
            suma += curso4.getNota()*curso4.getCreditos();
            divisor += curso4.getCreditos();
        }
        if(curso3 != null){
            suma += curso3.getNota()*curso3.getCreditos();
            divisor += curso3.getCreditos();
        }
        if(curso2 != null){
            suma += curso2.getNota()*curso2.getCreditos();
            divisor += curso2.getCreditos();
        }
        if(curso1 != null){
            suma += curso1.getNota()*curso1.getCreditos();
            divisor += curso1.getCreditos();
        }

        return suma/divisor;

    }

    public boolean estudianteEstaPrueba(){
        if(calcularPromedio() < 3.5){
            System.out.println("El estudiante esta en prueba academica");
            return true;
        }
        System.out.println("El estudiante no esta en prueba academica");
        return false;
    }
}
