package Pertemuan2;
public class Dragon {
    private int x;
    private int y;
    private int width;
    private int height;

    public Dragon(int initialX, int initialY, int width, int height) {
        this.x = initialX;
        this.y = initialY;
        this.width = width;
        this.height = height;
    }

    public void moveLeft() {
        x = Math.max(x - 1, 0);
        detectCollision();
    }

    public void moveRight() {
        x = Math.min(x + 1, width - 1);
        detectCollision();
    }

    public void moveUp() {
        y = Math.max(y + 1, 0);
        detectCollision();
    }

    public void moveDown() {
        y = Math.min(y - 1, height - 1);
        detectCollision();
    }

    public void printPosition() {
        System.out.println("Dragon position: (" + x + ", " + y + ")");
    }

    public void detectCollision() {
        if (x <= 0 || x >= width || y <= 0 || y >= height) {
            System.out.println("Dragon collided with the boundary!");
            // Handle collision logic here
        }
    }


}

