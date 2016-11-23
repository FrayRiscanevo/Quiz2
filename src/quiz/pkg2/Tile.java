package quiz.pkg2;

public class Tile {
    private String nameFile;
    private int nPosition;

    public Tile(String nameFile, int nPosition) {
        this.nameFile = nameFile;
        this.nPosition = nPosition;
    }

    public String getNameFile() {
        return nameFile;
    }

    public void setNameFile(String nameFile) {
        this.nameFile = nameFile;
    }

    public int getnPosition() {
        return nPosition;
    }

    public void setnPosition(int nPosition) {
        this.nPosition = nPosition;
    }
    
}
