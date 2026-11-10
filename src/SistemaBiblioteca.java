import java.util.HashMap;
import java.util.Map;

public class SistemaBiblioteca {

    Map <String, Material>catalogo = new HashMap<>();

    public void registrarMaterial(Material m){
        catalogo.put( m.getCodigo(), m);
    }

    public Material buscarMaterial (Material m){
        catalogo.get(m.getCodigo());
        if (m.getCodigo() == null || m.getCodigo().isBlank()){
            return null;
        }
        return m;
    }
}
