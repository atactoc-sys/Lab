public Complex(double real, double imaginary) {

this imaginary = imaginary;

}

public static void main(String[] args) {

Complex n1 = new Complex(4.5, 5.6),

n2 = new Complex(5.0,

temp;

temp add(n1, n2);

System.out.printf("Sum = %.1f+%.1fi", temp.real, temp imaginary);

6.1).

}

public static Complex add(Complex nl, Complex n2)

Complex temp = new Complex(0.0, 0.0);

temp.real = nl.real+n2.real;

temp imaginary = nl imaginary+n2 imaginary.

return(temp);
}
}
