import java.util.ArrayList;

public class Shelter {
    // instance variables
    private Dog[][] kennels;
    private boolean isInsideFunction;

    // constructors
    public Shelter(int rows, int cols) {
        // to-do: implement this constructor
        if (rows < 0 || cols < 0) {
            throw new IllegalArgumentException("cannot have negative rows or cols");
        }
        this.kennels = new Dog[rows][cols];
        this.isInsideFunction = false;
    }

    /* initializes kennels as a 3x3 2D array */
    public Shelter() {
        kennels = new Dog[3][3];
    }

    // getters and setters
    public Dog[][] getKennels() {
        return kennels;
    }

    public void setKennels(Dog[][] kennels) {
        this.kennels = kennels;
    }

    // methods

    /*
     * prints out the 2D array 'kennels', displaying the dog's info if the kennel is occupied, or
     * 'empty' if the kennel is empty
     */
    public void displayStatus() {
        for (Dog[] row : kennels) {
            for (Dog animal : row) {
                if (animal != null) {
                    System.out.print(animal);
                } else {
                    System.out.print("[Empty]");
                }
            }
            System.out.println();
        }
    }

    public void add(Dog animal) {

        // to-do: implement this method
        for (int row = 0; row < kennels.length; row++) {
            for (int col = 0; col < kennels[row].length; col++) {
                if (kennels[row][col] == null) {
                    kennels[row][col] = animal;
                    if (isInsideFunction == false) {
                        break;
                    } else {
                        System.out.println("No empty kennels.");
                    }

                }
            }
        }
    }


    public void add(Dog animal, int row, int col) {
        if (animal == null) {
            throw new IllegalArgumentException("cannot add a null dog");
        }
        if (kennels.length < row || kennels[row].length < col) {
            for (int r = 0; r < kennels.length; r++) {
                for (int c = 0; c < kennels[r].length; c++) {
                    if (kennels[r][c] == null) {
                        kennels[r][c] = animal;

                        break;
                    }
                }
            }
        } else if (kennels[row][col] != null) {
            for (int r = 0; r < kennels.length; r++) {
                for (int c = 0; c < kennels[r].length; c++) {
                    if (kennels[r][c] == null) {
                        kennels[r][c] = animal;
                        break;
                    }
                }
            }
        } else {
            kennels[row][col] = animal;
        }
    }

    public void add(ArrayList<Dog> animals) {
        boolean hasntAddedDog = true;
        for (Dog dog : animals) {
            for (int r = 0; r < kennels.length; r++) {
                for (int c = 0; c < kennels[r].length; c++) {
                    if (hasntAddedDog) {
                        if (kennels[r][c] == null) {
                            kennels[r][c] = dog;
                            hasntAddedDog = false;

                        }
                    }

                }
            }
            hasntAddedDog = true;
        }

    }

    public Dog adopt(int row, int col) {
        if (kennels.length < row || kennels[row].length < col) {
            throw new IllegalArgumentException("cannot adopt a dog with invalid index");
        } else if (kennels[row][col] == null) {
            throw new IllegalArgumentException("cannot adopt nonexistant dog");
        } else {
            kennels[row][col] = null;
        }
        return new Dog();

    }

    public ArrayList<Dog> search(String name) {
        ArrayList<Dog> arrList = new ArrayList<Dog>();
        if (name == null) {
            throw new IllegalArgumentException("cannot find a dog with a null name");
        } else {

            for (int r = 0; r < kennels.length; r++) {
                for (int c = 0; c < kennels[r].length; c++) {
                    String dogName = kennels[r][c].getName();
                    if (dogName.equals(name)) {
                        arrList.add(kennels[r][c]);
                    }
                }
            }
        }
        return arrList;
    }

    public ArrayList<Dog> search(int age) {
        ArrayList<Dog> arrList = new ArrayList<Dog>();
        if (age < 0) {
            throw new IllegalArgumentException("cannot have a dog with a negative age");
        } else {
            for (int r = 0; r < kennels.length; r++) {
                for (int c = 0; c < kennels[r].length; c++) {
                    if (kennels[r][c].getAge() == age) {
                        arrList.add(kennels[r][c]);
                    }
                }
            }
            return arrList;
        }
    }
}
