package PROJECTO;

import java.util.Arrays;
import java.util.LinkedList;

public class GrafosOrientados {
	
	private int dim;
	private int [][] ma;
	
	public GrafosOrientados(int dim) {
		super();
		this.dim = dim;
		ma = new int [dim][dim]; //DGraph 
	}
	




	public int getDim() {
		return dim;
	}





	public void setDim(int dim) {
		this.dim = dim;
	}





	@Override
	public String toString() {
		return "GrafosOrientados [dim=" + dim + ", ma=" + Arrays.deepToString(ma) + "]";
	}
	
	public void add_edge (int o, int d) {
		ma[o][d]=1;
	}
	
	public void remove_edge (int o, int d) {
		ma[o][d]=0;
	}
	
	public LinkedList <Integer> parents (int n) {
		LinkedList <Integer> lnew = new LinkedList <Integer> ();
			for (int j=0; j<dim;j++)
				if(ma[n][j]==1)
				lnew.add(n);
		return lnew;
	}

}
