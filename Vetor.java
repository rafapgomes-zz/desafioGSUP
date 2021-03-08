import java.util.ArrayList;
import java.lang.Math;

public class Vetor{

  int ele1,ele2,prev,prox,ind1,ind2;
  ArrayList<Integer> vetor = new ArrayList<Integer>();
   public Vetor(int tam)
   {    
    int j=1;
    for(int i=0; i<tam; i++)
    {
	    vetor.add(j);
	    j = j+1;
    }

   }

  public void espacos(int init, int i)
  {
     int ind = pos(init);
     int qnt = ind-i;
     qnt = Math.abs(qnt);
     for(int j=0; j<qnt-1; j++)
     {
       System.out.print("^");
     }
  }
  
public int prev (int i,int tam)
{
  if (i!=0)
  {
    return i-1;    
  }else
  {
    return tam-1;
  }
}

public int prox (int i,int tam)
{
    return (i+1)%tam;
}

public int pos (int vlr){
  for (int i=0; i<vetor.size(); i++)
    if (vlr == vetor.get(i))
      return i;
  return 0;
}

public int buscaProxF(int vlr, int del){
  int i = pos(vlr);
  
  int tamVet = vetor.size();
  while (true){
      del--;
      if (del == 0){
        ele1 = vetor.get(i);
        ind1= i;
        int prox = vetor.get(prox(i,tamVet));
        return prox;
      }
      i =  prox(i,tamVet);
  } 
}

public int buscaProxT(int vlr, int del){
  int i = pos(vlr);
  
  int tamVet = vetor.size();
  while (true){
      del--;
      if (del == 0){
        ele2 = vetor.get(i);
        ind2 = i;
        int prev = vetor.get(prev(i,tamVet));
        return prev;
      }
      i =  prev(i,tamVet);
  } 
}

public void testaigualdade(int vlr,int del,int vlr2,int del2)
{
   prox = buscaProxF(vlr, del);
   prev = buscaProxT(vlr2, del2);

   if(ele1==ele2)
   {
     espacos(vlr,ind1);
     System.out.print(ele1+" ");

     exclui(ele1);
   }else{
     espacos(vlr,ind1);

     System.out.print(ele1+" ");
     
     espacos(vlr2,ind2);

     System.out.print(ele2+" ");
     exclui(ele1);
     exclui(ele2);

   }
}
public void exclui(int k)
{
  for(int i=0; i<vetor.size();i++)
  {
    if(vetor.get(i)==k)
    {
      vetor.remove(i);
    }
  }
  
}

}

