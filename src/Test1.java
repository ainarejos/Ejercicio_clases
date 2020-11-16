
class trabajador{
    private String nombre;
    private String apellido;
    private String puesto;

    public void datos(){
        System.out.println(nombre + " " + apellido + " " + puesto);
    }
    public void setall(String e,String b,String c){
        nombre=e;
        apellido=b;
        puesto=c;
    }
}


class test1{
    public static void main(String[] args) {
        System.out.println("1r trabajador");
        trabajador tofol=new trabajador();
        tofol.setall("Tofol","Cuesta","informatico");
        tofol.datos();

        System.out.println("2n trabajador");
        trabajador Manolo=new trabajador();
        Manolo.setall("Manolo","Cuesta","informatico");
        Manolo.datos();
    }
}
