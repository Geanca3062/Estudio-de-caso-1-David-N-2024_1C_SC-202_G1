/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estudiodecaso1david_n_2024_1c_sc.pkg202_g1;

import javax.swing.JOptionPane;

/**
 *
 * @author Aulas Heredia
 */
public class EstudioDeCaso1David_N_2024_1C_SC202_G1 {

    public static void Show(double MontoPagar, double MontoPago, double anio) {

        double Plan = ((MontoPagar*0.15)+ MontoPagar)/4; // sE PRESENTAN LOS RESULTADOS RESIVIENDOLOS COMO REFERENCIA
        JOptionPane.showMessageDialog(null,"Cuota 1 " + Plan + " Fecha de pago: Marzo " + anio+1 + "\nCuota 2 " + Plan + " Fecha de pago: Abril " + anio+1 + "\nCuota 3 " + Plan + " Fecha de pago: Mayo " + anio+1 + "\nCuota 4 " + Plan + " Fecha de pago: Junio " + anio+1 + "\n \n El usuario ha pagado: " + MontoPago);
    }

    public static void Data() { // Se recolecta toda la informacion del usuario y las facturas
        int Cant = Integer.parseInt(JOptionPane.showInputDialog("Cuantas facturas desea agregar?"));
        double Anio = Integer.parseInt(JOptionPane.showInputDialog("Anio de la facturas"));
        JOptionPane.showInputDialog("Nombre del propietario de la factura:");
        JOptionPane.showInputDialog("Numero de identificacion");
        double TotNoPago = 0;
        double TotPago = 0;
        for (int x = 0; x < Cant; x++) {
            JOptionPane.showInputDialog("Codigo de la factura"  + Cant);
            double Monto = Integer.parseInt(JOptionPane.showInputDialog("Monto de la factura"+ Cant));
            JOptionPane.showInputDialog("Mes de la factura " + Cant + "  \n1)Enero \n2)Febrero \n3)Marzo \n4)Abril \n5)Mayo \n6)Junio \n7)Julio \n8)Agosto \n9)Setiempre \n10)Octubre \n11)Noviembre \n12)Diciembre");
            double Estado = Integer.parseInt(JOptionPane.showInputDialog("Stado de la factura " + Cant + " \n 1)Factura paga \n 2)Factura no paga"));
            if (Estado == 1) {
                TotPago += Monto;
            } else {
                TotNoPago += Monto;
            }
        }

        Controller user = new Controller(); // Se cargan a la case Controller
        user.setMontoPago(TotPago);
        user.setMontoPagar(TotNoPago);
        user.setAnio(Anio);
        
        Show(user.getMontoPagar(), user.getMontoPago(), user.getAnio()); // Se llama a show pora mostrar los resultados, enviando como referencia las variables de controller
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Data(); // Se llama a data para cargar toda la informacion
    }

}
