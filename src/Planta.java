public class Planta extends Pokemon{

    /**
     * Constructor, utiliza super() para llamar al del padre
     * @param name nombre
     * @param species especie
     * @param HP vida
     */
    public Planta(String name, String species, int HP) {
        super(name, species, HP);
    }

    /**
     * Un Pokemon random (pokemon) es atacado por un Pokemon Planta
     * @param pokemon Un pokemon cualquiera, ya sea tipo Fuego, Agua o Planta
     */
    @Override
    public void attack(IPokemon pokemon) {
        pokemon.attackPlanta();
    }

    /**
     * Pokemon Planta es atacado por un Pokemon Planta
     */
    @Override
    public void attackPlanta() {
        this.setHP(this.getHP() -5);
    }

    /**
     * Pokemon Planta es atacado por un Pokemon Fuego
     */
    @Override
    public void attackFuego() {
        this.setHP(this.getHP() -10);
    }

    /**
     * Pokemon Planta es atacado por un Pokemon Agua
     */
    @Override
    public void attackAgua() {
        this.setHP(this.getHP() -5);
    }


}
