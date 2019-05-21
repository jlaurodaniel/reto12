
package reto12;

import javax.swing.JOptionPane;


public class Reto12 {

    
    public static void main(String[] args) {
        int caballo,vida=20 ,pasto,Comodin,trampa,Cuenta,Camino;
        String nombre,aux,jugar;
        boolean juego=false;
        
        do{
        
            JOptionPane.showMessageDialog(null,"Imagina que dentro de un mundo virtual cada uno de sus habitantes tiene un caballo para poder trasladarse\n" +
" dicho caballo come pasto y cada que se topa con él\n" +
" aumenta su nivel de vida; sin embargo, cada vez que se topa con una trampa\n" +
" sus patas se lastiman y su nivel de vida disminuye. \n" +
"Otra peculiaridad que tiene el caballo es que cada cinco kilómetros se detiene a esperar que le digan qué hay enfrente.\n" +
"Si hay pasto se lo come y si hay una trampa no tiene otra opción más que ir adelante. \n" +
"Sin embargo, en el camino se puede encontrar paquetes de vida\n" +
", que aumentan el nivel de vida al dueño del caballo; o bien bombas, que disminuyen la vida a ambos.\n" +
"tienes que decirle al caballo la cantidad de kilómetros que hay que recorrer\n" +
"\n" +
"cada cinco kilómetros el caballo esperará a que le digas qué hay enfrente, hasta llegar al lugar deseado.");
            
            aux=JOptionPane.showInputDialog(null,"Cuantos kilometro recorera el caballo");
            Camino=Integer.parseInt(aux);
        
            if(Camino>=5){
                for(int i=Camino;i>4;){
                      i-=5;
                      
                      Comodin=(int)(Math.random()*5);
                      if(Comodin==2){
                      JOptionPane.showMessageDialog(null,"te has encontrado una bomba en el camino se restaran 3 puntos de tu vida ");
                      vida-=3;
                      }else if(Comodin==3) {JOptionPane.showMessageDialog(null,"te has encontrado una paquete de vida en el camino se han sumado 5 puntos a tu vida "); vida+=5;}
                      
                  aux=JOptionPane.showInputDialog("5 Kilometros recorridos quedan "+i+" kilometros por recorrer..\n"+"Que hay frente al caballo, pasto o trampa ?");
                  
                      if(aux.equals("pasto")){
                      JOptionPane.showMessageDialog(null,"Se ha añadido 5 puntos de vida");
                      vida+=5;
                      }else if(aux.equals("trampa")){
                      JOptionPane.showMessageDialog(null,"Se ha quitado 5 puntos de vida");
                      vida-=5;
                      }
                      juego=true;
                      if(i<1){
                         juego=false;
                         JOptionPane.showMessageDialog(null,"Ganaste!!!! ,llegaste a tu destino , juego finalizado....");
                      }else if(vida<1){
                         juego=false;
                         JOptionPane.showMessageDialog(null,"Perdiste!!! :C  se acabo la vida, juego finalizado....");
                      }else JOptionPane.showMessageDialog(null,"Te quedan "+vida+" de vida y "+i+" kilometros por recorrer");
                      
                      
                      if(vida<1){i=0;}
                }
                
                
                
            }else JOptionPane.showMessageDialog(null,"Necesitan ser mas de 5 kilometros ...");
            
         jugar=JOptionPane.showInputDialog(null,"Jugar de nuevo? si/no");   
         
         if(jugar.equals("si")){
         juego=true;
         }
            
        }while(juego);
        
        
        
        
    }
    
}
