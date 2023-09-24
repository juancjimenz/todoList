import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in); //Creo un scanner para ingresar los datos por consola

        System.out.println("Bienvenido a la aplicacion ded gestion de tareas más cuca del barrio. \n Por favor, seleccione una opción para continuar");
        int opcion = 0;

        do {
            opciones(); //Creamos un metodo para obtener la lista de opciones a escoger
            System.out.println("Ingrese opción");
            opcion = leer.nextInt(); //Le asignamos a la variable opcion el valor que ingresen por consola
            seleccionOpciones(opcion); //Creamos una funcion para obtener la seleccion de la opcion recibida

        }while (opcion != 9);
    }

    public  static void opciones(){
        System.out.println("********** GESTION DE TAREAS *********");
        System.out.println("*  1. Ingresar una tarea             *");
        System.out.println("*  2. Completar una tarea            *");
        System.out.println("*  3. Listar las tareas pendientes   *");
        System.out.println("*  4. Listar las tareas completas    *");
        System.out.println("*  5. Listar todas las tareas        *");
        System.out.println("*  6. Eliminar una tarea             *");
        System.out.println("*  7. Actualizar una tarea           *");
        System.out.println("*  8. Ver detalle de tarea           *");
        System.out.println("*  9. Salir                          *");
        System.out.println("**************************************");
    }

    public static void seleccionOpciones(int i){
        Scanner leer = new Scanner(System.in);

        switch (i){
            case 1:
                System.out.println("-------- Crear tarea nueva --------");
                System.out.println("Ingresar la descripción de la tarea");
                String tarea = leer.next(); //Creamos una variable llamada tarea y le agregamos el valor que ingresan por consola
                TodoList.agregarTarea(tarea); // Llamamos a de nuestra clase Todolist al metodo agregarTarea y le enviamos el valor que temenos en la variable tarea
                System.out.println("La tarea se ha agregado Exitosamente");
                System.out.println("-----------------------------------");
                break;
            case 2:
                System.out.println("-------- Completar una tarea ------");
                System.out.println("Ingrese indice de la tarea completada");
                int indice = leer.nextInt();
                System.out.println("Ingresar cantidad de tiempo en minutos que tardo");
                int min = leer.nextInt();
                TodoList.completarTarea(indice, min);
                System.out.println("-----------------------------------");
                break;
            case 3:
                System.out.println("---- Lista de tareas pendientes ---");
                String listarTareasPendientes = TodoList.listarTareasPendientes();
                System.out.println(listarTareasPendientes);
                System.out.println("-----------------------------------");
                break;
            case 4:
                System.out.println("---- Lista de tareas completas ----");
                String listaTareasCompletadas = TodoList.listarTareasCompletas();
                System.out.println(listaTareasCompletadas);
                System.out.println("-----------------------------------");
                break;
            case 5:
                System.out.println("---- Lista de tareas completas ----");
                String listaTareas = TodoList.listarTareas();
                System.out.println(listaTareas);
                System.out.println("-----------------------------------");
                break;
            case 6:
                System.out.println("------- Eliminar una tarea --------");
                System.out.println("Ingrese el indice de la tarea a eliminar");
                int eliminar = leer.nextInt();
                boolean eliminaTarea = TodoList.eliminarTarea(eliminar);
                if (eliminaTarea){
                    System.out.println("Tarea eliminada");
                }else{
                    System.out.println("La tarea no existe");
                }
                System.out.println("----------------------------------");
                break;
            case 7:
                System.out.println("-------- Actualizar Tarea --------");
                System.out.println("Lista de todas las tareas");
                System.out.println("---------------------------------");
                String listaTareas2 = TodoList.listarTareas();
                System.out.println(listaTareas2);
                System.out.println("---------------------------------");
                System.out.println("Ingrese el Indice de la tarea que quiere Actualizar");
                int busca = leer.nextInt();
                System.out.println("Ingrese el nuevo valor para la Descripción");
                String actualizarDescripcion = leer.next();
                System.out.println("El registro se ha cambiado exitosamente");
                TodoList.actualizarTarea(busca,actualizarDescripcion);
                System.out.println("----------------------------------");
                break;
            case 8:
                System.out.println("---- Ver a detalle una tarea ----");
                System.out.println("Ingrese el indice de la tarea que quiere ver detalladamente");
                int idDetalle = leer.nextInt();
                String detalle = TodoList.verDetalleTarea(idDetalle);

                System.out.println(detalle);
                System.out.println("---------------------------------");
                break;
            case 9:
                System.out.println("Gracias por usar nuestra app.");
                System.out.println("-----------------------------");
                break;
        }
    }
}