package ventas;

import javax.swing.JOptionPane;

public class Ventas {

    public static void main(String[] args) {
        //variables
        int Codigo, Litros, LitrosArtuculo1 = 0;
        float PrecioLitro;
        float importeFactura;
        float FacturacionTotal = 0;
        int ConteMas600 = 0;

        for (int i = 1; i <= 5; i++) {
            Codigo = Integer.parseInt(JOptionPane.showInputDialog("Digita el codigo de la factura:  "));
            Litros = Integer.parseInt(JOptionPane.showInputDialog("Digita la cantidad de litros: "));
            PrecioLitro = Float.parseFloat(JOptionPane.showInputDialog(" Digita el precio por litro:  "));
            importeFactura = (float) Litros * PrecioLitro;
            FacturacionTotal = FacturacionTotal + importeFactura;

            if (Codigo == 1) {
                LitrosArtuculo1 = LitrosArtuculo1 + Litros;
            }
            if (importeFactura > 600) {

                ConteMas600++;
            }
        }
        System.out.println("Resumen de ventas: \nFacturacion Total:  " + FacturacionTotal + "\nCant de litros  codigo 1: " + LitrosArtuculo1 + "\n Facturas Mayores a 600:  " + ConteMas600);

    }

}
