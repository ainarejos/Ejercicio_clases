//Se crea la clase Cavallo.
class Cavallo {
    //atributos.
    private String nombre;
    private int edad;
    private String sexo;
    //Constructor.
    public Cavallo(String nombre, int edad, String sexo){
        this.nombre=nombre;
        this.edad=edad;
        this.sexo=sexo;
    }
    //Setters y getters.
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return edad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getSexo() {
        return sexo;
    }
}
//Se crea la clase con el main.
class Ejercicio5_8 {
    public static void main(String[] args) {
        //Se crea un cavallo y se le instroducen los valores de los atributos.
        Cavallo Morgan=new Cavallo("Morgan",5, "Macho");
        System.out.println("El nombre del caballo es: " + Morgan.getNombre() + "," + " su edad es de: " + Morgan.getEdad() + " años y es de sexo: " + Morgan.getSexo());
    }
}
