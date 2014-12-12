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
    
    /**
     * En este metodo tomamos valores de la clase alimento los dividimos segun la cantidad del mismo que tomamos
     * Todos estos valores se guardan en atributos
     */
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
    public void imprimir()
    {
        float sumatorio;
        sumatorio = proteinasIngeridas+grasasIngeridas+carbohidratosIngeridos; 
        System.out.println("Nombre:" + nombre + "");
        if (proteinasIngeridas == 0 && grasasIngeridas == 0 && carbohidratosIngeridos == 0)
        {
            System.out.println("Gramos de proteinas ingeridos: " + proteinasIngeridas + "" );
            System.out.println("Gramos de carbohidratos ingeridos: " + carbohidratosIngeridos + "" );
            System.out.println("Gramos de grasas ingeridas: " + grasasIngeridas + "" );
        }
        else if (proteinasIngeridas == 0 || grasasIngeridas == 0 || carbohidratosIngeridos == 0)
        {
            if (proteinasIngeridas == 0)
            {
                if (grasasIngeridas == 0 && carbohidratosIngeridos != 0)
                {
                    System.out.println("Gramos de proteinas ingeridos: " + proteinasIngeridas + "");
                    System.out.println("Gramos de carbohidratos ingeridos: " + carbohidratosIngeridos + " (" + (carbohidratosIngeridos * 100) / sumatorio + "%)" );
                    System.out.println("Gramos de grasas ingeridas: " + grasasIngeridas + "" );
                }
            }
            else if(grasasIngeridas == 0)
            {
                if (proteinasIngeridas == 0 && carbohidratosIngeridos != 0)
                {
                    System.out.println("Gramos de proteinas ingeridos: " + proteinasIngeridas + "" );
                    System.out.println("Gramos de carbohidratos ingeridos: " + carbohidratosIngeridos + " (" + (carbohidratosIngeridos * 100) / sumatorio + "%)" );
                    System.out.println("Gramos de grasas ingeridas: " + grasasIngeridas + "" );
                }
            }
            else if(carbohidratosIngeridos == 0)
            {
                if (proteinasIngeridas == 0 && carbohidratosIngeridos != 0)
                {
                    System.out.println("Gramos de proteinas ingeridos: " + proteinasIngeridas + "" );
                    System.out.println("Gramos de carbohidratos ingeridos: " + carbohidratosIngeridos + "" );
                    System.out.println("Gramos de grasas ingeridas: " + grasasIngeridas + " (" + (grasasIngeridas * 100) / sumatorio + "%)" );
                }
            }            
        }
        else if (proteinasIngeridas != 0 || grasasIngeridas != 0 || carbohidratosIngeridos != 0)
        {
            System.out.println("Gramos de proteinas ingeridos: " + proteinasIngeridas + " (" + (proteinasIngeridas * 100) / sumatorio + "%)" );
            System.out.println("Gramos de carbohidratos ingeridos: " + carbohidratosIngeridos + " (" + (carbohidratosIngeridos * 100) / sumatorio + "%)" );
            System.out.println("Gramos de grasas ingeridas: " + grasasIngeridas + " (" + (grasasIngeridas * 100) / sumatorio + "%)" );
        }
        System.out.println("Calorias ingeridas: " + caloriasIngeridas + "" );
    }
}
