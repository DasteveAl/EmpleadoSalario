public class Salario {
    double valorHora;
    int horas;
    double salario;
    String msg;
    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    public void setHoras(int horas) {
        this.horas = horas;
    }
    public String getSalario(String name) {
        salario = valorHora * horas;
        if (salario > 450000) {
            msg = "El nombre del empleado es: "+ name
                    +"\nEl salario mensual es: " + salario;
        }
        else {
            msg = "El nombre del empleado es: " + name;
        }
        return msg;
    }
}
