import java.util.Scanner;
public class MatrixMulti {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
            int w,x,y,z;
            System.out.println("Enter the number of rows in first matrix : ");
            w=scan.nextInt();
            System.out.println("Enter the number of column in first matrix : ");
            x=scan.nextInt();
            System.out.println("Enter the number of rows in second matrix : ");
            y=scan.nextInt();
            System.out.println("Enter the number of column in second matrix : ");
            z=scan.nextInt();
            
            if(x==y)
            {
            	int[][]a=new int[w][x];
            	int[][]b=new int[y][z];
            	int[][]c=new int[w][z];
            	
            	System.out.println("Enter the first matrix row wise : ");
            	for(int i=0;i<w;i++)
            	{
            		for(int j=0;j<x;j++)
            		{
            			a[i][j]=scan.nextInt();
            		}
            	}
            	
            	
            	
            	System.out.println("Enter the second matrix row wise : ");
            	for(int i=0;i<y;i++)
            	{
            		for(int j=0;j<z;j++)
            		{
            			b[i][j]=scan.nextInt();
            		}
            	}
            	
            	
            	
            	
            	
            	for(int i=0;i<w;i++)
            	{
            		for(int j=0;j<z;j++)
            		{
            			for(int k=0;k<x;k++)
            			{
            				c[i][j]=c[i][j]+a[i][k]*b[k][j];
            			}
            		}
            	}
            	
            	System.out.println("The product matrix is : ");
            	
            	
            	for(int i=0;i<w;i++)
            	{
            		for(int j=0;j<z;j++)
            		{
            			System.out.print(c[i][j]+" ");
            		}
            		
            		System.out.println();
            	}
            	
            }
            
            else
            {
            	System.out.println("Multiplication not possible");
            }
        }

	}

}
