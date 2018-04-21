package projectomil;

import java.util.Arrays;

class node {
	int [] vector;
	node next;
	
	public node(int [] vector, node next) {
		this.vector = vector;
		this.next = next;
		
	}

	@Override
	public String toString() {
		return "node [vector=" + Arrays.toString(vector) + ", next=" + next + "]";
	}
	
}
public class Amostra {
	int len;
	node first;
	
	public Amostra() {
		super();
		this.len = 0;
		this.first = null;
	}
	
	
	
	@Override
	public String toString() {
		return "Amostra [len=" + len + ", first=" + first + "]";
	}



	public int length() {
		return len;
	}

	public void add(int[] vector){
			first=new node(vector,first);
			len=len+1;
		}
	
	public int[] element(int p) {
		node aux=first;
		if(p<=len-1) {
			for(int i=0; i<p; i++)
				aux=aux.next;
			return aux.vector;
		}
		else {
			return null;
		}
		}
	
	public int[] count(int[] var,int[] val) {
		int[] res= new int[val.length];
		int i=0; int j; int aux;
		while (i<= var.length-1) {
			j=0;
			aux=0;
			while(j<=len-1) {
				if(element(j)[var[i]]==val[i]) {
					aux++;
				}
				j++;
			}
			res[i]=aux;
			i++;
		}
		return res;
		
	}
	
	public static void main(String [] args) {
		int v[]= {37,2,3,0};
		int u[]= {38,9,6,0};
		int c[]= {37,3,6,0};
		int s[]= {37,4,2,1};
		int vr[]= {0,3};
		int vl[]= {37,0};
		Amostra ll= new Amostra();
		ll.add(v);
		ll.add(u);
		ll.add(s);
		ll.add(c);
		System.out.println(ll);
		System.out.println(Arrays.toString(ll.count(vr,vl)));
	}
}
