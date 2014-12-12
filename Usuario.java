public class Usuario
{
    // Aqui se gaurda el nombre del usuario
    private String nombre;
    //En esta variable se guarda la cantidad de proteinas que ha comido el usuario
    private float proteinasIngeridas;
    //En esta variable se guarda la cantidad de grasas que ha comido el usuario
    private float grasasIngeridas;
    //En esta variable se guarda la cantidad de carbohidratos que ha comido el usuario
    private float carbohidratosIngeridos;
    //En esta variable se guarda la cantidad de calorias que ha comido el usuario
    private float caloriasIngeridas;

    /**
     * Constructor donde inicializamos atributos
     */
    public Usuario(String nombre)
    {
        //Pedimos que introduzca un nombre para el objeto
        this.nombre = nombre;
        //el resto de atributos los igualamos a 0
        proteinasIngeridas = 0;
        grasasIngeridas = 0;
        carbohidratosIngeridos = 0;
        caloriasIngeridas = 0;
    }

    public void comer (Alimento consu, float cantidad)
    {
        proteinasIngeridas = proteinasIngeridas + ((consu.getProteinas()*cantidad)/100);
        grasasIngeridas = grasasIngeridas + ((consu.getGrasas()*cantidad)/100);
        carbohidratosIngeridos = carbohidratosIngeridos + ((consu.getCarbohidratos()*cantidad)/100);
        caloriasIngeridas = caloriasIngeridas + ((consu.getCalorias()*cantidad)/100);
    }
    
    /**
     * No definitivo!!!!!
     */
    public void noTerminado()
    {
        //
        System.out.println("Nombre:" + nombre + "");   
        System.out.println("Gramos de proteinas ingeridos: " + proteinasIngeridas + "");
        System.out.println("Gramos de carbohidratos ingeridos: " + carbohidratosIngeridos + "");
        System.out.println("Gramos de grasas ingeridos: " + grasasIngeridas + "");
        System.out.println("Calorias ingeridas: " + caloriasIngeridas + "");
    }
}
