
package java_com;

public class Cuentabancaria{

    private String nombre;
    private String apellido;
    private String direccion;
    private String rut;
    private int saldo;


    public Cuentabancaria(String nombre, String apellido, String direccion, String rut, int saldo){
        
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.rut = rut;
        this.saldo = saldo;
    }

    public String getNombre(){ 
        return this.nombre}

    public String getApellido(){ 
        return this.apellido}

    public String getDireccion(){ 
        return this.direccion}

    public String getRut(){ 
        return this.rut}

    public int getSaldo(){
        return this.saldo}

        public void deposito(int monto_deposito){

        this.saldo= this.saldo + monto_deposito;

        System.out.println("Deposito realizado con exito");}

        public void retiro(int monto_retiro){
            
            if(this.saldo  >= monto_retiro){

                System.out.println("Retiro realizado con exito");

            }else{

                System.out.println("Saldo insuficiente en la cuenta");
            }
        }

        public void consultarSaldo(){

        }

 }
