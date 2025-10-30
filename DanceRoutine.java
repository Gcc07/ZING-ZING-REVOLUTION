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

    public String remixRoutine() {
        String routine = this.buildRoutine().replace("performs","dances to");
        StringBuilder remixedRoutine = new StringBuilder();

        remixedRoutine.insert(0,"--- REMIX ---\n");
        remixedRoutine.append(routine);
        remixedRoutine.delete(147, 148);
        remixedRoutine.append("\n" + "(Backwards Boohbah Shuffle!)");
        remixedRoutine.reverse();
        return remixedRoutine.toString();
    }
}
