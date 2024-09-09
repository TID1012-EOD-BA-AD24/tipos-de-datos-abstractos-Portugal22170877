package miPrincipal;

public class Cuenta_Cheques {
   //coloca el codigo faltante
   
      private String nombreCuenta;
      private String nombreCliente;
      private String sucursal;
      private float saldo;
   
  
   public Cuenta_Cheques(String nombreCuenta, String nombreCliente, String sucursal) {
      this.nombreCuenta = nombreCuenta;
      this.nombreCliente = nombreCliente;
      this.saldo = 0.0f;
   }

   public Cuenta_Cheques(String nombreCuenta, String nombreCliente, String sucursal, float saldo) {
      this.nombreCuenta = nombreCuenta;
      this.nombreCliente = nombreCliente;
      this.sucursal = sucursal;
      this.saldo = saldo;
   }

   public String getNombreCuenta() {
      return nombreCuenta;
   }

   public void setNombreCuenta(String nombreCuenta) {
      this.nombreCuenta = nombreCuenta;
   }

   public String getNombreCliente() {
      return nombreCliente;
   }

   public void setNombreCliente(String nombreCliente) {
      this.nombreCliente = nombreCliente;
   }

   public String getSucursal() {
      return sucursal;
   }

   public void setSucursal(String sucursal) {
      this.sucursal = sucursal;
   }

   public float getSaldo() {
      return saldo;
   }

   public void setSaldo(float saldo) {
      this.saldo = saldo;
   }

   public float muestra_saldo() {
      return saldo;
   }

   public void deposito(float cantidad) {
      if (cantidad > 0) {
          saldo += cantidad;
      } else {
          System.out.println("La cantidad a depositar debe ser positiva.");
      }
  }

  public void retiro(float cantidad) {
   if (cantidad > 0) {
       if (cantidad <= saldo) {
           saldo -= cantidad;
       } else {
           System.out.println("Fondos insuficientes.");
       }
   } else {
       System.out.println("La cantidad a retirar debe ser positiva.");
   }
}


   

    
}
