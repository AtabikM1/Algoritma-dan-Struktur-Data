package Pertemuan2;

public class Dragonmain {
    public static void main(String[] args) {
        // Example usage
        Dragon dragon = new Dragon(5, 5, 10, 10);
        dragon.printPosition();

        dragon.moveLeft();
        dragon.moveLeft();
        dragon.moveLeft();
        dragon.moveLeft();
        dragon.moveLeft();
        dragon.moveLeft();
        dragon.moveLeft();
        dragon.moveLeft();
        dragon.printPosition();

        dragon.moveUp();
        dragon.moveUp();
        dragon.moveUp();
        dragon.moveUp();
        dragon.moveUp();
        dragon.moveUp();
        dragon.moveUp();
        dragon.moveUp();
        dragon.moveUp();
        dragon.moveUp();
        dragon.moveUp();
        dragon.printPosition();

        dragon.moveRight();
        dragon.moveRight();
        dragon.moveRight();
        dragon.moveRight();
        dragon.moveRight();
        dragon.moveRight();
        dragon.moveRight();
        dragon.printPosition();

        dragon.moveDown();
        dragon.moveDown();
        dragon.moveDown();
        dragon.moveDown();
        dragon.moveDown();
        dragon.moveDown();
        dragon.moveDown();
        dragon.printPosition();

        
    }
}
