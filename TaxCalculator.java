package Exceotion;



public class TaxCalculator {
    double taxAmmount(String empName, boolean isIndian, double empSal) {
        if (empName == null){
           try {
               throw new EmploieeNameInvalidException("enter a name");
           } catch (EmploieeNameInvalidException e) {
               throw new RuntimeException(e);
           }
        }else if (isIndian != false){
            try {
                throw new CountryNotValidEException("emploiee has to be indian");
            } catch (CountryNotValidEException e) {
                throw new RuntimeException(e);
            }

        } else if (empSal>100000 && isIndian) {
            return empSal*(8/100);
        } else if (empSal<= 100000 && empSal> 50000 && isIndian) {
            return empSal*(6/100);
        } else if (empSal<=50000 && empSal<30000 && isIndian) {
            return empSal = (4/100);
        }else {
            try {
                throw new TaxNotEligibleException("tou ere not elegible");
            } catch (TaxNotEligibleException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        TaxCalculator obj = new TaxCalculator();
        System.out.println("TAX  :   "+obj.taxAmmount("Ron",false,34000));
        System.out.println("TAX  :   "+obj.taxAmmount("Tim",true,1000));
        System.out.println("TAX  :   "+obj.taxAmmount("Jack",true,55000));
        System.out.println("TAX  :   "+obj.taxAmmount("",true,30000));
    }

}
