package com.Lab_0809;

public class Student
{
    public Long studentId;
    public Character studentGrade;
    public Double monthlyFees;
    public Boolean isScholarshipEligible;
    public double fees;
    public long math;
    public Double english;

    public void calculateFeesStructure(long studentId,char studentGrade,double monthlyFees,boolean isScholarshipEligible)
    {
        if (studentId != 0)
        {
            if(isScholarshipEligible == true)
            {
                if (studentGrade == 'A')
                {
                    fees = monthlyFees - (monthlyFees * (10 / 100));
                    System.out.println("10% of fees is exempted ,the calculated fees is "+fees);
                } else if (studentGrade == 'B')
                {
                    fees = monthlyFees - (monthlyFees * (8 / 100));
                    System.out.println("8% of fees is exempted ,the calculated fees is "+fees);
                } else if (studentGrade == 'C')
                {
                    fees = monthlyFees - (monthlyFees * (6 / 100));
                    System.out.println("6% of fees is exempted ,the calculated fees is "+fees);
                } else if (studentGrade == 'D')
                {
                    fees = monthlyFees - (monthlyFees * (4 / 100));
                    System.out.println("4% of fees is exempted ,the calculated fees is "+fees);
                }
            }else
            {
                System.out.println("NOT ELIGIBLE EXEMPTION");
            }
        }else
        {
            System.out.println("NOT ELIGIBLE EXEMPTION");
        }
    }
    public static void compareMarks(long math, long english)
    {
        if (english > math)
        {
            System.out.println("english mark id higher than math");
        } else if (english < math)
        {
            System.out.println("math mark id higher than english");
        }else
        {
            System.out.println("both are equal");
        }
    }
    public static void validateFees(Double fees)
    {
        if (fees.isInfinite())
        {
            System.out.println("fees is infinite");
        }
        else {
            System.out.println("fees is nor infinite");
        }
    }

    public static void main(String[] args)
    {
        Student  = new Student();
        studentobj.calculateFeesStructure(234,'C',600,true);
        studentobj.calculateFeesStructure(115,'B',909.50,true);
        studentobj.calculateFeesStructure(980,'G',1810,false);
        compareMarks(85,65);
        compareMarks(56,98);
        compareMarks(84,84);
        validateFees(Foo.valueOf((double) 500));
    }
}
