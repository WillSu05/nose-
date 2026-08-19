import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <Deportista> listDeportistas = new ArrayList<>();

        Corredor corredor = new Corredor("Juan", 23, "Colombia", 76, 14, 15.0);
        Ciclista ciclista = new Ciclista("Ana", 24, "Peru", 65, 123.5, 80, 5.9);
        Nadador nadador = new Nadador("Pedro", 34, "Francia", 45, 33.89, 90.5, "libre");

        listDeportistas.add(corredor);
        listDeportistas.add(ciclista);
        listDeportistas.add(nadador);

        for (Deportista c1 : listDeportistas){
            System.out.println(c1);
        }



    }
}