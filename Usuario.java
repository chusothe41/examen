import java.util.ArrayList;
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
    //Aqui se guarda el nombre del objeto alimento consumido mas calorico hasta el momento
    private String masCalorico;
    //Aqui se guada la cantidad de calorias del objeto alimento que mas tiene por cada 100
    private float maximas;

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
        masCalorico = "Ninguno";
    }
    
    /**
     * En este metodo tomamos valores de la clase alimento los dividimos segun la cantidad del mismo que tomamos
     * Todos estos valores se guardan en atributos
     */
    public void comer (Alimento consu, float cantidad)
    {
        if (consu.getCalorias() > maximas)
        {
            maximas = consu.getCalorias();
            masCalorico = consu.getNombre();
        }
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
    
    /**
     * Metodo getter que devueve la cantidad de calorias
     */
    public float getCalorias()
    {
        return caloriasIngeridas;
    }
    
    /**
     * Metodo getter que devueve el nombre del usuario
     */
    public String getNombre()
    {
        return "" + nombre + "";
    }
    
    /**
     * Metodo de comparacion introduces un valor y lo compara con el de otro objeto usuario
     */
    public void comparacion(Usuario comparado)
    {
        if (caloriasIngeridas == comparado.getCalorias())
        {
            System.out.println("Han consumido la misma cantidad");
        }
        else
        {
            if(caloriasIngeridas > comparado.getCalorias())
            {
                System.out.println("Has consumido mas calorias que " + comparado.getNombre() + "");
            }
            else
            {
                System.out.println("Has consumido menos calorias que " + comparado.getNombre() + "");
            }
        }
    }
    
    /**
     * Imprime por pantalla el alimento mas calorico
     */
    public void masCaloricoHastaElMomento()
    {
        System.out.println("Alimento más calórico ingerido por el usuario hasta el momento: " + masCalorico +"");
    }
}
