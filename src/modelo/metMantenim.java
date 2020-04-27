
package modelo;

import java.util.List;

// metodos a utilizar en el form de Mantenimiento
public interface metMantenim {
        public List listar();
        public int add(Object[] o);
        public int actualizar(Object[] o);
        public void eliminar(int id);
}
