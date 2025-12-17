public class DecompositionSolution {
    public static void run() {
        int[] hours = hoursArray();
        int[] steps = stepsArray();
        int[] activeMinutes = activeMinutesArray();

        if(!lengthValidator(hours, steps, activeMinutes)){
            System.out.println("Invalid input: arrays must be the same length");
        }
    }

    public static int[] hoursArray() {
        return new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
    }

    public static int[] stepsArray() {
        return new int[] {120, 90, 60, 50, 80, 300, 1200, 2200, 2800, 2500, 1800, 900};
    }

    public static int[] activeMinutesArray() {
        return new int[] {2, 1, 0, 0, 1, 10, 35, 50, 55, 48, 32, 15};
    }

    public static boolean lengthValidator(int[] hour, int[] steps, int[] activeMinutes) {
        return hour.length == steps.length && steps.length == activeMinutes.length;
    }

    public static int sum(int[] array){
        int sumTotal = 0;
        for (int i = 0; i <array.length; i++){
            sumTotal += array[i];
        }

        return sumTotal;
    }

    public static double avgSteps(int[] array){
        return DecompositionSolution.sum(array)/array.length;
    }

    public static int minSteps(int [] array){
        int min = array[0];
        for (int num: array){
            if(num < min){
                min = num;
            }
        }
        return min;
    }

    public static int maxSteps(int [] array){
        int max = array[0];
        for (int num: array){
            if(num > max){
                max = num;
            }
        }
        return max;
    }

    public static int maxStepsHour(int [] array){
        int max = array[0];
        int maxhour = 0;
        for (int i = 0; i< array.length; i++){
            if(array[i] > max){
                max = array[i];
                maxhour = i;
            }
        }
        return maxhour;
    }

    public static int minStepsHour(int [] array){
        int min = array[0];
        int minhour = 0;
        for (int i = 0; i< array.length; i++){
            if(array[i] < max){
                min = array[i];
                minhour = i;
            }
        }
        return minhour;
    }

    public static double activeMinutesSum(int[] array){
        return DecompositionSolution.sum(array);
    }
    public static double avgActiveMinutes(int [] array){
        return DecompositionSolution.avgSteps(array);
    }
    public static int activeHalfHourCount(int [] array){
       
        int activeHourCount = 0; // >= 30 minutes counts as active hour
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 30) {
                activeHourCount += 1;
            }
        }

        return activeHourCount;
    }

    public static int sumMorning(int [] sum){
        int sumMorning = 0;
        for (int i = 0; i <= 3; i++) {
            sumMorning += sum[i];
        }
        return sumMorning;
    }

    public static int sumMidday(int [] sum){
        int sumMidday = 0;
        for (int i = 4; i <= 7; i++) {
            sumMidday += sum[i];
        }
        return sumMidday;
    }

    public static int sumAfternoon(int [] sum){
        int sumMidday = 0;
        for (int i = 8; i <= 11; i++) {
            sumMidday += sum[i];
        }
        return sumMidday;
    }

    public static double avgMorning(int[] sum){

        return DecompositionSolution.sumMorning(sum)/sum.length;
    }

    public static double avgMidday(int[] sum){

        return DecompositionSolution.sumMidday(sum)/sum.length;
    }

    public static double avgAfternoon(int[] sum){

        return DecompositionSolution.sumAfternoon(sum)/sum.length;
    }

    public static String toString(int[] steps, int[] hours, int[] activeMinutes){
        int added = DecompositionSolution.sum(steps);
        double avgSteps = DecompositionSolution.avgSteps(steps);
        int maxSteps = maxSteps(steps);
        int minSteps = minSteps(steps);
        int maxStepsHour = maxStepsHour(steps);
        double totalActiveMinutes = activeMinutesSum(activeMinutes);
        
        StringBuilder sb = new StringBuilder();
        sb.append("=== Daily Steps Report (Demo) ===");
        sb.append("Hours recorded: " + steps.length);
        System.out.println("Total steps: " + added);
        System.out.println("Average steps/hour: " + DecompositionDemo.round2(avgSteps));
        System.out.println("Min steps in an hour: " + minSteps);
        System.out.println("Max steps in an hour: " + maxSteps + " at hour " + maxStepsHour);
        System.out.println("Total active minutes: " + totalActiveMinutes);
        System.out.println("Average active minutes/hour: " + round2(avgActiveMinutes));
        System.out.println("Active hours (>=30 min): " + activeHourCount);
        System.out.println("Average steps - Morning(0-3): " + round2(avgMorning));
        System.out.println("Average steps - Midday(4-7): " + round2(avgMidday));
        System.out.println("Average steps - Afternoon(8-11): " + round2(avgAfternoon));

        // Hourly lines
        System.out.println("--- Hourly (h, steps, activeMin) ---");
        for (int i = 0; i < n; i++) {
            System.out.println(hours[i] + ", " + steps[i] + ", " + activeMinutes[i]);
        }
    }
    }

}
