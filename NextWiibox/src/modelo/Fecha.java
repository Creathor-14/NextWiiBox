
package modelo;

public class Fecha {
    private int dia;
    private int mes;
    private int año; 
    public Fecha(){
        this.dia = 0;
        this.mes = 0;
        this.año = 0;
    }
    public Fecha(String fecha){
        String [] fechas =fecha.split("/");
        int d, m, a;
        if(fechas.length == 3){
            try{
                d = Integer.valueOf(fechas[0]);
                m = Integer.valueOf(fechas[1]);
                a = Integer.valueOf(fechas[2]);
            }catch(Exception e){
            throw new NullPointerException("Error en el formato de la fecha"); 
        }
            
        }else{
            throw new NullPointerException("Error en el formato de la fecha");
        }
        try{
            if(verificarFecha(d, m, a)){
                this.dia = d;
                this.mes = m;
                this.año = a;
            }
        }catch(Exception e){
            throw new NullPointerException(e.getMessage()); 
        }        
    }
    public Fecha(int dia, int mes, int año){
        try{
            if(verificarFecha(dia, mes, año)){
                this.dia = dia;
                this.mes = mes;
                this.año = año;
            }
        }catch(Exception e){
            throw new NullPointerException(e.getMessage()); 
        }        
    }
    public int getDia() {
        return dia;
    }
    public int getMes() {
        return mes;
    }
    public int getAño() {
        return año;
    }
    
    public boolean verificarFecha(int dia, int mes, int año){
        //se invetaron las computadoras, hasta un año mas
        if(año<0 || año>24){
            throw new NullPointerException("Año no valido");
        }
        if(mes<1 || mes>12){
            throw new NullPointerException("Mes no valido");
        }
        if(dia<1 || dia>31){
            throw new NullPointerException("Dia no valido");
        }
        if(mes==2 && dia>28){//sin tomar en cuenta bisiestos
            throw new NullPointerException("Este mes solo tiene 28 dias (no hemos implementado bisiestos)");
        }
        /*if((mes==1 || mes==3 || mes ==7 || mes ==8 || mes ==10 || mes ==12) && dia >31){
            throw new NullPointerException("Este mes solo tiene 31 dias");
        }*/
        if((mes==4 || mes ==6 || mes ==9 || mes ==11 ) && dia >30){
            throw new NullPointerException("Este mes solo tiene 30 dias");
        }
        return true;
    }

    @Override
    public String toString() {
        return this.dia + "/" + this.mes + "/" + this.año;
    }
    
}
