package Pertemuan5;

import java.util.Scanner;

public class CompanyProfit {
    private int months;
    private double[] profits;

    public CompanyProfit(int months) {
        this.months = months;
        this.profits = new double[months];
    }

    public void setProfit(int month, double profit) {
        profits[month - 1] = profit; // Simpan profit bulan ke-1 di indeks 0, bulan ke-2 di indeks 1, dan seterusnya
    }

    public double totalProfitBF() {
        double total = 0;
        for (double profit : profits) {
            total += profit;
        }
        return total;
    }

    public double totalProfitDC() {
        return totalDC(profits, 0, months - 1);
    }

    private double totalDC(double[] arr, int l, int r) {
        if (l == r) {
            return arr[l];
        } else if (l < r) {
            int mid = (l + r) / 2;
            double lsum = totalDC(arr, l, mid);
            double rsum = totalDC(arr, mid + 1, r);
            return lsum + rsum;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah perusahaan: ");
        int numCompanies = sc.nextInt();

        CompanyProfit[] companies = new CompanyProfit[numCompanies];

        for (int i = 0; i < numCompanies; i++) {
            System.out.print("Masukkan jumlah bulan untuk perusahaan ke-" + (i + 1) + ": ");
            int months = sc.nextInt();
            companies[i] = new CompanyProfit(months);
            
            for (int j = 0; j < months; j++) {
                System.out.print("Masukkan keuntungan untuk bulan ke-" + (j + 1) + " perusahaan ke-" + (i + 1) + ": ");
                double profit = sc.nextDouble();
                companies[i].setProfit(j, profit);
            }
 
        }

        System.out.println("\nTotal keuntungan setiap perusahaan:");
        for (int i = 0; i < numCompanies; i++) {
            System.out.println("Perusahaan ke-" + (i + 1) + ":");
            System.out.println("Total keuntungan (Brute Force): " + companies[i].totalProfitBF());
            System.out.println("Total keuntungan (Divide and Conquer): " + companies[i].totalProfitDC());
            System.out.println();
        }
    }
}