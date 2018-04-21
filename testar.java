package PROJECTO;

import java.util.Arrays;

public class testar {
	
	public static void main(String [] args) {
		Amostra A = new Amostra (0,null) ; 
		int u[]= {1,2,3};
		int v[]= {1,4,5};
		int w[]= {1,2,5};
		int x[]= {1,3};
		int m[]= {1,2};
		
		
		A.add(u);
		A.add(v);
		A.add(w);
		
//		System.out.println(A);
//		System.out.println(A.length());
//		System.out.println(Arrays.toString(A.element(2)));
//		System.out.println(Arrays.toString(A.count(x,m)));
		
		GrafosOrientados G = new GrafosOrientados (6);
		G.add_edge(0, 1);
		G.add_edge(0, 2);
		G.add_edge(1, 3);
		G.add_edge(1, 4);
		G.add_edge(2, 5);
		
		System.out.println(G);
		System.out.println(G.parents(1));
		
	}
}
