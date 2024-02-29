package gestor.empresarial.empleados;

import gestor.empresarial.contrato.*;
import gestor.empresarial.errores.*;

public final class Empleados implements iEmpleados{
    int i;
   GestionErrores error;

   //CONSTRUCTOR
    public Empleados() {
        //
    }
    public void addDatosPersonales(String a,String b, String c){
        //
    }
    public void addContrato (int a,int b,String c,Cargos d){
        //
    }

    private int findEmpleado(int a){
        return 1;
    }
    private int findEmpleado(String a){
        return 2;
    }
    public void setWhatsapp(int a, String b){
        //
    }
    private String datosPersonales(int a){
        return "a";
    }
    public String getInfoEmpleado(int a){
        return "b";
    }
    public String getInfoEmpleado(String a){
        return "c";
    }
    public void setAdscripcion(int a,String b){
        //
    }
    public void setTelefonoExtension(int a,String b){
        //
    }
    public void setPuesto(int a,String b){
        //
    }
    public void showDatosEmpleado(){
        //
    }
    public void showContradosEmpleado(int a){
        //
    }
    public int getAntiguedad(int a){
        return 3;
    }
    public int getAntiguedad(){
        return 4;
    }
    public void setCargo(Cargos a){
        //
    }
}
