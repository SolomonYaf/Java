package org.example;

import java.util.function.BinaryOperator;

public class Main {
    public static void main(String[] args) {

//        int age = 16;
//       boolean isAdult =  age > 18;
//       boolean isEthiopian  = true;
//       boolean hasCriminalRecord = true;
//
//        System.out.println((isAdult && isEthiopian)|| hasCriminalRecord );

//
//        boolean CompletedFinalProject = false;
//        boolean CompleteGrade = true;
//        boolean hasConductIssues = true;
//
//        System.out.println(!hasConductIssues);
//
//        System.out.println((CompleteGrade  && CompletedFinalProject)  || hasConductIssues);
//
//
//
//        float savingAmount  = 90_000;
//        float creditScore  = 9;
//
//        boolean hasEnoughSaving = 500_000 < savingAmount;
//        boolean goodCreditScore = 7< creditScore;
//        boolean hasCriminalRecord  = false;
//        boolean phoneFullyCharged = false;
//
//        System.out.println(!hasCriminalRecord &&
//                (hasEnoughSaving || goodCreditScore || phoneFullyCharged ));
//int x=10;
//System.out.println(x++);//10 (11)
//System.out.println(++x);//12
//System.out.println(x--);//12 (11)
//System.out.println(--x);//10
//
//        int x = 8;
//        int y = x++;
//
//        int z = y--;
//        int a  = ++z;
//        System.out.println(a);




       float salary = 70_000;
       int savingDurationInMonth = 5;


        float savingAmount = 100_000;
       float loanAmount = 400_000;


       boolean hasEnoughSaving  = 0.25*(loanAmount) <= savingAmount;

        System.out.println((0.25*(loanAmount) <= savingAmount)?"መበደር ይችላል":"ብድሩን መስጠጥ አንችልም");

        float weight  = 89;





       boolean hasEnoughSalary =  salary >= 70_000;
       boolean hasCriminalRecord = true;
       boolean consecutiveSavingDuration =  savingDurationInMonth >= 6;


        System.out.println(!hasCriminalRecord && consecutiveSavingDuration && (hasEnoughSaving || hasEnoughSalary));










    }
}