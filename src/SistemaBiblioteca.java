import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

public class SistemaBiblioteca {

    Map <String, Material>catalogo = new HashMap<>();
    Map<String, List<String>>listaEspera = new HashMap<>();

    public void registrarMaterial(Material m){
        catalogo.put( m.getCodigo(), m);
    }

    public Material buscarMaterial (String codigo){
        return catalogo.get(codigo);
    }

    public void mostrarCatalogo () {
        for (Map.Entry<String, Material> entry : catalogo.entrySet()) {
            System.out.println("Código: " + entry.getKey() + " Material: " + entry.getValue().mostrarInfo());
        }
    }
       public void agregarEspera(String codigoMaterial, String usuario){
        if (listaEspera.containsKey(codigoMaterial)){
            listaEspera.get(codigoMaterial).add(usuario);
           }
           else {
               List <String> nuevaLista = new ArrayList<>();
               nuevaLista.add(usuario);
               listaEspera.put(codigoMaterial, nuevaLista);
           }
       }

       public String siguienteEnEspera(String codigoMaterial){
           if (listaEspera.containsKey(codigoMaterial)){
              return listaEspera.get(codigoMaterial).remove(0);
           }
           return  null;
       }


}
