public class DanceRoutine {
    private Boohbah[] boohbahs;
    
    public DanceRoutine(Boohbah[] boobah_objects) {
        this.boohbahs = boobah_objects;
    }
    
    public String buildRoutine() {
        StringBuilder routine = new StringBuilder();
        for (Boohbah boohbah : boohbahs) {
            routine.append(boohbah.performMove()).append('\n');
        }
        return routine.toString();
    }

    public String modifyRoutine() {
        String routine = this.buildRoutine().replace("performs","dances to");
        return routine;
    }
}
