public class BoohbahDanceTest {
    public static void main(String[] args) {
        Boohbah zingZingZingbah = new Boohbah("Zing Zing Zingbah", "Immenent Destruction");
        Boohbah jingbah = new Boohbah("Jingbah", "Great Death Dance of Fire and Flame");
        Boohbah zumbah = new Boohbah("Zumbah", "Hollow Purple");

        Boohbah[] boohbarray = {zingZingZingbah, jingbah, zumbah};
        DanceRoutine danceRoutine = new DanceRoutine(boohbarray);


        System.out.println("Original routine: \n" + danceRoutine.buildRoutine());
        System.out.println("Modified routine: \n" + danceRoutine.modifyRoutine());
    }
}
