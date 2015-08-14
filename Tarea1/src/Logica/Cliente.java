
package Logica;


public class Cliente extends Usuario{
    private String apellido;
    private Fecha  fecha_nacimiento;
    
    public Cliente(String nombre, String nickname, String correo, String direccion, String apellido, Fecha fecha_nacimiento){
        super(nombre,nickname,correo,direccion);
        this.apellido=apellido;
        this.fecha_nacimiento=fecha_nacimiento;
    }
}
