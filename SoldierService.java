package home_work97;

import java.util.ArrayList;

public class SoldierService {

    public SoldierService(){
    }

    public int calcSoldierAvgAge(ArrayList<Soldier> soldiers) {

        int sumAge = calcSoldierSumAge(soldiers);
        int avgAge = sumAge/soldiers.size();
        System.out.println("avg soldiers age is:"+avgAge);
        return avgAge;
    }

    public int calcSoldierSumAge(ArrayList<Soldier> soldiers) {
        int sumAge = 0;

        for (int i =0; i< soldiers.size(); i++) {
            sumAge = sumAge + soldiers.get(i).getAge();
        }

         System.out.println("sum soldiers age is:"+sumAge);
        return sumAge;
    }

    public int calcSoldierMaxAge(ArrayList<Soldier> soldiers) {
        int maxAge = soldiers.get(0).getAge();

        for (int i =1; i < soldiers.size(); i++) {

            if (maxAge < soldiers.get(i).getAge()){
                maxAge = soldiers.get(i).getAge();
            }
        }
        System.out.println("max soldiers age is:"+maxAge);
        return maxAge;
    }
}
