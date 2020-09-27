package com.javarush.task.task14.task1408;

public class MoldovanHen extends Hen{
    @Override
    public int getCountOfEggsPerMonth(){
        return 17;
    }
    String getDescription(){
        String description = super.getDescription() + " Моя страна - " + Country.MOLDOVA +". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
        return description;
    }
}
