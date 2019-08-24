
public class ProdutoVetorial {
	public static void main (String[] args){

		int p1[] = {2,0,1};int p2[] = {5,1,1};int p3[] = {3,2,0};

		produtoVetorial(p1,p2,p3);

	}

	public static void produtoVetorial(int p1[],int p2[],int p3[]){

		int m[][] = {p1,p2,p3};

		for(int i = 0 ; i <  3 ; i++) {

			int dir = i+1;
			int esq = i-1;

			if(dir > 2) {
				dir = 0;
			}
			if(esq < 0) {
				esq = 2;
			} 


			int u[] = { m[dir][0]-m[i][0], m[dir][1]-m[i][1], m[dir][2]-m[i][2] };
			int v[] = { m[esq][0]-m[i][0], m[esq][1]-m[i][1], m[esq][2]-m[i][2] };

			
			System.out.println(u[0]+" , "+u[1]+" , "+u[2]);
			System.out.println(v[0]+" , "+v[1]+" , "+v[2]);



			int n [] = {(u[1]*v[2]) - (u[2]*v[1]),((u[0]*v[2]) - (u[2]*v[0]))*-1,(u[0]*v[1]) - (u[1]*v[0])};
			System.out.println("N"+(i+1)+":"+ n[0]+" , "+n[1]+" , "+n[2]);
			System.out.println();
		}



	}
}
