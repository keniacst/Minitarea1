public class Fuego extends Pokemon{

    /**
     * Constructor, utiliza super() para llamar al del padre
     * @param name nombre
     * @param species especie
     * @param HP vida
     */
    public Fuego(String name, String species, int HP){
        super(name,species,HP);
    }

    /**
     * Un Pokemon random (pokemon) es atacado por un Pokemon Fuego
     * @param pokemon un pokemon cualquiera
     */
    @Override
    public void attack(IPokemon pokemon) {
        pokemon.attackFuego();
    }

    /**
     * Pokemon Fuego es atacado por un Pokemon Fuego
     */
    @Override
    public void attackFuego(){
        this.setHP(this.getHP() -5);
    }

    /**
     * Pokemon Fuego es atacado por un Pokemon Agua
     */
    @Override
    public void attackAgua() {
        this.setHP(this.getHP() -10);
    }

    /**
     * Pokemon Fuego es atacado por un Pokemon Planta
     */
    @Override
    public void attackPlanta() {
        this.setHP(this.getHP() -5);
    }


}

