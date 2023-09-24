import java.util.ArrayList;
import java.util.List;

public class TodoList {

    public static List<String[]> listaDeTareas = new ArrayList<>(); //Creamos el inicio de nustro array infinito


    //Creamos un metodo el cual nos recibira un string desde el main
    public static void agregarTarea(String descripcionTarea){
        String[] tarea = new String[3]; //Creamos un arreglo en el cual guardaremos las tareas con una dimesnion de 3 elementos
        tarea[0] = descripcionTarea; //Ingresamos el valor que va llevar cada elemento en nustro arreglo tarea
        tarea[1] = String.valueOf(false); //Agregamos el String.valueof para cambiar el valor de boolean y int a string
        tarea[2] = String.valueOf(0);

        listaDeTareas.add(tarea); //Con este metodo agregamos nuevos elementos a nuestro arreglo listaDeTaraeas
    }

    //Creamos un metodo para completar las tareas
    public static void completarTarea(int i, int minutos){
        String[] tarea = listaDeTareas.get(i); //Agregamos el .get(i) para obtener el valor de un arreglo que este en el elemento i
        tarea[1] = String.valueOf(true);
        tarea[2] = String.valueOf(minutos); //Colocamos minutos ya que necesitamos agregar el valor que nos envian por consola
    }

    // Creamos una funcion para listar las tareas pendientes
    public static String listarTareasPendientes(){
        String listarTareas = ""; //Creamos una variable de tipo string que nos servira de contador

        //Creamos un for para recorrer nuestro arreglo lista de tareas y mostrar cada elemento en el
        for(int i = 0; i < listaDeTareas.size(); i++ ){
            String[] tarea = listaDeTareas.get(i);
            boolean estaTareaCompleta = Boolean.parseBoolean(tarea[1]); //Se crea una variable de tipo boolean para agregarle el string en el elemento 1 y comvertirlo en boolean
            if(!estaTareaCompleta) {
                listarTareas += i + " - " + tarea[0] + " (" + tarea[2] + ") " + "\n"; //Vamos a sumarle a la variable contador (listaTareas) cada valor en el elemento 0
            }
        }
        return listarTareas;
    }

    // Creamos una funcion para listar las tareas completadas
    public static String listarTareasCompletas(){
        String listarTareasCompletas = ""; //Creamos una variable de tipo string que nos servira de contador

        //Creamos un for para recorrer nuestro arreglo lista de tareas y mostrar cada elemento en el
        for(int i = 0; i < listaDeTareas.size(); i++ ){
            String[] tarea = listaDeTareas.get(i);
            boolean estaTareaCompleta = Boolean.parseBoolean(tarea[1]); //Se crea una variable de tipo boolean para agregarle el string en el elemento 1 y comvertirlo en boolean
            if(estaTareaCompleta) {
                listarTareasCompletas += i + " - " + tarea[0] + " (" + tarea[2] + ") " + "\n"; //Vamos a sumarle a la variable contador (listaTareas) cada valor en el elemento 0
            }
        }
        return listarTareasCompletas;
    }

    // Creamos una funcion para lista de tareas
    public static  String listarTareas(){
        String listarTareas = ""; //Creamos una variable de tipo string que nos servira de contador

        //Creamos un for para recorrer nuestro arreglo lista de tareas y mostrar cada elemento en el
        for(int i = 0; i < listaDeTareas.size(); i++ ){
            String[] tarea = listaDeTareas.get(i);
            listarTareas += i + " - " + tarea[0] + " (" + tarea[2] + ") " + "\n"; //Vamos a sumarle a la variable contador (listaTareas) cada valor en el elemento 0
        }
        return listarTareas;

    }

    public static boolean eliminarTarea(int i){

        if (i >= 0 && i < listaDeTareas.size()){
            listaDeTareas.remove(i);
            return true;
        }else{
            return false;
        }
    }

    public static void actualizarTarea(int i, String descripcion){
        String[] tarea = listaDeTareas.get(i);
        tarea[0] = descripcion;
    }

    public static String verDetalleTarea(int i){
        String detalle = "";
        String[] tarea = listaDeTareas.get(i);
        detalle += i + " - " + tarea[0] + " (" + tarea[2] + ") " + "\n";

        return detalle;
    }

}
