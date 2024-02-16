import java.util.*;
public class FinancialManagementSystem {
	
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        while(true) {
            int option = getBankSystemOption();
            if (option == 1) {
                int deopsitOption;
                do {
                    deopsitOption = getDepositOption();
                    switch (deopsitOption){
                        case 1: savingsAccount();break;
                        case 2: fixedDeposit();break;
                        case 3: break;
                        default:System.out.println("\n\t\t\tInvalid option...");break;
                    }
                } while (deopsitOption!=3);

            } else if (option == 2) {
                int loanOption;
                do {
                    loanOption =  getLoanOption();
                    switch(loanOption){
                        case 1: personalLoan();break;
                        case 2: businessLoan();break;
                        case 3: homeEqualityLoan();break;
                        case 4: financeLoan();break;
                        case 5:break;
                        default:System.out.println("\t\n\n\nInvalid input...");break;
                    }
                }while(loanOption!=5);

            } else if (option == 3) {
                int taxOption;
                do {
                    taxOption = getTaxOption();
                    switch (taxOption){
                        case 1: rentTax();break;
                        case 2: incomeTax();break;
                        case 3: payableTax();break;
                        case 4: leasing();break;
                        case 5:break;
                        default:System.out.println("\n\t\t\tInvalid Option...");
                    }
                }while(taxOption!=5);

            } else if (option==4) {
                shareMarket();
            }else if (option==5){
                break;
            }else{
                System.out.println("\n\t\t\tInvalid option...");
            }
        }
    }

    private static void shareMarket() {
        Scanner input = new Scanner(System.in);

        double shareMarketAmount;
        int shares;
        do {
            System.out.println("\t\t\t    _____ _                      __  __            _        _   ");
            System.out.println("\t\t\t   / ____| |                    |  \\/  |          | |      | |  ");
            System.out.println("\t\t\t  | (___ | |__   __ _ _ __ ___  | \\  / | __ _ _ __| | _____| |_ ");
            System.out.println("\t\t\t   \\___ \\| '_ \\ / _` | '__/ _ \\ | |\\/| |/ _` | '__| |/ / _ \\ __|");
            System.out.println("\t\t\t   ____) | | | | (_| | | |  __/ | |  | | (_| | |  |   <  __/ |_ ");
            System.out.println("\t\t\t  |_____/|_| |_|\\__,_|_|  \\___| |_|  |_|\\__,_|_|  |_|\\_\\___|\\__|");
            System.out.println("\t\t\t  ============================================================== ");
            System.out.println("\n\n");

            System.out.print("\n\t\t\t  Enter your amount (Enter -1 to Exit) : ");
            shareMarketAmount = input.nextDouble();
            double annualDevidend=0;
            if (shareMarketAmount == -1) {
                return;
            }if(shareMarketAmount<0){
                System.out.println("\n\t\t\t invalid input...");
                continue;
            }else{
                System.out.print("\n\t\t\t Number of shares available \t : ");
                shares = input.nextInt();
                if (shares<0) {
                    System.out.println("\n\t\t\t\t Invalid input for shares...");
                    continue;
                } else {
                    annualDevidend = 6*shares*12;
                    System.out.println("\n\t\t\t Annual dividend : "+annualDevidend);
                }
            }
            System.out.println("\n");
            return;
        } while (true);
    }

    private static void leasing() {
        Scanner input =  new Scanner(System.in);

        double leasingAmount;
        double leasingYears = 0;
        int leasingRate = 0;
        do {
            System.out.println("\t\t\t  _                    _                                  ");
            System.out.println("\t\t\t | |                  (_)                                       ");
            System.out.println("\t\t\t | |     ___  __ _ ___ _ _ __   __ _                                 ");
            System.out.println("\t\t\t | |    / _ \\/ _' / __| | '_ \\ / _' |                           ");
            System.out.println("\t\t\t | |___|  __/ (_| \\__ \\ | | | | (_| |                                  ");
            System.out.println("\t\t\t |______\\___|\\__,_|__ /_|_| |_|\\__, |                                  ");
            System.out.println("\t\t\t                                __/ |                           ");
            System.out.println("\t\t\t                               |___/                            ");
            System.out.println("\t\t\t=========================================                    ");
            System.out.println("\n\n");

            System.out.print("\t Enter the monthly lease payment leasingAmount you can afford (Enter -1 to Exit) \t : ");
            leasingAmount =  input.nextDouble();

            double leasePayment = 0;
            if (leasingAmount == -1) {
                return;
            }if(leasingAmount <0){
                System.out.print("\n\t invalid input for a leasign amount... ");
                continue;
            }else{
                System.out.print("\n\t Enter the number of years \t\t\t\t : ");
                leasingYears = input.nextDouble();
                if(leasingYears<0){
                    System.out.println("\n\t\t\t invalid input for years...");
                    continue;
                }else{
                    System.out.print("\n\t Enter annual interest rate \t\t\t\t : ");
                    leasingRate = input.nextInt();
                    if(leasingRate<0){
                        System.out.println("\n\t\t\t invalid input for rate...");
                    }else{
                        double i = (leasingRate/100.0)/12.0;
                        double n = leasingYears * 12.0;
                        leasePayment = leasingAmount /i * (1-(1/Math.pow((1 + i),n)));

                        System.out.printf("\n\t\t\t You can get lease leasingAmount \t\t :%.2f",leasePayment);
                    }
                }
            }
            System.out.println("\n");
            break;
        } while (true);
    }

    private static void payableTax() {
        Scanner input = new Scanner(System.in);

        double payment = 0;
        do {
            System.out.println("\t\t\t  _____                   _     _        _______                       ");
            System.out.println("\t\t\t |  __ \\                 | |   | |      |__   __|                   ");
            System.out.println("\t\t\t | |__) |_ __ _   _  __ _| |__ | | ___     | | __ ___  __             ");
            System.out.println("\t\t\t |  ___/  _' | | | |/ _' | '_ \\| |/ _ \\    | |/ _' \\ \\/ /     ");
            System.out.println("\t\t\t | |   | (_| | |_| | (_| | |_) | |  __/    | | (_| |>  <            ");
            System.out.println("\t\t\t |_|    \\__,_|\\__, |\\__,_|_.__/|_|\\___|    |_|\\__,_/_/\\_\\        ");
            System.out.println("\t\t\t               __/ |                                          ");
            System.out.println("\t\t\t              |___/                                          ");
            System.out.println("\t\t\t===========================================================      ");
            System.out.println("\n\n");

            System.out.print("\t\t\t Enter your employee payment per month (Enter -1 to Exit) \t : ");
            payment = input.nextDouble();
            double payableTax = 1;
            if (payment == -1) {
                return;
            }else if(payment<0){
                System.out.println("\n\t\t\t wrong input for income per year...");
                continue;
            }else if(payment<100000){
                System.out.println("\n\t\t\t You are not required to pay payable tax");
            }else{
                double chargingScale = payment - 100000;
                if(chargingScale<41667){
                    payableTax = chargingScale*0.06;
                }else if(chargingScale<83333){
                    payableTax = 41667*0.06+(chargingScale-41667)*0.12;
                }else if(chargingScale<125000){
                    payableTax = 41667*0.06+41667*0.12+(chargingScale-83333)*0.18;
                }else if(chargingScale<166667){
                    payableTax = 41667*0.06+41667*0.12+41667*0.18+(chargingScale-166667)*0.24;
                }else if(chargingScale<208333){
                    payableTax = 41667*0.06+41667*0.12+41667*0.18+41667*0.24+(chargingScale-166667)*0.3;
                }else{
                    payableTax = 41667*0.06+41667*0.12+41667*0.18+41667*0.24+41667*0.3+(chargingScale-208333)*0.36;
                }
                System.out.printf("\n\t\t\t You have to pay income tax per month : %.2f",payableTax);
            }
            System.out.println("\n");
            break;
        } while (true);
    }

    private static void incomeTax() {
        Scanner input = new Scanner(System.in);
        double income=0;
        do {
            System.out.println("\t\t\t  _____                                   _______            ");
            System.out.println("\t\t\t |_   _|                                 |__   __|           ");
            System.out.println("\t\t\t   | |   _ __   ___ ___  _ __ ___   ___     | | __ ___  __ ");
            System.out.println("\t\t\t   | |  | '_ \\ / __/ _ \\| '_ ` _ \\ / _ \\    | |/ _` \\ \\/ / ");
            System.out.println("\t\t\t  _| |_ | | | | (_| (_) | | | | | |  __/    | | (_| |>  <  ");
            System.out.println("\t\t\t |_____||_| |_|\\___\\___/|_| |_| |_|\\___|    |_|\\__,_/_/\\_\\ ");
            System.out.println("\t\t\t ============================================================= ");
            System.out.println("\n\n");

            System.out.print("\t\t\t Enter your total income per year (Enter -1 to Exit)\t : ");
            income =  input.nextDouble();
            double incomeTax = 0;
            if (income == -1) {
                return;
            }else if(income<0){
                System.out.println("\n\t\t\t wrong input for income per year...");
                continue;
            }else if(income<1200000){
                System.out.println("\n\t\t\t You are not required to pay Income tax...");
            }else{
                double chargingScale = income - 1200000;
                if(chargingScale<=500000){
                    incomeTax = chargingScale*0.06;
                }else if(chargingScale<=1000000){
                    incomeTax = 500000*0.06+(chargingScale-500000)*0.12;
                }else if(chargingScale<=1500000){
                    incomeTax = 500000*0.06+500000*0.12+(chargingScale-1000000)*0.18;
                }else if(chargingScale<=2000000){
                    incomeTax = 500000*0.06+500000*0.12+500000*0.18+(chargingScale-1500000)*0.24;
                }else if(chargingScale<=2500000){
                    incomeTax = 500000*0.06+500000*0.12+500000*0.18+500000*0.24+(chargingScale-2000000)*0.3;
                }else{
                    incomeTax = 500000*0.06+500000*0.12+500000*0.18+500000*0.24+500000*0.3+(chargingScale-2500000)*0.36;
                }
                System.out.printf("\n\t\t\t You have to pay income tax per year : %.2f",incomeTax);
            }
            System.out.println("\n");
            break;
        } while (true);
    }

    private static void rentTax() {
        Scanner input=  new Scanner(System.in);

        double rent;
        do {
            System.out.println("\t\t\t  _____            _    _______                                     ");
            System.out.println("\t\t\t |  __ \\          | |  |__   __|                                   ");
            System.out.println("\t\t\t | |__) |___ _ __ | |_    | | __ ___  _                         ");
            System.out.println("\t\t\t |  _  /  _ \\ '_ \\| __|   | |/ _' \\ \\/ /                        ");
            System.out.println("\t\t\t | | \\ \\  __/ | | | |_    | | (_| |>  <                           ");
            System.out.println("\t\t\t |_|  \\_\\___|_| |_|\\__|   |_|\\__,_/_/\\_\\                          ");
            System.out.println("\t\t\t =========================================                       ");

            System.out.print("\n\t\t\t Enter the Rent (Enter -1 to Exit) \t : ");
            rent =  input.nextDouble();
            if (rent == -1) {
                return;
            }else if(rent<0){
                System.out.println("\n\t\t\t invalid input for rent...");
                continue;
            }else if(rent<100000){
                System.out.println("\n\t\t\t You are not required to pay rent tax");
            }else{
                System.out.printf("\n\t\t\t You have to pay Ret tax \t : %.2f",(rent*0.05));
            }
            System.out.println("\n");
            return;
        } while (true);
    }

    private static int getTaxOption() {
        Scanner input=new Scanner(System.in);

        System.out.println("\t\t\t\t  _______                ");
        System.out.println("\t\t\t\t |__   __|               ");
        System.out.println("\t\t\t\t    | | __ ___  __       ");
        System.out.println("\t\t\t\t    | |/ _' \\ \\/ /     ");
        System.out.println("\t\t\t\t    | | (_| |>  <        ");
        System.out.println("\t\t\t\t    |_|\\__,_/_/\\_\\    ");
        System.out.println("\t\t\t\t =================       ");
        System.out.println("\n\n");

        System.out.println("\t\t\t\t [1] Rent Tax\n");
        System.out.println("\t\t\t\t [2] Income Tax\n");
        System.out.println("\t\t\t\t [3] payble Tax\n");
        System.out.println("\t\t\t\t [4] Leasing Tax\n");
        System.out.println("\t\t\t\t [5] Exit\n");
        System.out.println("\n\n");

        System.out.print("Enter an option to continue -> ");
        return input.nextInt();
    }

    public static int getBankSystemOption(){
        Scanner input= new Scanner(System.in);

        System.out.println("\t\t  ____              _        _____           _                            ");
        System.out.println("\t\t |  _ \\            | |      / ____|         | |                          ");
        System.out.println("\t\t | |_) | __ _ _ __ | | __  | (___  _   _ ___| |_ ___ _ __ ___             ");
        System.out.println("\t\t |  _ < / _' | '_ \\| |/ /   \\___ \\| | | / __| __/ _ \\ '_  '_ \\       ");
        System.out.println("\t\t | |_) | (_| | | | |   <    ____) | |_| \\__ \\ ||  __/ | | | | |         ");
        System.out.println("\t\t |____/ \\__,_|_| |_|_|\\_\\  |_____/ \\__, |___/\\_\\_\\__|_| |_| |_|    ");
        System.out.println("\t\t                                     _/ |                                 ");
        System.out.println("\t\t                                    |__/                                  ");
        System.out.println("\t\t ==============================================================           ");

        System.out.println("\n");
        System.out.println("\t\t\t [1] Deposit \t\t\t [2] Loans\n");
        System.out.println("\t\t\t [3] Tax \t\t\t [4] Share Market\n");
        System.out.println("\t\t\t [5] Exit \n");

        System.out.print("Enter an option to continue -> ");
        return input.nextInt();
    }

    public static int getDepositOption(){
        Scanner input= new Scanner(System.in);

        System.out.println("\t\t\t  _____                       _ _                            ");
        System.out.println("\t\t\t |  __ \\                     (_) |                    ");
        System.out.println("\t\t\t | |  | | ___ _ __   ___  ___ _| |_                 ");
        System.out.println("\t\t\t | |  | |/ _ \\ '_ \\ / _ \\/ __| | __|               ");
        System.out.println("\t\t\t | |__| |  __/ |_) | (_) \\__ \\ | |_                          ");
        System.out.println("\t\t\t |_____/ \\___| .__/ \\___/|___/_|\\ __|                         ");
        System.out.println("\t\t\t             | |                                       ");
        System.out.println("\t\t\t             |_|                                       ");
        System.out.println("\t\t\t ====================================\n");

        System.out.println("\t\t\t\t [1] Savings Account\n");
        System.out.println("\t\t\t\t [2] Fixed Deposit\n");
        System.out.println("\t\t\t\t [3] Exit\n");

        System.out.print("Enter an option to continue -> ");
        return input.nextInt();
    }

    public static void savingsAccount(){
        Scanner input= new Scanner(System.in);

        double savingsAmount;
        do{
            System.out.println("\t\t 	   ______             _                                                     _                ");
            System.out.println("\t\t\t  /  ____|           (_)                     /\\                            | |                ");
            System.out.println("\t\t\t |  (___   __ ___   ___ _ __   __ _ ___     /  \\   ___ ___ ___  _   _ _ __ | |_               ");
            System.out.println("\t\t\t  \\___  \\ / _' \\ \\ / / | '_ \\ / _' / __|   / /\\ \\ / __/ __/ _ \\| | | | '_ \\| __|      ");
            System.out.println("\t\t\t  ____)  | (_| |\\ V /| | | | | (_| \\__ \\  / ___  \\ (_| (_| (_) | |_| | | | | |_            ");
            System.out.println("\t\t\t |______/ \\__,_| \\_/ |_|_| |_|\\__, |___/ /_/    \\_\\__ \\___\\___/ \\__,_|_| |_|\\__|      ");
            System.out.println("\t\t\t                               __/ |                                                           ");
            System.out.println("\t              	                              |___/                                              ");
            System.out.println("\t\t\t ===============================================================================               ");
            System.out.println("\n\n");

            System.out.print("\t\t\t Enter  Your Amount (Enter -1 to exit) : ");
            savingsAmount =  input.nextDouble();
            System.out.println("\n");
            double yearlySavingsInterest = 1;
            double monthlySavingsInterest = 1;
            if (savingsAmount == -1) {return;}
            if(savingsAmount<0){
                System.out.println("\t\t\t\t\t Invalid input...");
                continue;
            }else{
                monthlySavingsInterest =  savingsAmount * 0.05;
                yearlySavingsInterest =  monthlySavingsInterest*12;
                System.out.println("\t\t\t The interest you get per month\t : "+monthlySavingsInterest);
                System.out.println("\n\t\t\t The interest you get per year\t : "+yearlySavingsInterest);
            }
            return;
        }while(true);
    }

    public static void fixedDeposit(){
        Scanner input =  new Scanner(System.in);

        int years =0;
        double fixedAmount =0;

        do{
            System.out.println("\t\t\t  ______  _              _        _                      _ _                     ");
            System.out.println("\t\t\t |  _____(_)            | |      | |                    (_) |                    ");
            System.out.println("\t\t\t | |__    ___  _____  __| |    __| | ___ _ __   ___  ___ _| |_                   ");
            System.out.println("\t\t\t |  __|  | \\ \\/ / _ \\/ _' |   / _  |/ _ \\ '_ \\ / _ \\/ __| | __|            ");
            System.out.println("\t\t\t | |     | |>  <  __/ (_| |  | (_| |  __/ |_) | (_) \\__ \\ | |_                 ");
            System.out.println("\t\t\t |_|     |_/_/\\_\\___|\\__,_|   \\__,_|\\___| .__/ \\___/|___/_|\\__|           ");
            System.out.println("\t\t\t                                        | |                                      ");
            System.out.println("\t\t\t                                        |_|                                      ");
            System.out.println("\t\t\t =================================================================               ");
            System.out.println("\n\n");

            System.out.print("\t\t\t Your Amount (Enter -1 to Exit)\t\t : ");
            fixedAmount = input.nextDouble();
            System.out.println("\n");
            double monthlyFixedInterest=1;
            double endAmount=0;

            if (fixedAmount == -1) {
                return;
            }
            if(fixedAmount<0){
                System.out.println("\n\t\t\t\t Invalid Input for amount...");
                continue;
            }else{
                System.out.print("\t\t\t Enter the number of year : ");
                years = input.nextInt();
                if(years<0){
                    System.out.println("\n\t\t\t\t Invalid input for years...");
                    System.out.println("\n\n");
                    continue;
                }else{
                    monthlyFixedInterest = fixedAmount * 0.08;
                    endAmount = (monthlyFixedInterest * 12 * years) + fixedAmount;
                    System.out.println("\n\t\t\t Interest you get per Month\t : "+monthlyFixedInterest);
                    System.out.println("\n\t\t\t Total amount at the end\t : "+endAmount);
                }
            }
            return;
        }while(true);
    }
    public static int getLoanOption(){
        Scanner input = new Scanner(System.in);

        System.out.println("\t\t\t  _                               ");
        System.out.println("\t\t\t | |                              ");
        System.out.println("\t\t\t | |     ___   __ _ _ __          ");
        System.out.println("\t\t\t | |    / _ \\ / _' | '_ \\         ");
        System.out.println("\t\t\t | |___| (_) | (_| | | | |        ");
        System.out.println("\t\t\t |______\\___/ \\__,_|_| |_|        ");
        System.out.println("\t\t\t ===========================       ");

        System.out.println("\n");

        System.out.println("\t\t\t [1] Personal Loan \n");
        System.out.println("\t\t\t [2] Business Loan \n");
        System.out.println("\t\t\t [3] Home equity Loan \n");
        System.out.println("\t\t\t [4] Car Finance \n");
        System.out.println("\t\t\t [5] Exit \n");

        System.out.print("Enter an option to continue -> ");
        return input.nextInt();
    }

    public static void personalLoan(){
        Scanner input =  new Scanner(System.in);

        double personalLoanSalary=0;
        double personalLoanWithdrawalAmount=0;
        int personalLoanMonths=0;
        do{
            System.out.println("\t\t\t  _____                                _    _                                 ");
            System.out.println("\t\t\t |  __ \\                              | |  | |                                 ");
            System.out.println("\t\t\t | |__) |__ _ __ ___  ___  _ __   __ _| |  | |     ___   __ _ _ __         ");
            System.out.println("\t\t\t |  ___/ _ \\ '__/ __|/ _ \\| '_ \\ / _' | |  | |    / _ \\ / _' | '_ \\        ");
            System.out.println("\t\t\t | |  |  __/ |  \\__ \\ (_) | | | | (_| | |  | |___| (_) | (_) | | | |        ");
            System.out.println("\t\t\t |_|   \\___|_|  |___/\\___/|_| |_|\\__,_|_|  |_____ \\___/ \\__,_|_| |_|       ");
            System.out.println("\t\t\t ====================================================================      ");
            System.out.println("\n");

            System.out.print("\t\t\t Enter your Salary (Enter -1 to Exit)\t : ");
            personalLoanSalary = input.nextDouble();
            System.out.println("\n");

            if (personalLoanSalary == -1) {
                return;
            }
            if(personalLoanSalary < 0 ){
                System.out.println("\t\t\t invalid salary input...");
                continue;
            }else if(personalLoanSalary < 50000){
                System.out.println("\t\t\t You cannot get a loan...");
                return;
            }else{
                double maximumAmuont = personalLoanSalary * 5;
                System.out.println("\t\t\t\t\t The maximun amount you can withdraw is "+maximumAmuont);
                System.out.println("\n");
                System.out.print("\t\t\t Enter your amount \t : ");
                personalLoanWithdrawalAmount = input.nextDouble();
                System.out.println("\n");
                if(personalLoanWithdrawalAmount<0){
                    System.out.println("\t\t\t\t invalid input for withdrawal amount");
                    continue;
                }else if(personalLoanWithdrawalAmount<=maximumAmuont){
                    System.out.print("\t\t\t Enter the number of months\t : ");
                    personalLoanMonths =  input.nextInt();
                    double monthlyInstalment  = 0;
                    if(personalLoanMonths<0){
                        System.out.println("\n\t\t\t Invalud input for months...\n\n");
                        continue;
                    }else if(personalLoanWithdrawalAmount > 200000 & personalLoanMonths >24){
                        monthlyInstalment = personalLoanWithdrawalAmount * 0.15 + personalLoanWithdrawalAmount/personalLoanMonths ;
                        System.out.printf("\n\t\t\t Your monthly instalment\t : %.2f",monthlyInstalment);
                    }else if(personalLoanWithdrawalAmount < 200000 & personalLoanMonths < 24){
                        monthlyInstalment = personalLoanWithdrawalAmount * 0.1 + personalLoanWithdrawalAmount/personalLoanMonths ;
                        System.out.printf("\n\t\t\t Your monthly instalment\t : %.2f",monthlyInstalment);
                    }
                }else {
                    System.out.println("\t\t\t Invalid...\n\n ");
                }
            }
            System.out.println("\n\n\n");
            return;
        }while(true);
    }

    public static void businessLoan(){
        Scanner input = new Scanner(System.in);

        double businessLoanSalary=0;
        double businessLoanWithdrawalAmount=0;
        int businessLoanMonths =0;

        do {
            System.out.println("\t\t\t  ____            _                        _                                ");
            System.out.println("\t\t\t |  _ \\          (_)                      | |                               ");
            System.out.println("\t\t\t | |_) |_   _ ___ _ _ __   ___  ___ ___   | |     ___   __ _ _ __           ");
            System.out.println("\t\t\t |  _ <| | | / __| | '_ \\ / _ \\/ __/ __|  | |    / _ \\ / _' | '_ \\        ");
            System.out.println("\t\t\t | |_) | |_| \\__ \\ | | | |  __/\\__ \\__ \\  | |___| (_) | (_| | | | |       ");
            System.out.println("\t\t\t |____/ \\__,_|___/_|_| |_|\\___||___/___/  |_____ \\___/ \\__,_|_| |_|         ");
            System.out.println("\t\t\t ===================================================================        ");
            System.out.println("\n");

            System.out.print("\t\t\t Enter your Income (Enter -1 to Exit)\t : ");
            businessLoanSalary = input.nextDouble();
            System.out.println("\n");
            if (businessLoanSalary == -1) {
                return;
            }
            if (businessLoanSalary < 0) {
                System.out.println("\t\t\t invalid input...");
                continue;
            } else if (businessLoanSalary < 50000) {
                System.out.println("\t\t\t You cannot get a loan...");
                return;
            } else {
                double maximumAmount = businessLoanSalary * 5;
                System.out.println("\t\t\t\t\t The maximun amount you can withdraw is " + maximumAmount);
                System.out.println("\n");
                System.out.print("\t\t\t Enter your amount \t : ");
                businessLoanWithdrawalAmount = input.nextDouble();
                System.out.println("\n");
                if (businessLoanWithdrawalAmount < 0) {
                    System.out.println("\n\t\t\t\t invalid input for withdrawal amount...");
                    continue;
                } else if (businessLoanWithdrawalAmount <= maximumAmount) {
                    System.out.print("\t\t\t Enter the number of months\t : ");
                    businessLoanMonths = input.nextInt();
                    double monthlyInstalment = 1;
                    if (businessLoanMonths < 0) {
                        System.out.println("\t\t\t\t invalid input for months...");
                        continue;
                    } else if (businessLoanWithdrawalAmount > 500000 & businessLoanMonths > 36) {
                        monthlyInstalment = businessLoanWithdrawalAmount * 0.2 + businessLoanWithdrawalAmount / businessLoanMonths;
                        System.out.printf("\n\t\t\t Your monthly instalment\t : %.2f", monthlyInstalment);
                    } else if (businessLoanWithdrawalAmount < 500000 & businessLoanMonths < 36) {
                        monthlyInstalment = businessLoanWithdrawalAmount * 0.15 + businessLoanWithdrawalAmount / businessLoanMonths;
                        System.out.printf("\n\t\t\t Your monthly instalment\t : %.2f", monthlyInstalment);
                    }
                }
            }
            System.out.println("\n");
            return;
        }while (true);
    }

    public static void homeEqualityLoan(){
        Scanner input =  new Scanner(System.in);
        double salaryHL= 0;
        double withdrawalAmountHL =0;
        int monthsHL =0;

        do {
            System.out.println("\t\t\t  _    _                                          _ _            _     ");
            System.out.println("\t\t\t | |  | |                                        (_) |          | |    ");
            System.out.println("\t\t\t | |__| | ___  _ __ ___   ___     ___  __ _ _   _ _| |_ _   _   | |      ___   __ _ _ __ ");
            System.out.println("\t\t\t |  __  |/ _ \\| '_ ' _ \\ / _ \\   / _ \\/ _' | | | | | __| | | |  | |     / _ \\ / _' | '_ \\    ");
            System.out.println("\t\t\t | |  | | (_) | | | | | |  __/  |  __/ (_| | |_| | | |_| |_| |  | |____| (_) | (_| | | | | ");
            System.out.println("\t\t\t |_|  |_|\\___/|_| |_| |_|\\___|   \\___|\\__  |\\__,_|_|\\__|\\__, |  |______ \\___/ \\__,_|_| |_|");
            System.out.println("\t\t\t                                         | |             __/ |    ");
            System.out.println("\t\t\t                                         |_|            |___/                                      ");
            System.out.println("\t\t\t================================================================================================== ");
            System.out.println("\n");

            System.out.print("\t\t\t Enter your Salary (Enter -1 to Exit)\t : ");
            salaryHL = input.nextDouble();
            System.out.println("\n");
            if (salaryHL == -1) {
                return;
            }
            if(salaryHL < 0 ){
                System.out.println("\t\t\t invalid salary input...");
                continue;
            }else if(salaryHL < 50000){
                System.out.println("\t\t\t You cannot get a loan...");
            }else{
                double maximumAmount = salaryHL * 5;
                System.out.println("\t\t\t\t\t The maximun amount you can withdraw is "+maximumAmount);
                System.out.println("\n");
                System.out.print("\t\t\t Enter your amount \t : ");
                withdrawalAmountHL = input.nextDouble();
                System.out.println("\n");
                if(withdrawalAmountHL <0){
                    System.out.println("\n\t\t\t\t invalid input for withdrawal amount...");
                    continue;
                }else if(withdrawalAmountHL <=maximumAmount){
                    System.out.print("\t\t\t Enter the number of months\t : ");
                    monthsHL =  input.nextInt();
                    double monthlyInstalment  = 1;
                    if(monthsHL < 0){
                        System.out.println("\t\t\t invalid input for months...");
                        continue;
                    }else if(withdrawalAmountHL > 500000 & monthsHL <48){
                        monthlyInstalment = withdrawalAmountHL * 0.08 + withdrawalAmountHL /monthsHL ;
                        System.out.printf("\n\t\t\t Your monthly instalment\t : %.2f",monthlyInstalment);
                    }else if(withdrawalAmountHL < 500000 & monthsHL < 48){
                        monthlyInstalment = withdrawalAmountHL * 0.06 + withdrawalAmountHL /monthsHL ;
                        System.out.printf("\n\t\t\t Your monthly instalment\t : %.2f",monthlyInstalment);
                    }
                }else {
                    System.out.println("\t\t\t Invalid withdrawal amount");
                }
            }
            System.out.println("\n");
            return;
        } while (true);
    }

    public static void financeLoan(){
        Scanner input = new Scanner(System.in);

        double value = 0;
        int financeLoanMonths = 0;
        do {
            System.out.println("\t\t\t  ______ _                               _                                    ");
            System.out.println("\t\t\t |  ____(_)                             | |                             ");
            System.out.println("\t\t\t | |__   _ _ __   __ _ _ __   ___ ___   | |     ___   __ _ _ __        ");
            System.out.println("\t\t\t |  __| | | '_ \\ / _' | '_ \\ / __/ _ \\  | |    / _ \\ / _' | '_ \\    ");
            System.out.println("\t\t\t | |    | | | | | (_| | | | | (_|  __/  | |___| (_) | (_) | | | |      ");
            System.out.println("\t\t\t |_|    |_|_| |_|\\__,_|_| |_|\\___\\___|  |______\\___/ \\__,_|_| |_|          ");
            System.out.println("\t\t\t ==================================================================      ");
            System.out.println("\n");

            System.out.print("\t\t\t Enter the value of the vehicle (Enter -1 to Exit)\t : ");
            value = input.nextDouble();
            double monthlyInstalment =0;
            if (value == -1) {
                return;
            }
            if(value<0){
                System.out.println("\n\t\t\t\t invalid input...");
                continue;
            }else{
                System.out.print("\n\t\t\t Enter the number of months\t : ");
                financeLoanMonths = input.nextInt();
                if(financeLoanMonths<0){
                    System.out.println("\n\t\t\t\t invalid input...");
                    continue;
                }else if(financeLoanMonths<=12){
                    monthlyInstalment = value * 0.06 + value / financeLoanMonths;
                    System.out.printf("\n\t\t\t Your monthly instalment \t: %.2f ", monthlyInstalment);
                }else if(financeLoanMonths<=24 ){
                    monthlyInstalment = value * 0.1 + value / financeLoanMonths;
                    System.out.printf("\n\t\t\t Your monthly instalment \t: %.2f ", monthlyInstalment);
                }else if(financeLoanMonths<=36 ){
                    monthlyInstalment = value * 0.14 + value / financeLoanMonths;
                    System.out.printf("\n\t\t\t Your monthly instalment \t: %.2f ", monthlyInstalment);
                }else{
                    monthlyInstalment = value * 0.16 + value / financeLoanMonths;
                    System.out.printf("\n\t\t\t Your monthly instalment \t: %.2f ", monthlyInstalment);
                }
            }
            System.out.println("\n");
            return;
        } while (true);
    }
}
