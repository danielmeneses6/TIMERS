
package informe3;

import java.time.LocalDateTime;
import java.util.Timer;
import java.util.TimerTask;
public class Cronometro {
    public void hora()
    {
        LocalDateTime tiempo=LocalDateTime.now();
        int horas;
        int minutos;
        int segundos;
        int auxsegundos=0;
        boolean bandera=true;
        while(true)
        {
         horas=tiempo.getHour();
         minutos=tiempo.getMinute();
         segundos=tiempo.getSecond();
            if(bandera==true)
            {
                System.out.println("Hora actual:" + horas+":" + minutos+":"+ segundos );
            bandera=false;
            }
           else
         if(bandera==false)
          {
        if(auxsegundos>segundos)
        {
            System.out.println("Hora actual:" + horas+":" + minutos+":"+ segundos );
        }       
          }
            auxsegundos=tiempo.getSecond();
            System.out.println(tiempo.getSecond());
        }
         
    }
}
