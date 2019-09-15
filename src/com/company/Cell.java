package com.company;

public class Cell {
    private int x;
    private int y;
    char cellContent;
    private boolean isShooted;
    private boolean isShipHere;

    public Cell(int x, int y, boolean isShooted, boolean isShipHere) {
        this.x = x;
        this.y = y;
        this.isShooted = isShooted;
        this.isShipHere = isShipHere;

        if (isShipHere && isShooted) {
            this.cellContent = 'x';
        } else {
            if (isShipHere) {
                this.cellContent = 'w';
            } else {
                this.cellContent = '*';
            }

        }
    }
}
