@Service
@Transactional
public interface ClienteService {

    List<ClienteDTO.Response> listarTodos();

    ClienteDTO.Response buscarPorId(int id_cliente);

    ClienteDTO.Response buscarPorNombre(String nombre);

    ClienteDTO.Response buscarPorGenero(int id_genero);

    ClienteDTO.Response crearCliente(ClienteDTO.Request request);

    ClienteDTO.Response actualizarCliente(int id_cliente, ClienteDTO.Request request);

    void eliminarCliente(int id_cliente);
}
