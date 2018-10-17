package com.epam.mariia_iasakova.java.lesson1.task1;

import java.util.*;

public class ServiceMethodsForArrays {

    public int[] generationArray() {
        int[] array = new int[20];
        for (int j = 0; j < array.length; j++) {
            array[j] = -10 + (int) (Math.random() * 20);
        }
        return array;
    }

    public void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public int searchMaxNegativeElement(int[] orgArray) {
        int element = orgArray[0];
        for (int i = 0; i < orgArray.length; i++) {
            if (orgArray[i] < 0 && orgArray[i] > element)
                element = orgArray[i];
        }
        return element;
    }

    public int seachMinPositiveElement(int[] orgArray) {
        int element = 0;
        for (int i = 0; i < orgArray.length; i++) {
            if (orgArray[i] > 0 && orgArray[i] < element)
                element = orgArray[i];
        }
        return element;
    }

    public int[] replaceElement(int[] orgArray, int maxNegativeElement, int minPositiveElement) {
        int[] array = orgArray.clone();
        for (int i = 0; i < orgArray.length; i++) {
            if (array[i] == maxNegativeElement) {
                array[i] = minPositiveElement;
            } else if (array[i] == minPositiveElement) {
                array[i] = maxNegativeElement;
            }

        }
        return array;
    }

    public int sumElement(int[] orgArray) {
        int sumElement = 0;
        for (int i = 1; i < orgArray.length; i++) {
            if (i % 2 != 0) {
                sumElement += orgArray[i];
            }
        }
        return sumElement;
    }

    public int[] changeNegativeElements(int[] orgArray) {
        int[] Array = orgArray.clone();
        for (int i = 1; i < Array.length; i++) {
            if (Array[i] < 0) {
                Array[i] = 0;
            }
        }
        return Array;
    }

    public int[] increaseElements(int[] orgArray) {
        int[] Array = orgArray.clone();
        for (int i = 1; i < Array.length; i++) {
            if (Array[i] < 0) {
                if (Array[i - 1] > 0) {
                    Array[i - 1] *= 3;
                }
            }
        }
        return Array;
    }

    public int seachMinElement(int[] orgArray) {
        int element = 0;
        for (int i = 1; i < orgArray.length; i++) {
            if (orgArray[i] < element)
                element = orgArray[i];
        }
        return element;
    }

    public int average(int[] orgArray) {
        int element = 0;
        for (int i = 1; i < orgArray.length; i++) {
            element += orgArray[i];
        }
        return (element / orgArray.length);
    }


    public int differenceInElements(int minElement, int averageElement) {
        return (averageElement - minElement);
    }

    public ArrayList<Integer> seachElements(int[] orgArray) {
        ArrayList<Integer> arrayFirst = new ArrayList<Integer>();
        ArrayList<Integer> arraySecond = new ArrayList<Integer>();
        Arrays.sort(orgArray);
        for (int i = 0; i < orgArray.length - 1; i++) {
            if (orgArray[i] == orgArray[i + 1]) {
                arrayFirst.add(orgArray[i]);
            }
        }
        for (int i = 1; i < orgArray.length - 1; i++) {
            if (i % 2 == 0) {
                if (arrayFirst.contains(orgArray[i])) {
                    arraySecond.add(orgArray[i]);
                }
            }
        }
        return arraySecond;
    }

    public void printList(ArrayList<Integer> orgArray) {
        for (int element : orgArray) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

}
