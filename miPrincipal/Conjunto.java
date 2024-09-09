package miPrincipal;
public class Conjunto {
	static int M = 20; //Aumento de la capacidad
	private Object cto[];
	private int cardinal;
	private int capacidad;
	//Operaciones
	public Conjunto()
	{
		cto = new Object[M];
		cardinal = 0;
		capacidad = M;
	}
	//determina si el conjunto esta vacio
	public boolean esVacio()
	{
	   return (cardinal == 0);
	}
	//añade un elemento si no está en el conjunto
	public Conjunto añadir(Object elemento)
	{
		if (pertenece(elemento)) {
			return this; // El elemento ya está presente, no se hace nada
		}
	
		// Verificar si el conjunto está lleno
		if (cardinal >= capacidad) {
			// Aumentar la capacidad
			capacidad *= 2;
			Object[] nuevoCto = new Object[capacidad];
			System.arraycopy(cto, 0, nuevoCto, 0, cto.length);
			cto = nuevoCto;
		}
	
		// Agregar el nuevo elemento
		cto[cardinal++] = elemento;
		return this;
		//coloque aquí el código faltante
		
		
	}
	

	public Conjunto retirar(Object elemento)
	{
		int i;
    for (i = 0; i < cardinal; i++) {
        if (cto[i].equals(elemento)) {
            break;
        }
    }

    // Si el elemento no está en el conjunto
    if (i == cardinal) {
        return this; // No se hace nada
    }

    // Mover los elementos posteriores hacia la izquierda
    for (int j = i; j < cardinal - 1; j++) {
        cto[j] = cto[j + 1];
    }

    // Decrementar el cardinal
    cto[--cardinal] = null;
    return this;
		//coloque aquí el código faltante

	}
	//busca si un elemento pertenece al conjunto
	public boolean pertenece(Object elemento)
	{
		for (int i = 0; i < cardinal; i++) {
			if (cto[i].equals(elemento)) {
				return true; // El elemento está en el conjunto
			}
		}
		return false; // El elemento no está en el conjunto
		//coloque aquí el código faltante
	}
	//devuelve el número de elementos
	public int cardinal()
	{
		return this.cardinal;
	}
	//Operacion union de dos conjuntos
	public Conjunto union(Conjunto c2)
	{
		Conjunto u = new Conjunto();
		// primero copia el primer operando de la union
		for(int k = 0;k<cardinal;k++)
			u.cto[k] = cto[k];
		u.cardinal = cardinal;
		//añade los elementos de c2 no incluidos
		for (int k=0;k<c2.cardinal;k++)
			u.añadir(c2.cto[k]);
		return u;
	}
	public Object elemento(int n) throws Exception
	{
	  if (n<=cardinal)
		return cto[--n];
	  else
		throw new Exception("Fuera deRango");
	}
	
	public String toString()
	{
		String s = "{";
		for(int k = 0;k<cardinal;k++)
			s += cto[k].toString() + ",";
		if (cardinal>0)
			s = s.substring(0,s.length()-1);
		s += "}";
		return s;
	}

}