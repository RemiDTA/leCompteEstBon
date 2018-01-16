import java.util.ArrayList;
import java.lang.Math;

// -1 = somme / -2= multiplication / -3= soustraction / -4= division
public class Arbre {
    private int resultat;
    private ArrayList <Arbre> fils= new ArrayList<>();
    private ArrayList <Integer> disponible= new ArrayList<>();
    private ArrayList <Integer> calcul = new ArrayList<>();
    int nbrAtrouver=-1;

   // CONSTRUCTEURS

    public Arbre(int x, ArrayList <Integer> dispo, ArrayList <Arbre> f) 
    {
        resultat = x;
        disponible=dispo;
        fils=f;
    } 
    
    public void nbrATrouver(int n){
    	    nbrAtrouver= n;
    }
    public Arbre(int nb1,int nb2,int nb3,int nb4 ,int nb5,int nb6)
    {
    	    ArrayList <Arbre> fils_vide= new ArrayList<>();
    	    
    	    ArrayList <Integer> liste_ini= new ArrayList<>();

    	    liste_ini.add(nb1);
    	    liste_ini.add(nb2);
    	    liste_ini.add(nb3);
    	    liste_ini.add(nb4);
    	    liste_ini.add(nb5);
    	    liste_ini.add(nb6);
    	    
    	    ArrayList <Integer> liste_fin= new ArrayList<>();
    	    liste_fin.addAll(liste_ini);
    	    
    	    liste_fin.remove(0);
    	    Arbre a1 = new Arbre(nb1,liste_fin, fils_vide);
    	    
    	    liste_fin= new ArrayList<>();
    	    liste_fin.addAll(liste_ini);
    	    liste_fin.remove(1);
    	    Arbre a2 = new Arbre(nb2,liste_fin, fils_vide);
    	    
    	    liste_fin= new ArrayList<>();
    	    liste_fin.addAll(liste_ini);
    	    liste_fin.remove(2);
    	    Arbre a3 = new Arbre(nb3,liste_fin, fils_vide);
    	    
    	    liste_fin= new ArrayList<>();
    	    liste_fin.addAll(liste_ini);
    	    liste_fin.remove(3);
    	    Arbre a4 = new Arbre(nb4,liste_fin, fils_vide);
    	    
    	    liste_fin= new ArrayList<>();
    	    liste_fin.addAll(liste_ini);
    	    liste_fin.remove(4);
    	    Arbre a5 = new Arbre(nb5, liste_fin, fils_vide);
    	    
    	    liste_fin= new ArrayList<>();
	    liste_fin.addAll(liste_ini);
    	    liste_fin.remove(5); 	    
    	    Arbre a6 = new Arbre(nb6, liste_fin, fils_vide);
    	    
    	        	    
    	    ArrayList <Arbre> fils_a0= new ArrayList<>();
    	    fils_a0.add(a1);
    	    fils_a0.add(a2);
    	    fils_a0.add(a3);
    	    fils_a0.add(a4);
    	    fils_a0.add(a5);
    	    fils_a0.add(a6);
    	    
    	    
    	    resultat = 0;
    	    disponible=liste_ini;
    	    fils=fils_a0;
    	    
;
    }
    
