public interface IPokemon {
    /**
     * Un Pokemon random (pokemon) es atacado.
     * @param pokemon
     */
    void attack(IPokemon pokemon);

    /**
     * Un Pokemon (Fuego, Agua o Planta) es atacado por un Pokemon Fuego
     */
    void attackFuego();

    /**
     * Un Pokemon (Fuego, Agua o Planta) es atacado por un Pokemon Agua
     */
    void attackAgua();

    /**
     * Un Pokemon (Fuego, Agua o Planta) es atacado por un Pokemon Planta
     */
    void attackPlanta();

}
