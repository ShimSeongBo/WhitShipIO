package FunctionalInterfaceTest;

interface Champion {
    void ChampName(String name);
}

class LaneCheck {
    public static Champion getLane(String lane) {
        switch (lane) {
            case "Bottom":
                return new Marksman();
            case "Mid":
                return new Nuker();
            default:
                Champion champion = new Jungle();
                return champion;
        }
    }
}

class Marksman implements Champion {

    @Override
    public void ChampName(String name) {
        System.out.println(name + "바텀 가요!");
    }
}

class Nuker implements Champion {

    @Override
    public void ChampName(String name) {
        System.out.println(name + "미드 가요!");
    }
}

class Jungle implements Champion {

    @Override
    public void ChampName(String name) {
        System.out.println(name + "정글 가요!");
    }
}

public class LOL {
    public static void main(String[] args) {
        Champion champion = LaneCheck.getLane("Bottom");
        System.out.println(champion + "1번"); // name -> null 근데 파라미터가 없는디? 바텀가요?

        champion.ChampName("원딜 마이 ^^");
        System.out.println(champion + "2번"); //원딜마이 ^^

        champion = LaneCheck.getLane("Mid");
        System.out.println(champion + "3번"); //

        champion.ChampName("미드 람머스~");
        System.out.println(champion + "4번");

        champion = LaneCheck.getLane("Anywhere");
        System.out.println(champion + "5번");

        champion.ChampName("아 몰랑~");
        System.out.println(champion + "6번");
    }
}