    public Arbre(int nb1,int nb2,int nb3)
    {
    	    ArrayList <Arbre> fils_vide= new ArrayList<>();
    	    
    	    ArrayList <Integer> liste_ini= new ArrayList<>();

    	    liste_ini.add(nb1);
    	    liste_ini.add(nb2);
    	    liste_ini.add(nb3);
    	    
    	    ArrayList <Integer> liste_fin= new ArrayList<>();
    	    liste_fin.addAll(liste_ini);
    	    
    	    liste_fin.remove(0);
    	    Arbre a1 = new Arbre(nb1,liste_fin, fils_vide);
    	    
    	    liste_fin= new ArrayList<>();
    	    liste_fin.addAll(liste_ini);
    	    liste_fin.remove(1);
    	    Arbre a2 = new Arbre(nb2,liste_fin, fils_vide);
    	    
    	    liste_fin= new ArrayList<>();
    	    liste_fin.addAll(liste_ini);
    	    liste_fin.remove(2);
    	    Arbre a3 = new Arbre(nb3,liste_fin, fils_vide);
    	    
    	    ArrayList <Arbre> fils_a0= new ArrayList<>();
    	    fils_a0.add(a1);
    	    fils_a0.add(a2);
    	    fils_a0.add(a3);
    	    
    	    resultat = 0;
    	    disponible=liste_ini;
    	    fils=fils_a0;
    }
  
    
    // ACCESSEURS
    public int getValeur() {
        return(resultat);
    }

    

  
     public String parcourLargeur(){
     	      ArrayList <Arbre> liste= new  ArrayList<>() ;
     	      liste.add(this); // ajoute le noeud initial
     	      String resCalc="";
     	      boolean nbrTrouver=false;
     	      Arbre nombreLePlusProche=liste.get(0);
     	      
     	      int test=0;
     	      while((liste.size()>0)&&(nbrTrouver==false)){ //tant que liste non vide et que le nombre n'a pas ete trouver
     	      	    Arbre arbre= liste.get(0); 
     	      	  //  System.out.println(" = ==== "+ liste.get(0).getValeur());
     	      	   // System.exit(0);
     	      	   // System.out.println("s= "+arbre.resultat);
     	      	   
     	      	    
     	      	    if(arbre.getValeur()==nbrAtrouver){ //si le nombre a ete trouver
     	      	    	    nbrTrouver=true;
     	      	    	    /*for(int k=0; k<arbre.calcul.size(); k++){
     	      	    	    	    System.out.println(arbre.calcul.get(k));
     	      	    	    }*/
     	      	    	    resCalc=afficherRes(arbre);
     	      	    }else{
     	      	    	   /* for(int k=0; k<arbre.disponible.size(); k++){
     	      	    	    	    System.out.println(arbre.disponible.get(k));
     	      	    	    }*/
     	      	   
			    /* int tm1,tm2,tm3, tm4;    //evite de soustraire le mauvais nombre pour l'etape d'apres
			   if(nombreLePlusProche.getValeur()!=0){
				    if(nbrAtrouver>arbre.getValeur()){
					   tm1=nbrAtrouver;
					   tm2=arbre.getValeur();
				    }
				    else{ 
					    tm1=arbre.getValeur();
					    tm2=nbrAtrouver;
				    }
				     if(nombreLePlusProche.getValeur()>nbrAtrouver){
					   tm3=nombreLePlusProche.getValeur();
					   tm4=nbrAtrouver;
				    }
				    else{ 
					    tm3=nbrAtrouver;
					    tm4=nombreLePlusProche.getValeur();
				    }
			    
			    
				    if(tm1-tm2<tm3-tm4){  //verifie si le nombre est plus proche de la valeur
					    nombreLePlusProche=arbre;
				    }
			    }*/
			

			  
			     if(arbre.getValeur()!=0){
			     	    ArrayList <Arbre> f= new ArrayList<>();//clean les fils (pointeur)
			     	    arbre.fils=f;  
			     	   // System.out.println("g=="+arbre.fils.size());
				  calculer(arbre);
			     }
		    }
		     int i=0;
			if (test==0)
				{
					i=1;
				}
    	   	    
    	   	     
    	   	     	     
    	   	    while((arbre.fils!=null)&&(i<arbre.fils.size()))
			  {
				  //On insere le ième fils dans la liste
				  liste.add(arbre.fils.get(i));
			
				  i++; 
			
			  }
			  
			  liste.remove(0);
			//System.out.println("val abso1 " +Math.abs(nombreLePlusProche.getValeur()-nbrAtrouver) +"val abso2 "+Math.abs(arbre.getValeur()-nbrAtrouver));
			
			  	if (Math.abs(nombreLePlusProche.getValeur()-nbrAtrouver)>Math.abs(arbre.getValeur()-nbrAtrouver))
			   	   {
			   	   	   nombreLePlusProche=arbre;
			
			  	     //System.exit(0);
			  	   }
			  test++;
			  
			  
     	      }
     	      
     	      if(nbrTrouver==false){
     	      	      Arbre arbre=nombreLePlusProche;
     	      	      //System.out.println("cc");
     	      	      //System.out.println(test);
     	      	    resCalc=afficherRes(arbre);
     	      	    
     	      }
     	      return resCalc;
     }
     
     
    public void calculer(Arbre a){
    	    int k=0;
    	    
    	    ArrayList <Arbre> f= new ArrayList<>();//clean les fils (pointeur)
    	   a.fils=f;
    	    
    	  // System.out.println("dispo =" + a.disponible.size());
    	    for(int i=0; i<a.disponible.size();i++){
    	    	    
    	    	    int resAddition= a.getValeur()+ a.disponible.get(i).intValue();
    	    	    int resMultiplication= a.getValeur()* a.disponible.get(i).intValue();
    	    	    int resSoustraction;
    	    	    float resDivision;
    	    	    if(a.getValeur()> a.disponible.get(i).intValue()){
    	    	    	    resSoustraction= a.getValeur()- a.disponible.get(i).intValue();
    	    	    	    resDivision= (float)a.getValeur()/ a.disponible.get(i).intValue();
    	    	    }else{
    	    	    	    resSoustraction=a.disponible.get(i).intValue() - a.getValeur();
    	    	    	    resDivision=(float)a.disponible.get(i).intValue() / a.getValeur();
    	    	    }
    	    	    
    	    	  //  System.out.println("add= " + resAddition);
    	    	    
    	    	    int b=0;
    	    	    ArrayList <Integer> dispoTmp=new ArrayList<>();
    	    	       	    	    
    	    	    while (b<a.disponible.size())
    	    	    	    {
    	    	    	    	    dispoTmp.add(a.disponible.get(b));
    	    	    	    	    b++;
    	    	    	    }

    	    	    dispoTmp.remove(i);
    	    	   
    	    	    Arbre arbreFils=new Arbre(resAddition, dispoTmp, f);
    	    	    a.fils.add(arbreFils);
    	    	    
    	    	    
    	    	    if(calcul!=null){
    	    	    	    for(int l=0; l<a.calcul.size(); l++){ //copie la liste de calcul du pere
    	    	    	    	arbreFils.calcul.add(a.calcul.get(l));	    
    	    	    	    }
    	    	    }
    	    	    arbreFils.calcul.add(a.getValeur());
    	    	    arbreFils.calcul.add(-1);
    	    	    arbreFils.calcul.add(a.disponible.get(i).intValue());
    	    	    
    	    	    /*** Arbre fils Multiplication ***/
    	    	    
    	    	    Arbre arbreFilsMultip=new Arbre(resMultiplication, dispoTmp, f);
    	    	    a.fils.add(arbreFilsMultip);
    	    	   // System.out.println("multi = " + resMultiplication);
    	    	    
    	    	    if(calcul!=null){
    	    	    	    for(int l=0; l<a.calcul.size(); l++){ //copie la liste de calcul du pere
    	    	    	    	arbreFilsMultip.calcul.add(a.calcul.get(l));	    
    	    	    	    }
    	    	    }
    	    	   arbreFilsMultip.calcul.add(a.getValeur());
    	    	   arbreFilsMultip.calcul.add(-2);
    	    	   arbreFilsMultip.calcul.add(a.disponible.get(i).intValue());
    	    	   
    	    	   /*** Arbre fils soustraction ***/
    	    	   
    	    	   if(resSoustraction!=0){
			   Arbre arbreFilsSous=new Arbre(resSoustraction, dispoTmp, f);
			    a.fils.add(arbreFilsSous);
			    
			    if(calcul!=null){
				    for(int l=0; l<a.calcul.size(); l++){ //copie la liste de calcul du pere
					arbreFilsSous.calcul.add(a.calcul.get(l));	    
				    }
			    }
			    
			    if(a.getValeur()>a.disponible.get(i).intValue()){
				  arbreFilsSous.calcul.add(a.getValeur());
				  arbreFilsSous.calcul.add(-3);
				  arbreFilsSous.calcul.add(a.disponible.get(i).intValue());
			    }else{
				arbreFilsSous.calcul.add(a.disponible.get(i).intValue());  
				arbreFilsSous.calcul.add(-3);
				 arbreFilsSous.calcul.add(a.getValeur());
			    }
		   }
		     /*** Arbre fils division ***/
		  int resDiv= (int) resDivision;
		  
		   if(resDiv-resDivision==0){
			   Arbre arbreFilsDiv=new Arbre(resDiv, dispoTmp, f);
			    a.fils.add(arbreFilsDiv);
			   
			    
			    if(calcul!=null){
				    for(int l=0; l<a.calcul.size(); l++){ //copie la liste de calcul du pere
					arbreFilsDiv.calcul.add(a.calcul.get(l));	    
				    }
			    }
			    
			    if(a.getValeur()>a.disponible.get(i).intValue()){
				  arbreFilsDiv.calcul.add(a.getValeur());
				  arbreFilsDiv.calcul.add(-4);
				  arbreFilsDiv.calcul.add(a.disponible.get(i).intValue());
			    }else{
				arbreFilsDiv.calcul.add(a.disponible.get(i).intValue());  
				arbreFilsDiv.calcul.add(-4);
				arbreFilsDiv.calcul.add(a.getValeur());
			    }
		   }
    	    }
    		    
    }

     public String afficherRes(Arbre a){
     	     String resultat="";
     	     String res="";
     	      for (int i=0; i<a.calcul.size(); i=i+3)
	    {
		   res="";
		    int nb1=a.calcul.get(i);
		    int nb2=a.calcul.get(i+2);
		    int operateur=a.calcul.get(i+1);
		    int result;
		    
		    // System.out.print(nb1);
		     res=res+nb1;
		    if (operateur==-1)
		    {
			   // System.out.print(" + ");
			    res=res+" + ";
			    result=nb1+nb2;
			    
		    }
		    else
			    if (operateur==-2)
		    {
			  //  System.out.print(" * ");
			    res=res+" * ";
			    result=nb1*nb2;
		    }
		    else
			    if (operateur==-3)
		    {
			   // System.out.print(" - ");
			     res=res+" - ";
			    result=nb1-nb2;
		    }
		    else
		    {
			  //  System.out.print(" / ");
			    res=res+" / ";
			    result=nb1/nb2;
		    }    
		    
		 //   System.out.print(nb2 +" = " +result);
		    res=res+nb2+" = "+result+"\n";
		   // System.out.println("");
		    resultat=resultat+res;
		   
    }
   return resultat;
}
    	    
}

