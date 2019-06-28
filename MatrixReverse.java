public class MatrixReverse
{
	public static void main(String[] args) {
	    int row = 4,col = 4;
	    int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
	    //System.out.println(matrix.length+" "+matrix[1].length);
	    int rowc ;
	    int colc ;
	    if(row%2==0)
	    {
            rowc = row/2 - 1;
            colc = col-1;	
	    }
	    else
	        rowc = row/2;
	        colc = col/2 - 1;
		//System.out.println(rowc+" "+colc);
	    for(int i = 0;i<=rowc;i++)
	        for(int j = 0;j<col;j++)
	        {
	            if(i == rowc && j==colc+1)
					break;
				int t = matrix[i][j];
				matrix[i][j] = matrix[row-1- i][col-1- j];
				matrix[row-1- i][col-1- j] = t;
				//System.out.print(matrix[i][j]+"\t");
	        }
	        System.out.println();
		for(int i = 0;i<row;i++)
	            System.out.print(matrix[i][j]+"\t");
		//System.out.println("Hello World");
	}
}
