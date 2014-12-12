public class Alimento
{
    //La cantidad de proteina
    private float proteinas;
    //La cantidad de grasas
    private float grasas;
    //La cantidad de carbohidratos
    private float carbohidratos;
    //El nombre del alimento
    private String nombre;
    //Las calorias dependen de la cantidad de macronutrientes
    private float calorias;

    /**
     * Contructor donde daremos el valor inicial del objeto alimento
     */
    public Alimento(float proteinas, float grasas, float carbohidratos, String nombre)
    {
        this.proteinas = proteinas;
        this.grasas = grasas;
        this.carbohidratos = carbohidratos;
        this.nombre = nombre;
        calorias = (proteinas * 4) + (grasas * 9) + (carbohidratos * 4);
    }
    
    public float getProteinas()
    {
        return proteinas;
    }
    
    public float getGrasas()
    {
        return grasas;
    }
    
    public float getCarbohidratos()
    {
        return carbohidratos;
    }
    
    public float getCalorias()
    {
        return calorias;
    }
    
    public String getNombre()
    {
        return "" + nombre + "";
    }

    /**
     * Muestra la informacion nutricional
     */
    public void muestraDatos ()
    {
        System.out.println("Nombre: " + nombre + "");
        System.out.println("Proteinas por cada 100 gramos: " + proteinas + "");
        System.out.println("Carbohidratos por cada 100 gramos: " + carbohidratos + "");
        System.out.println("Grasas por cada 100 gramos: " + grasas + "");
        System.out.println("Calorias: " + calorias + "");
        if (proteinas > grasas)
        {
            if (grasas > carbohidratos)
            {
                System.out.println("Componente/s mayoritario/s: Proteinas y grasas");
            }
            else
            {
                System.out.println("Componente/s mayoritario/s: Proteinas y carbohidratos");
            }
        }
        else if (proteinas > carbohidratos)
        {
            if (grasas > carbohidratos)
            {
                System.out.println("Componente/s mayoritario/s: Proteinas y grasas");
            }
            else
            {
                System.out.println("Componente/s mayoritario/s: Proteinas y carbohidratos");
            }
        }
        else if (grasas > proteinas)
        {
            if (proteinas > carbohidratos)
            {
                System.out.println("Componente/s mayoritario/s: Grasas y proteinas");
            }
            else
            {
                System.out.println("Componente/s mayoritario/s: Grasas y carbohidratos");
            }
        }
        else if (proteinas == grasas)
        {
            if (proteinas < carbohidratos)
            {
                System.out.println("Componente/s mayoritario/s: Carbohidratos");
            }
            else
            {
                System.out.println("Componente/s mayoritario/s: Proteinas y grasas");
            }
        }
        else if (carbohidratos == proteinas)
        {
            if (carbohidratos < grasas)
            {
                System.out.println("Componente/s mayoritario/s: Grasas");
            }
            else
            {
                System.out.println("Componente/s mayoritario/s: Carbohidratos y proteinas");
            }
        }
        else if (grasas == carbohidratos)
        {
            if (proteinas > grasas)
            {
                System.out.println("Componente/s mayoritario/s: Proteinas");
            }
            else
            {
                System.out.println("Componente/s mayoritario/s: Carbohidratos y grasas");
            }
        }
        else if (grasas == proteinas && carbohidratos == proteinas)
        {
            System.out.println("Componente/s mayoritario/s: Ninguno en especial");
        }
    }
}
