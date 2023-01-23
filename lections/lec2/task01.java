import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class task01 {

    public static void main(String[] args) {
        int teamCount = 10;
        Random rand = new Random();

        List<HeroBase> teams = new ArrayList<>();
        for (int i = 0; i < teamCount; i++) {
            int val = rand.nextInt(4);
            switch (val) {
                case 0:
                    teams.add(new Priests());
                    break;
                case 1:
                    teams.add(new Mag());
                    break;
                case 2:
                    teams.add(new Druid());
                    break;
                default:
                    // teams.add(new HeroBase());
                    break;
            }
            System.out.println(teams.get(i).getInfo());

        }

        System.out.println();

        // #endregion
        // #region

        Mag magician = new Mag(); System.out.println(magician);
        Priests priest = new Priests(); System.out.println(priest);
        Druid druid = new Druid(); System.out.println(druid);

        

        // #endregion

    }
}
    

