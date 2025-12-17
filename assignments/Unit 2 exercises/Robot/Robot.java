public class Robot {


    private int[] hallway;
    private int position;
    private boolean isFacingRight;

    public Robot(int[] hallwayToClean, int startingPosition) {

        if (hallwayToClean == null || hallwayToClean.length == 0) {
            this.hallway = new int[0];
            this.position = 0;
            this.isFacingRight = true;
            return;
        }


        this.hallway = new int[hallwayToClean.length];
        for (int i = 0; i < hallwayToClean.length; i++) {
            this.hallway[i] = Math.max(0, hallwayToClean[i]);
        }


        if (startingPosition < 0) {
            this.position = 0;
        } else if (startingPosition >= this.hallway.length) {
            this.position = this.hallway.length - 1;
        } else {
            this.position = startingPosition;
        }


        this.isFacingRight = true;
    }


    public int[] getHallway() {

        int[] copy = new int[this.hallway.length];
        System.arraycopy(this.hallway, 0, copy, 0, this.hallway.length);
        return copy;
    }

    public void setHallway(int[] newHallway) {
        if (newHallway == null || newHallway.length == 0) {
            this.hallway = new int[0];
            this.position = 0;
            return;
        }
        this.hallway = new int[newHallway.length];
        for (int i = 0; i < newHallway.length; i++) {
            this.hallway[i] = Math.max(0, newHallway[i]);
        }

        if (this.position < 0) {
            this.position = 0;
        }
        if (this.position >= this.hallway.length) {
            this.position = this.hallway.length - 1;
        }
    }

    public int getPosition() {
        return this.position;
    }

    public void setPosition(int newPosition) {
        if (this.hallway.length == 0) {
            this.position = 0;
            return;
        }
        if (newPosition < 0) {
            this.position = 0;
        } else if (newPosition >= this.hallway.length) {
            this.position = this.hallway.length - 1;
        } else {
            this.position = newPosition;
        }
    }

    public boolean isFacingRight() {
        return this.isFacingRight;
    }

    public void setFacingRight(boolean facingRight) {
        this.isFacingRight = facingRight;
    }

    /*
     * Determines if the robot is blocked by a wall (the end of an array)
     * 
     * @return true if the robot is blocked by a wall, false otherwise
     */
    public boolean isRobotBlockedByWall() {
        if (this.hallway.length == 0) {
            // no tiles, consider both ends as walls; robot at position 0
            return true;
        }
        if (this.isFacingRight) {
            return this.position == this.hallway.length - 1;
        } else {
            return this.position == 0;
        }
    }

    /*
     * Commands the robot to pick up an item, move forward or turn around
     */
    public void move() {


        if (this.hallway.length == 0) {

            return;
        }

        if (this.hallway[this.position] > 0) {

            pickup();

            if (this.hallway[this.position] > 0) {
                return;
            }

            if (!isRobotBlockedByWall()) {
                moveForward();
            } else {
                turnAround();
            }
            return;
        }


        if (!isRobotBlockedByWall()) {
            moveForward();
        } else {
            turnAround();
        }

    }

    /**
     * This method displays the current state of the robot and the hallway. It then calls the move()
     * method and counts the number of moves it takes to clear the hallway. The method should
     * display the current state of the robot after each move.
     * 
     * @return the number of moves made
     */

    public int clearHall() {
        int count = 0;

        displayState();


        while (!hallIsClear()) {
            move();
            count++;
            displayState();
        }

        return count;
    }

    /**
     * This method determines if the hallway contains any items.
     * 
     * @return a boolean value indicating if the hallway contains any items
     */
    public boolean hallIsClear() {
        
        for (int v : this.hallway) {
            if (v != 0) {
                return false;
            }
        }
        return true;
    }

    /* Helper methods */
    private void pickup() {
        if (this.hallway.length == 0) {
            return;
        }
        if (this.hallway[this.position] > 0) {
            this.hallway[this.position] -= 1;
        }
    }

    private void turnAround() {
        this.isFacingRight = !this.isFacingRight;
    }

    private void moveForward() {
        if (this.hallway.length == 0) {
            this.position = 0;
            return;
        }
        if (this.isFacingRight) {
            if (this.position < this.hallway.length - 1) {
                this.position++;
            }
        } else {
            if (this.position > 0) {
                this.position--;
            }
        }
    }

    /*
     * Displays the current state of the robot and the hallway.
     */
    public void displayState() {


        if (this.hallway.length == 0) {
            System.out.println("(empty hallway)");

            System.out.println((this.isFacingRight ? ">" : "<"));
            return;
        }

        StringBuilder line = new StringBuilder();
        for (int i = 0; i < this.hallway.length; i++) {
            line.append(this.hallway[i]);
            if (i < this.hallway.length - 1) {
                line.append(" ");
            }
        }
        System.out.println(line.toString());


        StringBuilder marker = new StringBuilder();

        for (int i = 0; i < this.position; i++) {
            marker.append("  ");
        }
        marker.append(this.isFacingRight ? ">" : "<");
        System.out.println(marker.toString());

    }
}
