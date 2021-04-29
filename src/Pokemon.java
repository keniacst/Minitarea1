import java.util.Objects;

public abstract class Pokemon implements IPokemon{
    private String name;
    private String species;
    private int HP;

    /**
     * Constructor de un Pokemon, tiene nombre, especie y puntos de vida
     * El tipo se define como subclases (Fuego, Agua y Planta)
     * @param name nombre
     * @param species especie
     * @param HP vida
     */
    public Pokemon(String name, String species, int HP){
        this.name=name;
        this.species=species;
        this.HP=HP;

    }

    /**
     * Retorna el nombre del Pokemon
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Cambia el nombre del Pokemon a name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retorna la especie del Pokemon
     * @return
     */
    public String getSpecies() {
        return species;
    }

    /**
     * Cambia la especie del Pokemon a species
     * @return
     */
    public void setSpecies(String species) {
        this.species = species;
    }

    /**
     * Retorna la HP del Pokemon
     * @return
     */
    public int getHP() {
        return HP;
    }

    /**
     * Cambia la HP del Pokemon a HP
     * @param HP
     */
    public void setHP(int HP) {
        this.HP = HP;
    }

    /**
     *  Método de ataque
     * @param pokemon Un pokemon cualquiera, ya sea tipo Fuego, Agua o Planta
     */
    public abstract void attack(IPokemon pokemon);

    /**
     * Retorna true si el Pokemon está fuera de combate y false si sigue en combate
     * @return
     */
    public boolean KO(){
        return HP <= 0;
    }

    /**
     * Comparación de Pokemon
     * @param o cualquier pokemon a comparar
     * @return
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pokemon)) return false;
        Pokemon pokemon = (Pokemon) o;
        return HP == pokemon.HP &&
                name.equals(pokemon.name) &&
                species.equals(pokemon.species);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, species, HP);
    }
}
