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
        trabajador tofol=new trabajador();
        tofol.setall("Manolo","Cuesta","informatico");
        tofol.datos();
    }
}
