import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        List<Perro> lstPerros = new ArrayList<>();
        List<Persona> lstPersonas = new ArrayList<>();

        int opc, edad, n=0, o=0;
        boolean m=true, estado=true;
        String nombre, apellido, documento, placa, raza, tamanio;

       do{
        System.out.println(
                "====================\n        MENÚ        \n===================="
                +"Registrar Persona ->(1)"
                        +"Registrar Perro ->(2)"
                        +"Personas Registradas ->(3)"
                        +"Perros Disponibles ->(4)"
                        +"Adoptar Perro ->(5)"
                        +"Perro más viejo adoptado ->(6)"
                        +"Salir ->(7)"
        );
        opc = dato.nextInt();
        switch (opc){
            case 1->{
                dato.nextLine();
                System.out.println("Ingrese Nombre: ");
                nombre = dato.nextLine();
                System.out.println("Ingrese Apellido: ");
                apellido = dato.nextLine();
                System.out.println("Ingrese edad: ");
                edad= dato.nextInt();
                System.out.println("Ingrese documento: ");
                documento = dato.nextLine();
                lstPersonas.add(new Persona(nombre,apellido,edad,documento));

            }
            case 2->{
                dato.nextLine();
                System.out.println("Ingrese Placa: ");
                placa = dato.nextLine();
                System.out.println("Ingrese Nombre: ");
                nombre = dato.nextLine();
                System.out.println("Ingrese Raza: ");
                raza = dato.nextLine();
                System.out.println("Ingrese Edad: ");
                edad = dato.nextInt();
                System.out.println("Ingrese Tamaño: ");
                tamanio = dato.nextLine();
                lstPerros.add(new Perro(placa,nombre,raza,edad,tamanio,estado));

            }
            case 3->{
                for(Persona p: lstPersonas){
                    System.out.println("--------------------");
                    System.out.println(p);
                    System.out.println("--------------------");
                }

            }
            case 4->{
                for(Perro pe: lstPerros){
                    if(pe.isEstado()==true){
                        System.out.println("--------------------");
                        System.out.println(pe);
                        System.out.println("--------------------");
                    }
                }

            }
            case 5->{
                dato.nextLine();
                System.out.println("Ingrese la placa del perro: ");
                placa = dato.nextLine();
                System.out.println("Ingrese el documento de la persona: ");
                documento = dato.nextLine();
                do{
                    if(documento.equalsIgnoreCase(lstPersonas.get(n).getDocumento())){
                        if(lstPersonas.get(n).tamanioLista()<3){
                            do{
                                if(placa.equalsIgnoreCase(lstPerros.get(o).getPlaca())){
                                    if(lstPerros.get(o).isEstado()==true){
                                        lstPersonas.get(n).agregarPerro(placa);
                                        lstPerros.get(o).setEstado(false);

                                    }else{
                                        System.out.println("Este perro ya esta adoptado....");
                                        o++;
                                    }
                                }else{
                                    o++;
                                }
                            }while(o<lstPerros.size());
                        }else{
                            System.out.println("Se pueden adoptar maximo 3 perros...");
                            n++;
                        }
                    }else{
                        n++;
                    }
                }while(n<lstPersonas.size());

            }
            case 6->{

            }
            case 7->{
                System.out.println("Finalización completa...");
                m=false;
            }
            default -> {
                System.out.println("Ingrese una opción valida....");
            }
        }}while(m==true);

    }
}