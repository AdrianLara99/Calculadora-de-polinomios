/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package calculadora;

import java.util.LinkedList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author Simon Alberto Lopez Higuera
 */
public class poli {

    public LinkedList num;
    public LinkedList exp;
    String var="x";

    /**
     * Agrega los coeficientes a este polinomio
     * @param n
     * @return
     */
    public boolean addNum(String n)
    {
        try{
        num=new LinkedList();
        StringTokenizer to=new StringTokenizer(n," ");
        while(to.hasMoreTokens())
        {
            try{
                
            float nq=Float.parseFloat(to.nextToken());
            num.add(nq);    
            }catch(Exception e){
                        JOptionPane.showMessageDialog(null,"Coeficiente no valido");
                        return false;
    
            }
                
            
        }
        //System.out.println("Coeficientes:"+num.size());
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Digite bien los coeficientes");
            return false;
        }
        return true;
    }
    /**
     * Agrega los exponentes a este polinomio
     * @param n
     * @return
     */
    public boolean addExp(String n)
    {
        try{
        exp=new LinkedList();
        StringTokenizer to=new StringTokenizer(n," ");
        while(to.hasMoreTokens())
        {
            try{
            int eq=Integer.parseInt(to.nextToken());
            exp.add(eq);
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "exponente no valido");
                return false;
            }
        }
        //System.out.println("Exponentes:"+exp.size());
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Digite bien los exponentes");
            return false;
        }
        return true;
        
    }
    /**
     * Me ordena el polinomio
     */
    public void ord()
    {
        //System.out.println("Polinomio");
        for (int i = 0; i < exp.size(); i++)
        {
            for (int j = i+1; j <exp.size(); j++)
            {
                int ej,ei;
                ej=(Integer)exp.get(j);
                ei=(Integer)exp.get(i);
                //System.out.println(ej+"<"+ei);
                if(ej<ei)
                {
                    //System.out.println("\t Si");
                    //intercambio exp y coe
                    exp.set(i, ej);
                    exp.set(j, ei);
                    float nj,ni;
                    nj=(Float)num.get(j);
                    ni=(Float)num.get(i);
                    num.set(i, nj);
                    num.set(j, ni);
                    //System.out.println(toString());
                }

            }

        }
    }
    //Me dice si el polinomio tiene todos sus conponentes
    public String com()
    {
        ord();
        if((Integer)exp.getLast()==(exp.size()-1))
        {
            return "Esta completo";
        }else
            return "Esta incompleto";

        
    }
    //esta funcion me completa  los polinomio, es decir, si el pol tiene 1x^2+8x^4 esta funcion me la llena asi:
    // 0x^0+0x^1+1x^2+0x^3+8x^4
    public void completar(int max)
    {
        int m=0;
        float n=0;
        //System.out.println("Polinomio:");
        while(m<=max)
        {
            //System.out.println("m:"+m);
            if(m<exp.size())
            {
               if((Integer)exp.get(m)!=m)
                {
                    //System.out.println("\t Agrego:"+m);
                    exp.add(m, m);
                    num.add(m, n);
                }
            }else{
                //System.out.println("\t Agrego:"+m);
                exp.add(m, m);
                num.add(m, n);
            }
            
            m++;
        }
    }

    @Override
    public String toString()
    {
        String r="";
        for (int i = 0; i < num.size(); i++)
        {
            Float n=(Float)num.get(i);
            int e=(Integer)exp.get(i);
            r=r+" + ("+n+"x^"+e+")";
        }
        return r;


    }

}
