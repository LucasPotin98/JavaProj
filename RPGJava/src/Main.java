
package mapping;
import java.util.Scanner;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("Hello World");
			System.out.println(" Worlhuehufh");
	}



public class main{
	// ici on crée la map
    public static void main(String[] args){
        // Création de la map
        int[][] map = new int[10][10];
        for(int i = 0; i < map.length; i++){
            map[i] = new int[10];
        }
        
       // on initialise la position du perso 
       int pospersonnageX =0 ;
       int pospersonnageY =0 ;
       
        map[pospersonnageX][pospersonnageY]=1;
        
        char inp = 'z';
     // Affichage de la map
        for(int i = 0; i < map.length; i++){
            for(int j = 0; j < map[i].length; j++){
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        // on bouge avec zqsd
        while(inp=='z'|| inp=='q'|| inp=='s'|| inp=='d') {
        	
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Choisir une direction");
        String str=sc.nextLine();
        inp= str.charAt(0);
        if(inp=='d') {
        	map[pospersonnageX][pospersonnageY]=0;
        	if (pospersonnageY<map[0].length-1) {
        	pospersonnageY++;
        	}
        }
        if(inp=='q') {
        	map[pospersonnageX][pospersonnageY]=0;
        	if (pospersonnageY>0) {
        	pospersonnageY--;
        	}
        }
        if(inp=='z') {
        	map[pospersonnageX][pospersonnageY]=0;
        	if (pospersonnageX>0) {
        	pospersonnageX--;
        	}
        }
        if(inp=='s') {
        	map[pospersonnageX][pospersonnageY]=0;
        	if (pospersonnageX<map.length-1) {
        	pospersonnageX++;
        	}
        }
        map[pospersonnageX][pospersonnageY]=1;
        // Affichage la map à chaque mouvement
        for(int i = 0; i < map.length; i++){
            for(int j = 0; j < map[i].length; j++){
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        
        
    }
    }
}
