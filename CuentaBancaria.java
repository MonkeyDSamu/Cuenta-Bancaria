class CuentaBancaria {

    // Atributos x4
    private String titular;
    private String numeroCuenta;
    private double saldo;
    private double limiteRetiro;

    // Método constructor por defecto
    public CuentaBancaria() {
        titular = "Sin asignar";
        numeroCuenta = "0000";
        saldo = 0;
        limiteRetiro = 500000;
    }

    // Método constructor con parámetros
    public CuentaBancaria(String titular, String numeroCuenta, double saldo, double limiteRetiro) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.limiteRetiro = limiteRetiro;
    }

    // Métodos de comportamiento
    // Método 1: retirar
    public void retirar(double monto) {
        if (monto <= 0) {
            System.out.println("Retiro rechazado: el monto debe ser positivo.");
        } else if (monto > saldo) {
            System.out.println("Retiro rechazado: el monto supera el saldo disponible.");
        } else if (monto > limiteRetiro) {
            System.out.println("Retiro rechazado: el monto supera el límite de retiro.");
        } else {
            saldo = saldo - monto;
            System.out.printf("Retiro exitoso de $%,.2f. Nuevo saldo: $%,.2f%n", monto, saldo);
        }
    }

    // Método 2: depositar
    public void depositar(double monto) {
        if (monto <= 0) {
            System.out.println("Depósito rechazado: el monto debe ser positivo.");
        } else {
            saldo = saldo + monto;
            System.out.printf("Depósito exitoso de $%,.2f.%n", monto);

            if (monto > 2000000) {
                double bonificacion = monto * 0.01;
                saldo = saldo + bonificacion;
                System.out.printf("Bonificación del 1%% aplicada: $%,.2f%n", bonificacion);
            }

            System.out.printf("Nuevo saldo: $%,.2f%n", saldo);
        }
    }

    // Métodos Getters - Obtener x4
    public String obtenerTitular() {
        return titular;
    }

    public String obtenerNumeroCuenta() {
        return numeroCuenta;
    }

    public double obtenerSaldo() {
        return saldo;
    }

    public double obtenerLimiteRetiro() {
        return limiteRetiro;
    }

    // Métodos Setter - Asignar x4
    public void asignarTitular(String titular) {
        this.titular = titular;
    }

    public void asignarNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void asignarSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void asignarLimiteRetiro(double limiteRetiro) {
        this.limiteRetiro = limiteRetiro;
    }
}
