package Pertemuan5;
import java.util.Scanner;

public class CompanyProfit06 {
    public int numCompanies;
    public sum[] companies;

    public CompanyProfit06(int numCompanies) {
        this.numCompanies = numCompanies;
        companies = new sum[numCompanies];
    }
       
    public void setCompany(int index, sum company) {
        companies[index] = company;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah perusahaan: ");
        int numCompanies = sc.nextInt();

        CompanyProfit06 profitCalculator = new CompanyProfit06(numCompanies);

        for (int i = 0; i < numCompanies; i++) {
            System.out.print("Masukkan jumlah bulan untuk perusahaan ke-" + (i + 1) + ": ");
            int months = sc.nextInt();

            sum companyProfit = new sum(months);

            System.out.println("Masukkan keuntungan untuk setiap bulan:");
            for (int j = 0; j < months; j++) {
                System.out.print("Keuntungan bulan ke-" + (j + 1) + ": ");
                companyProfit.keuntungan[j] = sc.nextDouble();
            }

            profitCalculator.setCompany(i, companyProfit);
        }

        System.out.println("\nTotal keuntungan setiap perusahaan:");
        for (int i = 0; i < numCompanies; i++) {
            sum currentCompany = profitCalculator.companies[i];
            System.out.println("Perusahaan ke-" + (i + 1) + ":");
            System.out.println("Total keuntungan (Brute Force): " + currentCompany.totalBF(currentCompany.keuntungan));
            System.out.println("Total keuntungan (Divide and Conquer): " + currentCompany.totalDC(currentCompany.keuntungan, 0, currentCompany.elemen - 1));
            System.out.println();
        }
    }
}
