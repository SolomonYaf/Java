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


        boolean CompletedFinalProject = false;
        boolean CompleteGrade = true;
        boolean hasConductIssues = true;

        System.out.println(!hasConductIssues);

        System.out.println((CompleteGrade  && CompletedFinalProject)  || hasConductIssues);



        float savingAmount  = 90_000;
        float creditScore  = 9;

        boolean hasEnoughSaving = 500_000 < savingAmount;
        boolean goodCreditScore = 7< creditScore;
        boolean hasCriminalRecord  = false;
        boolean phoneFullyCharged = false;

        System.out.println(!hasCriminalRecord &&
                (hasEnoughSaving || goodCreditScore || phoneFullyCharged ));









    }
}