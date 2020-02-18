package ico.fes.poo;

public class Reloj {
    
    private int hora;
    private int minuto;
    private int segundo;
    private boolean contador=true;    
    public Reloj(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }    
    
    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }
    
    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }
    
    public int getSegundo(){
        return segundo;
    }
    
    public void setSegundo(){
        this.segundo = segundo;
    }
       
    public void mostrarhora(){
        
        while(contador=true);
        
            if(hora<10){ 

                System.out.print("0");

            }       
            System.out.print(this.hora + ":");


            if(minuto<10){ 

                System.out.print("0");

            }        
            System.out.print(this.minuto + ":");


            if(segundo<10){ 

                System.out.print("0");

            }
            System.out.println(this.segundo);
            
            
            incrementarSegundo();  
            
   
            try { 
                Thread.sleep(1000);
               }
            catch(InterruptedException e) {
            }
            
        }
        
    }
    public void incrementarSegundo(){
    
        segundo++;
        if(segundo>59){ segundo=0;
            incrementarMinuto();         
        }
    
    }
    public void incrementarMinuto(){
    
        minuto++;
        if(minuto>59){ 
            minuto=0;
            incrementarHora(); 
        }
    
    }
    public void incrementarHora(){
        
        hora++;
        if(hora>23) { 
            reset();
        }
        
    }   
    public void reset(){
        
        segundo=0;
        minuto=0;
        hora=0;
        
    }   
}
