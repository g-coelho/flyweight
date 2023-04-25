import org.example.ProcessadorFactory;
import org.example.Socket;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SocketTest {
    @Test
    public void deveRetornarPlacamaes() {
        Socket socket = new Socket();
        socket.registrar("Asus", "Core i3 4160", "Haswell");
        socket.registrar("Asus", "Celeron G1820", "Haswell");
        socket.registrar("Gigabyte", "Core i5-4440", "Haswell");
        socket.registrar("Foxconn", "Core i7-4790", "Haswell");

        List<String> saida = Arrays.asList(
                "Placamae{nome='Asus', nomeProcessador='Core i3 4160', arquitetura='Haswell'}",
                "Placamae{nome='Asus', nomeProcessador='Celeron G1820', arquitetura='Haswell'}",
                "Placamae{nome='Gigabyte', nomeProcessador='Core i5-4440', arquitetura='Haswell'}",
                "Placamae{nome='Foxconn', nomeProcessador='Core i7-4790', arquitetura='Haswell'}");
        


            assertEquals(saida, socket.obterPlacas());
    }

    @Test
    public void deveRetornarTotalPlacas() {
        Socket socket = new Socket();
        socket.registrar("Asus", "Core i3 4160", "Haswell");
        socket.registrar("Asus", "Celeron G1820", "Haswell");
        socket.registrar("Gigabyte", "Core i5-4440", "Haswell");
        socket.registrar("Foxconn", "Core i7-4790", "Haswell");

        assertEquals(4, ProcessadorFactory.getTotalProcessadores());
    }
}
