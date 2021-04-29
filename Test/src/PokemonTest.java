import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

// Notas para mi
// AssertEquals( <ESPERADO> , <NO ESPERADO> )

public class PokemonTest {
    private Fuego pokemonFuego;
    private Planta pokemonPlanta;
    private Planta pokemonPlanta2;
    private Agua pokemonAgua;
    private Agua pokemonAgua2;

    /**
     * Mis Pokemon
     */
    @BeforeEach
    public void setUp(){
        pokemonFuego = new Fuego("fueguito", "Charmander", 20);
        pokemonPlanta = new Planta("plantita", "Bulbasaur", 20);
        pokemonPlanta2 = new Planta("plantita2", "Chikorita", 10);
        pokemonAgua = new Agua("aguita", "Squirtle", 20);
        pokemonAgua2 = new Agua("aguita2", "Slowpoke", 10);
    }

    @Test
    public void testConstructorFuego(){
        Assertions.assertEquals(pokemonFuego,pokemonFuego);
        Assertions.assertNotEquals(pokemonFuego,new Object());
        Assertions.assertNotEquals(pokemonPlanta,pokemonFuego);
    }

    @Test
    public void testConstructorPlanta(){
        Assertions.assertEquals(pokemonPlanta,pokemonPlanta);
        Assertions.assertNotEquals(pokemonPlanta,new Object());
        Assertions.assertNotEquals(pokemonPlanta,pokemonAgua);
    }

    @Test
    public void testConstructorAgua(){
        Assertions.assertEquals(pokemonAgua,pokemonAgua);
        Assertions.assertNotEquals(pokemonAgua,new Object());
        Assertions.assertNotEquals(pokemonAgua,pokemonFuego);
    }

    @Test
    public void testGet(){
        Assertions.assertEquals("aguita2", pokemonAgua2.getName());
        Assertions.assertEquals("Slowpoke", pokemonAgua2.getSpecies());
        Assertions.assertEquals(10, pokemonAgua2.getHP());
    }

    @Test
    public void testSet(){
        pokemonPlanta2.setName("xXLetalLeafXx");
        pokemonPlanta2.setSpecies("Groot");
        pokemonPlanta2.setHP(2);
        Assertions.assertEquals("xXLetalLeafXx", pokemonPlanta2.getName());
        Assertions.assertEquals("Groot", pokemonPlanta2.getSpecies());
        Assertions.assertEquals(2, pokemonPlanta2.getHP());
    }

    @Test
    public void testAttack(){
        // Charmander, un Pokemon Fuego con 20 de vida inicial, ataca a Bulbasaur, un pokemonPlanta con 20 de vida inicial.
        int HPCharmander = pokemonFuego.getHP();
        pokemonFuego.attack(pokemonPlanta);
        // Bulbasaur queda con 10 puntos de vida ya que su HP inicial era de 20 y perdió 10 debido al ataque Fuego -> Planta)
        Assertions.assertEquals(10, pokemonPlanta.getHP());
        Assertions.assertEquals(HPCharmander, pokemonFuego.getHP());

        // Squirtle, un Pokemon Agua con 20 de vida inicial, ataca a Slowpoke, un Pokemon Agua con 10 de vida inicial.
        int HPAgua = pokemonAgua.getHP();
        pokemonAgua.attack(pokemonAgua2);
        // Slowpoke queda con 5 puntos de vida ya que su HP inicial era de 10 y perdió 5 debido al ataque Agua -> Agua)
        Assertions.assertEquals(5, pokemonAgua2.getHP());
        Assertions.assertEquals(HPAgua, pokemonAgua.getHP());

        // Bulbasaur, un Pokemon Planta con 10 de vida, ataca a Squirtle, un Pokemon Agua con 20 de vida inicial.
        int HPPlanta = pokemonPlanta.getHP();
        pokemonPlanta.attack(pokemonAgua);
        // Slowpoke queda con 5 puntos de vida ya que su HP inicial era de 10 y perdió 5 debido al ataque Agua -> Agua)
        Assertions.assertEquals(10, pokemonAgua.getHP());
        Assertions.assertEquals(HPPlanta, pokemonPlanta.getHP());

    }

    @Test
    public void testKO(){
        // Squirtle, un pobre Pokemon Agua, es atacado por Charmander, un Pokemon Fuego.
        while(pokemonAgua.getHP()>0){
            pokemonFuego.attack(pokemonAgua);
        }
        // Squirtle queda fuera de combate, ya que su HP es menor o igual a 0.
        Assertions.assertTrue(pokemonAgua.KO());
    }
}
