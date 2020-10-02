public class Lamp {

    private boolean status;

    public void setStatus (boolean s){
        this.status = s;

    }

    public boolean getStatus (){
        return this.status;
    }

    public void verifica (){

        if(getStatus() == true){

            System.out.println("Ligado");

        }else{

            System.out.println("Desligado");

        }
    }
}
