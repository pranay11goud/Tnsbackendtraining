package mypack;

class Operators{
    public static void main(String args[]){
        //arithematic operator
        int a=5,b=3;
        System.out.println("addition"+" "+(a+b));
        System.out.println("subtraction"+" "+(a-b));
        System.out.println("multiplication"+" "+(a*b));
        System.out.println("division"+" "+(a/b));
        System.out.println("modulus"+" "+(a%b));
        System.out.println();
        //Assignment operator
        System.out.println("assignment add"+" "+(a+=b));
        System.out.println("assignment sub"+" "+(a-=b));
        System.out.println("assignment mul"+" "+(a*=b));
        System.out.println("assignment div"+" "+(a/=b));
        System.out.println("assignment mod"+" "+(a%=b));//a=a%b a=20%2 a=0
        System.out.println();
        //relational operator
        System.out.println("less than:  "+(a<b));
        System.out.println("grater than:  "+(a>b));
        System.out.println("less than or equal to:  "+(a<=b));
        System.out.println("grater than or equal to:  "+(a>=b));
        System.out.println("equal to:  "+(a==b));
        System.out.println("not equal to:  "+(a!=b));
        System.out.println();
        //logical operator
        System.out.println("And operation: "+(a>9 && 10>b));
        System.out.println("And operation: "+(a>44 && 10>b));
        System.out.println("Or operation: "+(a>9 || 10>b));
        System.out.println("Or operation: "+(a>44 || -2>b));
        System.out.println("Not operation: "+(!(a>9 && 10>b)));
        System.out.println();
        //Bitwise operators
        System.out.println(a+" "+b);
        System.out.println(a & b); //0101 & 0011 = 0001 
        System.out.println(a | b); //0101 | 0011 = 0111 
        System.out.println(a ^ b); //0101 ^ 0011 = 0110
        System.out.println(a << 1);//0101 = 1010 left shift
        System.out.println(a >> 1);//0101 = 0010 right shift
        System.out.println();
        //tenary operator
        int c=10,d=20;
        System.out.println("Ternary: "+((c>d) ? "c is big":"d is big"));
        System.out.println();
        //unary operations
        int f=10;
        f++;
        System.out.println("post increment:"+f);
        ++f;
        System.out.println("pre increment:"+f);
        f--;
        System.out.println("post decrement:"+f);
        --f;
        System.out.println("pre decrement:"+f);
    }
}