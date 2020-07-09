package home_work97;

import java.util.ArrayList;
import java.util.List;

public class MyTest {
          public static void main(String[] args) {
              ArrayList <Soldier> soldiers =new ArrayList<>();
              soldiers.add(new Soldier(23));
              soldiers.add(new Soldier(24));
              soldiers.add(new Soldier(26));
              soldiers.add(new Soldier(28));
              soldiers.add(new Soldier(21));
              soldiers.add(new Soldier(22));

              SoldierService soldierService = new SoldierService();
              int soldierAvgAge = soldierService.calcSoldierAvgAge(soldiers);
              int soldierMaxAge = soldierService.calcSoldierMaxAge(soldiers);
          }
}
