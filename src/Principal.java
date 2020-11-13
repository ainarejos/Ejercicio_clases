class persona{
    private char nombre;
    private int edad;
    public void llamar(){
        System.out.println(nombre + " " + edad);
    }
}

class test{
    public static void main(String[] args) {
        persona tofol=new persona();
        tofol.llamar();
    }
}
