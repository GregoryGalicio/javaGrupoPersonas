package presencial;

public class Persona {
    private String nombre;
    private Integer edad;

    public Persona(String nombre, Integer edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public boolean esMayorEdad (){
        return edad>=18;//por default true tb puedo poner this.edad
    }

    public boolean checkEdad(){
        boolean respuesta= false;
        if(edad>0 && edad<=120){
            respuesta=true;
        }return respuesta;
    }
    public boolean cantidadDeLetras(){
        return nombre.length()>4;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public boolean checkAZ(){
        boolean respuesta=false;
        char [] array =nombre.toCharArray();
        for (char letra : array) {
            if(!Character.isLetter(letra)){
                return respuesta;
            }
        }
        respuesta=true;
        return respuesta;
    }
}
