public class LadderYearPatttern   
{   
public static void main(String args[])   
{   
//i for rows and j for columns      
//row denotes the number of rows you want to print  
int i, j, row=6;   
//outer loop for rows  
for(i=0; i<row; i++)   
{   
//inner loop for columns  
for(j=0; j<=i; j++)   
{   
//prints stars   
System.out.print(" 2 0 2 3");   
}   
//throws the cursor in a new line after printing each line  
System.out.println();   
}   
}   
}  
