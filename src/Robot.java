public class Robot {

    protected  Bateria bateria;
    protected boolean dormido;

    public Robot() {
    }

    public Robot(Bateria bateria, boolean dormido) {
        this.bateria = bateria;
        this.dormido = dormido;
    }

    public Bateria getBateria() {
        return bateria;
    }

    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }

    public boolean isDormido() {
        return dormido;
    }

    public void setDormido(boolean dormido) {
        this.dormido = dormido;
    }

    public int avanzar(int pasos){
        if (pasos>=100){
            bateria.carga=bateria.carga-10;
        }
        return bateria.carga;
    }
    public int retroceder(int pasos){
        if (pasos>=100){
            bateria.carga=bateria.carga-10;
        }
        return bateria.carga;
    }
    public boolean dormir(){
        dormido=true;
        System.out.println("El robot esta dormido");
        return true;
    }
    public boolean despertar(){
        dormido=false;
        System.out.println("El robot esta despierto");
        return false;
    }
    public int recargar(){
        bateria.carga=1000;
        return bateria.carga;
    }
    public boolean bateriaLlena(){
        if (bateria.carga<1000){
            return false;
        }else{
            return true;
        }
    }
    public boolean bateriaVacia(){
        if (bateria.carga!=0){
            return false;
        }else {
            return true;
        }
    }
    public int energiaActual(){
        System.out.println("Su cantidad actual de energia es: ");
        return bateria.carga;
    }
    public String estaDormido(){
        if (dormido==false){
            System.out.println("El robot no esta dormido");
        }else {
            return "El robot esta dormido";
        }
    }

    @Override
    public String toString() {
        return "Robot{" +
                "bateria=" + bateria +
                ", dormido=" + dormido +
                '}';
    }
}

