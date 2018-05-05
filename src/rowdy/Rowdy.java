/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rowdy;

/**
 *
 * @author gtfghf
 */
public class Rowdy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
     static boolean equal(int[] a, int[] b) {
         boolean equal=true;
       for(int i=0;i<a.length;i++)
       {
           if(a[i]!=b[i])
           {
               equal=false;
               break;
           }
       }
       //To change body of generated methods, choose Tools | Templates.
        return equal;
    }
    public  int sum(int []a)
    {
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum=sum+a[i];
            
        }
        
        return sum;
    }
       public  int arraymultiplily(int []a)
    {
        int sum=1;
        for(int i=0;i<a.length;i++)
        {
            sum=sum*a[i];
            
        }
        
        return sum;
    }
        public int addition(int m,int n)
  {
      
      int s=m+n;
      return s;
  }
   
  public int subtraction(int m,int n)
  {
      int a=m-n;
      return a;
  }

  public int multiply(int s,int d)
  {
      int k=s*d;
      return k;
  }
    public boolean linearsearch(int a[],int key)
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==key)
            {
                return true;
            }
        }
        return false;
    }
    public boolean vowelcheck(char[]a)
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]=='a'|| a[i]=='e' || a[i]=='i'|| a[i]=='o' || a[i]=='u')
            {
                return true;
            }
        }
        return false;
    }
    public boolean capitalcheck(String name)
    {
        if(name=="islamabad")
        {
            return true;
        }
        return false;
    }
    public boolean bestplayer(String name)
    {
        if(name=="messi")
        {
            return true;
        }
        return false;
    }
    public String nationality(String date)
    {
        String country=null;
        if(date=="14")
        {
            country="pakistan";
            return country;
        }
        else if(date=="15")
        {
            country="india";
            return country;
        }
        else
            return "unknown";
        
    }
    
}
