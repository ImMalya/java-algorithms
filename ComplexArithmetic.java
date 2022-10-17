import java.util.Scanner;


class Complex
{
    int real;
    int img;
    void getValues()
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the value of real part:\n");
        real = ob.nextInt();
        System.out.println("Enter the value of imaginary part:\n ");
        img = ob.nextInt();
    }
    void display()
    {
        if ((real < 0) || (img < 0))
        {
            System.out.println("the entered Complex number is:\n" + "(" + real + ")" + " + "+"(" + img + ")" + "i");
        }
        else
        {
            System.out.println("the entered Complex number is:\n" + real + " + "+ img + "i");
        }
    }
    void add(Complex c1, Complex c2)
    {
        Complex c3 = new Complex();
        c3.real = c1.real + c2.real;
        c3.img = c1.img + c2.img;

        if ((c3.real < 0) || (c3.img < 0))
        {
            System.out.println("the Addition of Complex number is:\n" + "(" + c3.real + ")" + " + "+ "(" + c3.img + ")" + "i");
        }
        else
        {
            System.out.println("the Addition of Complex number is:\n" + c3.real + " + "+ c3.img + "i");
        }
    }
    void sub(Complex c1, Complex c2)
    {
        Complex c3 = new Complex();
        c3.real = c1.real - c2.real;
        c3.img = c1.img - c2.img;

        if ((c3.real < 0) || (c3.img < 0)) {
            System.out.println("the Subtraction of Complex number is:\n" + "(" + c3.real + ")" + " + " + "(" + c3.img + ")" + "i");
        } else {
            System.out.println("the Subtraction of Complex number is:\n" + c3.real + " + " + c3.img + "i");
        }
    }
    void multi(Complex c1, Complex c2)
    {   int a = c1.real;
        int b = c1.img;

        int c = c2.real;
        int d = c2.img;

        Complex c3 = new Complex();
        c3.real = (a*c) - (b*d);
        c3.img = (a*d) + (b*c);

        if ((c3.real < 0) || (c3.img < 0)) {
            System.out.println("the Multiplication of Complex number is:\n" + "(" + c3.real + ")" + " + " + "(" + c3.img + ")" + "i");
        } else {
            System.out.println("the Multiplication of Complex number is:\n" + c3.real + " + " + c3.img + "i");
        }
    }
    void div(Complex c1, Complex c2)
    {   int a = c1.real;
        int b = c1.img;

        int c = c2.real;
        int d = c2.img;

        Complex c3 = new Complex();
        c3.real = ((a*c) + (b*d)) / ((c^2) * (d^2));
        c3.img = ((b*c) + (a*d)) / ((c^2) * (d^2));

        if ((c3.real < 0) || (c3.img < 0)) {
            System.out.println("the Division of Complex number is:\n" + "(" + c3.real + ")" + " + " + "(" + c3.img + ")" + "i");
        } else {
            System.out.println("the Division of Complex number is:\n" + c3.real + " + " + c3.img + "i");
        }
    }
}
public class ComplexArithmetic {
    public static void main (String[] args){
        System.out.println("This is a complex number arithmetic class");

        Complex c1 = new Complex();
        Complex c2 = new Complex();
        Complex c3 = new Complex();
        c1.getValues();
        c1.display();
        c2.getValues();
        c2.display();
        System.out.println("Enter the operation from the following list : \n 1. + \n 2. - \n 3. * \n 4. /");
        Scanner input = new Scanner(System.in);
        String option = input.nextLine();
        switch (option) {
            case "+":
                c3.add(c1,c2);
                break;
            case "-":
                c3.sub(c1,c2);
                break;
            case "*":
                c3.multi(c1,c2);
                break;
            case "/":
                c3.div(c1,c2);
                break;
            default:
                System.out.println("Enter correct operation!!!");
                break;
        }
    }
}