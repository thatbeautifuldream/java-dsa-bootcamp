package Patterns;
public class Patterns {
    public static void main(String[] args) {
    /* Print the Pattern
    1.  *****
        *****
        *****
        *****
        *****
    */
    for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 5; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
    System.out.println("----------------------------------------------------------------");
    /* Print the Pattern
    2.  *
        **
        ***
        ****
        *****
    */
    for (int i = 0; i < 5; i++) {
        for (int j = 0; j <= i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
    System.out.println("----------------------------------------------------------------");
    /* Print the Pattern
    3.  *****
        ****
        ***
        **
        *
    */
    for (int i = 0; i < 5; i++) {
        for (int j = i; j < 5; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
    System.out.println("----------------------------------------------------------------");
    /* Print the Pattern
    4.  1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
    */
    for (int i = 0; i < 5; i++) {
        for (int j = 0; j <= i; j++) {
            System.out.print(j+1+" ");
        }
        System.out.println();
    }
    System.out.println("----------------------------------------------------------------");
    /* Print the Pattern
    5.  *
        **
        ***
        ****
        *****
        ****
        ***
        **
        *
   */
     for(int row=1;row<=2*n;row++){
            if(row <= n) {
                for(int col=1;col<=row;col++){
                    System.out.print("* ");
                }
            }else {
                for (int col = 1; col <= 2*n-row; col++) {
                    System.out.print("* ");
                }
            }
            System.out.println();
     }
    System.out.println("----------------------------------------------------------------"); 
    /* Print the pattern
    6.      *
           **
          ***
         ****
        *****
    */
     for(int i=1;i<=5;i++){
		for(int j=1;j<=5-i;j++){
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++){
			System.out.print("*");
		}
		System.out.println();
	}
    System.out.println("----------------------------------------------------------------");
    /* Print the pattern
    7.   *****
          ****
           ***
            **
             *
    */
    for(int i=5;i>=1;i--){
		for(int j=1;j<=5-i;j++){
			System.out.print(" ");
		}
		for(int j=i;j>=1;j--){
			System.out.print("*");
		}
		System.out.println();
	}
    System.out.println("----------------------------------------------------------------");
        
    /* Print the pattern
    
    8.    *
         ***
        *****
       *******
      *********
    
    */
        
    for(int i=1,k=0;i<=5;++i,k=0){
		for(int space=1;space<=5-i;++space){
			System.out.print(" ");
		}
		while(k!=2*i-1){
			System.out.print("*");
			++k;
		}
		System.out.println();
	}
    System.out.println("----------------------------------------------------------------");    
    
   /* Print the pattern
   
   9.  *********
        *******
         *****
          ***
           *
*/

   int k=0;
   for(int i=5;i>=1;--i){
		for(int space=0;space<5-i;++space){
			System.out.print(" ");
		}
		for(int j=i;j<=2*i-1;++j){
			System.out.printf("%d ",++k);
		}
		for(j=0;j<i-1;++j){
			System.out.printf("%d ",++k);
		}
		System.out.println();
	}
	  
 System.out.println("----------------------------------------------------------------"); 
	    
/* Print the pattern

10.      *
        * *
       * * *
      * * * *
     * * * * *
*/
	    
for (int i = 0; i < 5; i++) {
      for (int space = 1; space <= 5 - i; space++)
         System.out.print("  ");
      for (int j = 0; j <= i; j++) {
         System.out.printf("%4c",'*');
      }
   System.out.println();
   }
 System.out.println("----------------------------------------------------------------"); 
	    
/* Print the pattern

11.  * * * * *
      * * * *
       * * *
        * *
         *
*/
	    
 for (int i = 5-1; i>=0; i--) {
      for (int space = 1; space <= 5 - i; space++)
         System.out.print("  ");
      for (j = 0; j <= i; j++) {
        System.out.printf("%4c",'*');
      }
      System.out.println();
   }
System.out.println("----------------------------------------------------------------"); 
	    
/* Print the pattern	    
12.  * * * * *
      * * * *
       * * *
        * *
         *
         *
        * *
       * * *
      * * * *
     * * * * *
*/

 for (int i = 5-1; i>=0; i--) {
      for (int space = 1; space <= rows - i; space++)
         System.out.print("  ");
      for (int j = 0; j <= i; j++) {
         System.out.printf("%4c",'*');
      }
      System.out.println();
   }
   for (i = 0; i < rows; i++) {
      for (int space = 1; space <= 5 - i; space++)
         System.out.print("  ");
      for (j = 0; j <= i; j++) {
         System.out.printf("%4c",'*');
      }
      System.out.println();
   }
   System.out.println("----------------------------------------------------------------"); 
	    
/* Print the pattern

13.      *
        * *
       *   *
      *     *
     *********
*/
 
for(int i=1;i<=5;i++){
		//Print trailing spaces
		for(int j=i;j<5;j++){
			System.out.print(" ");
		}
		//Print hollow pyramid
		for(int j=1;j<=(2*i-1);j++){
			if(int i==5||j==1||j==(2*i-1)){
				System.out.print("*");
			}
			else{
				System.out.print(" ");
			}
		}
		System.out.println();
	}
System.out.println("----------------------------------------------------------------"); 
	    
/* Print the pattern

14.  *********
      *     *
       *   *
        * *
         *
*/
	    
for(int i=5;i>=1;i--){
		//Print trailing spaces
		for(int j=i;j<5;j++){
			System.out.print(" ");
		}
		//Print hollow pyramid
		for(int j=1;j<=(2*i-1);j++){
			if(i==5||j==1||j==(2*i-1)){
				System.out.print("*");
			}
			else{
				System.out.print(" ");
			}
		}
		System.out.println();
	}	   
System.out.println("----------------------------------------------------------------"); 
	    
/* Print the pattern

15.      *
        * *
       *   *
      *     *
     *       *
      *     *
       *   *
        * *
         *
*/
 
for(int i=1;i<=5;i++){
		//Print trailing spaces
		for(int j=i;j<5;j++){
			printf(" ");
		}
		//Print hollow pyramid
		for(int j=1;j<=(2*i-1);j++){
			if(j==1||j==(2*i-1)){
				System.out.print("*");
			}
			else{
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	for(int i=5-1;i>=1;i--){
		//Print trailing spaces
		for(int j=i;j<5;j++){
			printf(" ");
		}
		//Print hollow pyramid
		for(int j=1;j<=(2*i-1);j++){
			if(j==1||j==(2*i-1)){
				System.out.print("*");
			}
			else{
				System.out.print(" ");
			}
		}
		System.out.println();
	}	    
System.out.println("----------------------------------------------------------------"); 
	    
/* Print the pattern

16.           1
            1   1
          1   2   1
        1   3   3   1
      1   4   6   4   1
*/

int coef=1;
for (int i = 0; i < 5; i++) {
      for (int space = 1; space <= 5 - i; space++)
         System.out.print("  ");
      for (int j = 0; j <= i; j++) {
         if (j == 0 || i == 0)
            coef = 1;
         else
            coef = coef * (i - j + 1) / j;
         System.out.printf("%4d", coef);
      }
      System.out.println();
   }	
	    
System.out.println("----------------------------------------------------------------"); 
	    
/* Print the pattern

17.      1
        212
       32123
      4321234
       32123
        212
         1
*/

 for(int i=1;i<=5-1;i++){
		for(int j=1;j<=5-i;j++){
			System.out.print(" ");
		}
		for(int k=i;k>=1;k--){
			System.out.printf("%d",k);
		}
		for(int k=2;k<=i;k++){
			System.out.printf("%d",k);
		}
		System.out.println();
	}
	for(int i=5-2;i>=0;i--){
		for(int j=1;j<=5-i;j++){
			System.out.print(" ");
		}
		for(int k=i;k>=1;k--){
			System.out.printf("%d",k);
		}
		for(int k=2;k<=i;k++){
			System.out.printf("%d",k);
		}
		System.out.println();
	}
System.out.println("----------------------------------------------------------------"); 
	    
/* Print the pattern

18.   **********
      ****  ****
      ***    ***
      **      **
      *        *
      *        *
      **      **
      ***    ***
      ****  ****
      **********
*/
	    
//upper half of the pattern
	for(int i=0;i<5;i++){
		for(int j=0;j<(2*5);j++){
			if(i+j<=5-1)//upper left triangle
				System.out.print("*");
			else
				System.out.print(" ");
			if((i+5)<=j)//upper right triangle
				System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.println();
	}
	//bottom half of the triangle
	for(int i=0;i<5;i++){
		for(int j=0;j<(2*5);j++){
			if(i>=j)//bottom left triangle
				System.out.print("*");
			else
				System.out.print(" ");
			if(i>=(2*5-1)-j)//bottom right triangle
				System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.println();
	}   
System.out.println("----------------------------------------------------------------"); 
	    
/* Print the pattern

19.    *        *
       **      **
       ***    ***
       ****  ****
       **********
       ****  ****
       ***    ***
       **      **
       *        *
*/

//upper half of the pattern
	for(int i=0;i<5;i++){
		for(int j=0;j<(2*5);j++){
			if(i>=j)//upper left triangle
				System.out.print("*");
			else
				System.out.print(" ");
			if(i>=(2*5-1)-j)//upper right triangle
				System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.println();
	}
	//bottom half of the pattern
	for(int i=1;i<5;i++){
		for(int j=0;j<(2*5);j++){
			if(i+j<=5-1)//bottom left triangle
				System.out.print("*");
			else
				System.out.print(" ");
			if((i+5)<=j)//bottom right triangle
				System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.println();
	}
System.out.println("----------------------------------------------------------------"); 
	    
/* Print the pattern

20.    ****
       *  *
       *  *
       *  *
       ****
*/

for(int i=1;i<=5;i++){
		for(int j=1;j<=5-1;j++){
			if(i==1||i==5)
				System.out.print("*");
			else{
				if(j==1||j==5-1)
					System.out.print("*");
				else
					System.out.print(" ");
				}
			}
			System.out.println();
		}	
System.out.println("----------------------------------------------------------------"); 
	    
/* Print the pattern

21.    1
       2  3
       4  5  6
       7  8  9  10
       11 12 13 14 15
*/
int number=1;
for(int i=1;i<=5;i++){
		for(int j=1;j<=i;++j){
			System.out.printf("%d ",number);
			++number;
		}
		System.out.println();
	}
System.out.println("----------------------------------------------------------------"); 
	    
/* Print the pattern

22.    1
       0 1
       1 0 1
       0 1 0 1
       1 0 1 0 1
*/
int rows,col;
	for(rows=1;rows<=5;rows++){
		for(col=1;col<=rows;col++){
			if((rows+col)%2==0){
				System.out.print("1"+" ");
			}
			else{
				System.out.print("0"+" ");
			}
		}
		System.out.println();
	}
System.out.println("----------------------------------------------------------------"); 
	    
/* Print the pattern
25.       *****
         *   *
        *   *
       *   *
      *****
*/

for(int i=0;i<5;i++){
		for(int j=0;j<5-i;j++){
			System.out.print(" ");//Leading spaces
		}
		for(int j=0;j<5;j++){
			//upper horizontal, bottom horizontal, left diagonal, right diagonal
			if(i==0||i==5-1||j==0||j==5-1)
				System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.println();
	}	    
System.out.println("----------------------------------------------------------------"); 
	    
/* Print the pattern

26.   1 1 1 1 1 1
      2 2 2 2 2
      3 3 3 3
      4 4 4
      5 5
      6
*/

	int rows,col,num=1
	for(rows=5;rows>=1;rows--){
		for(col=1;col<=rows;col++){
			System.out.printf("%d ",num);
		}
		num++;
		System.out.println();
	}
	System.out.println("----------------------------------------------------------------"); 
	    
/* Print the pattern
29.      
       *        *
       **      **
       ***    ***
       ****  ****
       **********
       **********
       ****  ****
       ***    ***
       **      **
       *        *
*/
//upper half of the pattern
	for(int i=0;i<5;i++){
		for(int j=0;j<(2*5);j++){
			if(i>=j)//upper left triangle
				System.out.print("*");
			else
				System.out.print(" ");
			if(i>=(2*5-1)-j)//upper right triangle
				System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.println();
	}
	//bottom half of the pattern
	for(int i=0;i<5;i++){
		for(int j=0;j<(2*5);j++){
			if(i+j<=5-1)//bottom left triangle
				System.out.print("*");
			else
				System.out.print(" ");
			if((i+5)<=j)//bottom right triangle
				System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.println();
	}
System.out.println("----------------------------------------------------------------"); 
	    
/* Print the pattern	    

31.      4 4 4 4 4 4 4  
         4 3 3 3 3 3 4   
         4 3 2 2 2 3 4   
         4 3 2 1 2 3 4   
         4 3 2 2 2 3 4   
         4 3 3 3 3 3 4   
         4 4 4 4 4 4 4
*/
int n=5;
int s=2*n-1;
	//Upper half
	for(int i=0;i<(s/2)+1;i++){
		int m=n;
		//Decreasing part
		for(int j=0;j<i;j++){
			Syste.out.printf("%d ",m);
			m--;
		}
		//Constant part
		for(int k=0;k<s-2*i;k++){
			Syste.out.printf("%d ",n-i);
		}
		//Increasing part
		m=n-i+1;
		for(int l=0;l<i;l++){
			Syste.out.printf("%d ",m);
			m++;
		}
		Syste.out.println();
	}
	//Lower half
	for(int i=s/2-1;i>=0;i--){
		//Decreasing part
		int m=n;
		for(int j=0;j<i;j++){
			System.out.printf("%d ",m);
			m--;
		}
		for(int k=0;k<s-2*i;k++){
			System.out.printf("%d ",n-i);
		}
		m=n-i+1;
		for(int l=0;l<i;l++){
			System.out.printf("%d ",m);
			m++;
		}
		System.out.println();
	}	    

	    
	  
