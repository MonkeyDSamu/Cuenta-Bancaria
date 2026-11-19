public class UsoCuentaBancaria {
    public static void main(String[] args) {

        // Crear cuenta con método constructor por defecto - Imprimir todos los parámetros por defecto
        CuentaBancaria cuenta1 = new CuentaBancaria();

        System.out.println("=== Cuenta 1 (constructor por defecto) ===");
        System.out.println("Titular: " + cuenta1.obtenerTitular());
        System.out.println("Número de cuenta: " + cuenta1.obtenerNumeroCuenta());
        System.out.printf("Saldo: $%,.2f%n", cuenta1.obtenerSaldo());
        System.out.printf("Límite de retiro: $%,.2f%n", cuenta1.obtenerLimiteRetiro());

        // Crear cuenta con método constructor con parámetros - Imprimir todos los parámetros
        CuentaBancaria cuenta2 = new CuentaBancaria("Evelin Gómez", "123456789", 1000000, 800000);

        System.out.println();
        System.out.println("=== Cuenta 2 (constructor con parámetros) ===");
        System.out.println("Titular: " + cuenta2.obtenerTitular());
        System.out.println("Número de cuenta: " + cuenta2.obtenerNumeroCuenta());
        System.out.printf("Saldo: $%,.2f%n", cuenta2.obtenerSaldo());
        System.out.printf("Límite de retiro: $%,.2f%n", cuenta2.obtenerLimiteRetiro());

        // Uso de métodos Setter para modificar atributos
        cuenta1.asignarTitular("Mario Pérez");
        cuenta1.asignarNumeroCuenta("987654321");
        cuenta1.asignarSaldo(300000);
        cuenta1.asignarLimiteRetiro(250000);

        System.out.println();
        System.out.println("=== Cuenta 1 después de usar los Setters ===");
        System.out.println("Titular: " + cuenta1.obtenerTitular());
        System.out.println("Número de cuenta: " + cuenta1.obtenerNumeroCuenta());
        System.out.printf("Saldo: $%,.2f%n", cuenta1.obtenerSaldo());
        System.out.printf("Límite de retiro: $%,.2f%n", cuenta1.obtenerLimiteRetiro());

        // Uso de Métodos de comportamiento
        System.out.println();
        System.out.println("=== Depósitos en la cuenta 2 ===");
        cuenta2.depositar(500000);     // Sin bonificación
        cuenta2.depositar(3000000);    // Con bonificación del 1%
        cuenta2.depositar(-1000);      // Monto inválido

        System.out.println();
        System.out.println("=== Retiros en la cuenta 2 ===");
        cuenta2.retirar(200000);       // Retiro válido
        cuenta2.retirar(900000);       // Supera el límite de retiro
        cuenta2.retirar(-5000);        // Monto inválido

        System.out.println();
        System.out.println("=== Retiros en la cuenta 1 ===");
        cuenta1.retirar(400000);       // Supera el saldo
        cuenta1.retirar(100000);       // Retiro válido
    }
}