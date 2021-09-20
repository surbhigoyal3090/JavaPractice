package com.company;

public class Printer {
    private int tonerLevel;
    private int numberOfPagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if(tonerLevel >=0 && tonerLevel <=100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }

        this.duplex = duplex;
        this.numberOfPagesPrinted = 0;
    }

    public int addToner(int tonerAmount) {
        if(tonerAmount >0 && tonerAmount <=100) {
            if(this.tonerLevel + tonerAmount >100) {
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        } else {
            return -1;
        }
    }

    public int printPages(int pages) {
        int pagesToPrint = pages;
        if(this.duplex) {
            pagesToPrint = (pages / 2) + (pages % 2);
        }
        this.numberOfPagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getNumberOfPagesPrinted() {
        return numberOfPagesPrinted;
    }
}
