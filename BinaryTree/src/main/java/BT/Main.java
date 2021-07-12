package BT;



public class Main {
    private static final int dataA[][]={{10,60,90},{60,20,25},{20,50},{50,70,40},{25,80},{90,15},{15,65,55},{55,75,30}}; 
    private static final int dataB[][]={ {10,20,30}, {20,10}, {30, 40}};
    
    private static Arbol load(int v[][]){
        Arbol t=null;
        
        for (int i=0; i<v.length; i++){
            int padre = v[i][0];            //v[i] = {padre, hijoIzq, hijoDer}
            if (t==null)
                t = new Arbol(padre);
            
            for (int j=1; j<v[i].length; j++){
                t.add(padre, v[i][j]);
            }
        }
        return t;
    }
    
    public static void main(String[] args) {  
        Arbol A = load(dataA);      //Cargar los datos del Arbol A, mostrado en el examen.      
        
        A.Inorden();
        A.niveles();
        System.out.println(A.isDescIncompleto(25));
        System.out.println(A.isDescIncompleto(90));
        System.out.println(A.isDescIncompleto(55));
        System.out.println(A.isDescIncompleto(75));
        System.out.println(A.isDescIncompleto(100));
        System.out.println(A.isDescIncompleto(10));
        System.out.println(A.isDescIncompleto(40));
        System.out.println(A.isDescIncompleto(80));
    }
    
}
