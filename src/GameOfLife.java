import java.util.Random;

public class AB411_05_GameOfLife {

    // Global definierte Konstanten für die beiden Dimensionen
    private final static int DIM1 = 12;
    private final static int DIM2 = 12;

    // Liefert eine zufällig initialisierte Welt
    private boolean[][] initWelt() {

        Random


    }


    // Gibt die aktuelle Welt aus
    private void zeigeWelt(boolean[][] welt) {

        // TODO

    }

    // Wendet die 4 Regeln an und gibt die Folgegeneration wieder zurück
    private boolean[][] wendeRegelnAn(boolean[][] welt) {

        // TODO

    }

    // Liefert Anzahl Nachbarn einer Zelle
    private int anzahlNachbarn(boolean[][] welt, int x, int y) {
        int returnValue = 0;
        for (int i = x - 1; i <= x + 1; ++i)
            for (int j = y - 1; j <= y + 1; ++j)
                if (welt[i][j])
                    returnValue += 1;
        // einen Nachbarn zuviel mitgezählt?
        if (welt[x][y])
            returnValue -= 1;
        return returnValue;
    }

    public static void main(String[] args) {

        AB411_05_GameOfLife game = new AB411_05_GameOfLife();

        // Welt initialisieren
        boolean[][] welt = game.initWelt();

        System.out.println("Startkonstellation");
        game.zeigeWelt(welt);

        for (int i = 1; i <= 100; i++) {
            welt = game.wendeRegelnAn(welt);
            System.out.println("Generation " + i);
            game.zeigeWelt(welt);
        }
    }
}