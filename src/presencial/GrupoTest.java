package presencial;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import javax.annotation.processing.SupportedAnnotationTypes;

public class GrupoTest {

    @Test
    public void agregar2Personas(){
        //DADO
        Persona persona1=new Persona("Juan",18);
        Persona persona2=new Persona("Pedro",20);
        Persona persona3=new Persona("Ana",22);
        Persona persona4=new Persona("Luz",14);
        Persona persona5=new Persona("Julian",32);
        GrupoPersona grupoPersona=new GrupoPersona();

        //CUANDO
        grupoPersona.agregarPersona(persona1);
        grupoPersona.agregarPersona(persona2);
        grupoPersona.agregarPersona(persona3);
        grupoPersona.agregarPersona(persona4);
        grupoPersona.agregarPersona(persona5);

        //ENTONCES

        Assertions.assertTrue(grupoPersona.getPersonas().size()==2);

    }


}
