public class Screen {
    private int width, height, pixelBlock, blockX, blockY;

    public Screen(int width, int height, int pixelBlock, int blockX, int blockY) {
        this.width = width;
        this.height = height;
        this.pixelBlock = pixelBlock;
        this.blockX = blockX;
        this.blockY = blockY;
    }

    Screen() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getPixelBlock() {
        return pixelBlock;
    }

    public void setPixelBlock(int pixelBlock) {
        this.pixelBlock = pixelBlock;
    }

    public int getBlockX() {
        return blockX;
    }

    public void setBlockX(int blockX) {
        this.blockX = blockX;
    }

    public int getBlockY() {
        return blockY;
    }

    public void setBlockY(int blockY) {
        this.blockY = blockY;
    }
    
}
